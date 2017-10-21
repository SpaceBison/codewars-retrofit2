package org.spacebison.codewarsretrofit2;

import org.junit.BeforeClass;
import org.junit.Test;
import org.spacebison.codewarsretrofit2.model.AuthoredChallenge;
import org.spacebison.codewarsretrofit2.model.CodeChallenge;
import org.spacebison.codewarsretrofit2.model.CompletedChallenge;
import org.spacebison.codewarsretrofit2.model.Data;
import org.spacebison.codewarsretrofit2.model.Paged;
import org.spacebison.codewarsretrofit2.model.User;

import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.junit.Assume.assumeThat;

public class CodewarsServiceTest {
    private static final String TEST_EXPERIENCED_USER = "g964";
    private static final String TEST_KATA_ID = "50654ddff44f800200000004";
    private static final String SECRET_USER_JSON = "/secret/user.json";
    private static CodewarsService sService;
    private static TestUser sTestUser;

    @BeforeClass
    public static void setUp() throws Exception {
        sTestUser = TestUser.loadTestUser(SECRET_USER_JSON);
        sService = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(CodewarsService.BASE_URL)
                .client(new OkHttpClient.Builder()
                        .authenticator(new AuthorizationAuthenticator(sTestUser.getApiKey()))
                        .addInterceptor(new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
                            @Override
                            public void log(String message) {
                                System.out.println(message);
                            }
                        }).setLevel(HttpLoggingInterceptor.Level.BODY))
                        .build())
                .build()
                .create(CodewarsService.class);
    }

    @Test
    public void testGetCodeChallenge() throws Exception {
        testGetCodeChallenge(TEST_KATA_ID);
    }

    @Test
    public void testGetUser() throws Exception {
        testGetUser(TEST_EXPERIENCED_USER);
        testGetUser(sTestUser.getName());
    }

    @Test
    public void testGetUserAuthoredChallenges() throws Exception {
        testGetUserAuthoredChallenges(TEST_EXPERIENCED_USER);
        testGetUserAuthoredChallenges(sTestUser.getName());
    }

    @Test
    public void testGetUserCompletedChallenges() throws Exception {
        testGetUserCompletedChallenges(TEST_EXPERIENCED_USER);
        testGetUserCompletedChallenges(sTestUser.getName());
    }

    private void testGetCodeChallenge(String testKataId) throws java.io.IOException {
        Response<CodeChallenge> response = sService.getCodeChallenge(testKataId).execute();
        assumeThat(response.isSuccessful(), is(true));

        CodeChallenge codeChallenge = response.body();
        assertThat(codeChallenge, is(notNullValue()));

        assertThat(codeChallenge.getId(), is(TEST_KATA_ID));
    }

    private void testGetUser(String userName) throws java.io.IOException {
        Response<User> response = sService.getUser(userName).execute();
        assumeThat(response.isSuccessful(), is(true));

        User user = response.body();
        assertThat(user, is(notNullValue()));
        assertThat(user.getUsername(), is(userName));
    }

    private void testGetUserAuthoredChallenges(String name) throws java.io.IOException {
        Response<Data<AuthoredChallenge>> response = sService.getUserAuthoredChallenges(name).execute();
        assumeThat(response.isSuccessful(), is(true));

        Data<AuthoredChallenge> data = response.body();
        assertThat(data, is(notNullValue()));

        List<AuthoredChallenge> authoredChallenge = data.getData();
        assertThat(authoredChallenge, is(notNullValue()));
    }

    private void testGetUserCompletedChallenges(String name) throws java.io.IOException {
        Response<Paged<CompletedChallenge>> response =
                sService.getUserCompletedChallenges(name, 0).execute();
        assumeThat(response.isSuccessful(), is(true));

        Paged<CompletedChallenge> body = response.body();
        assertThat(body, is(notNullValue()));

        List<CompletedChallenge> completedChallenges = body.getData();
        assertThat(completedChallenges, is(notNullValue()));
    }

}