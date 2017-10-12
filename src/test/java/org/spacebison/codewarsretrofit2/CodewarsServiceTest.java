package org.spacebison.codewarsretrofit2;

import com.google.gson.Gson;

import org.junit.BeforeClass;
import org.junit.Test;
import org.spacebison.codewarsretrofit2.model.AuthoredChallenge;
import org.spacebison.codewarsretrofit2.model.CodeChallenge;
import org.spacebison.codewarsretrofit2.model.CompletedChallenge;
import org.spacebison.codewarsretrofit2.model.Data;
import org.spacebison.codewarsretrofit2.model.Paged;
import org.spacebison.codewarsretrofit2.model.User;

import java.io.InputStreamReader;
import java.io.Reader;
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
    private static final String SECRET_USER_JSON = "/secret/user.json";
    public static final String TEST_KATA_ID = "multiply";
    private static CodewarsService sService;
    private static TestUser sTestUser;

    @BeforeClass
    public static void setUp() throws Exception {
        try (Reader reader = new InputStreamReader(CodewarsServiceTest.class.getResourceAsStream(SECRET_USER_JSON))) {
            sTestUser = new Gson().fromJson(reader, TestUser.class);
        }
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
    public void getUser() throws Exception {
        String userName = sTestUser.getName();

        Response<User> response = sService.getUser(userName).execute();
        assumeThat(response.isSuccessful(), is(true));

        User user = response.body();
        assertThat(user, is(notNullValue()));
        assertThat(user.getUsername(), is(userName));
    }

    @Test
    public void getUserCompletedChallenges() throws Exception {
        String name = sTestUser.getName();

        Response<Paged<CompletedChallenge>> response =
                sService.getUserCompletedChallenges(name, 0).execute();
        assumeThat(response.isSuccessful(), is(true));

        Paged<CompletedChallenge> body = response.body();
        assertThat(body, is(notNullValue()));

        List<CompletedChallenge> completedChallenges = body.getData();
        assertThat(completedChallenges, is(notNullValue()));
    }

    @Test
    public void getUserAuthoredChallenges() throws Exception {
        String name = sTestUser.getName();

        Response<Data<AuthoredChallenge>> response = sService.getUserAuthoredChallenges(name).execute();
        assumeThat(response.isSuccessful(), is(true));

        Data<AuthoredChallenge> data = response.body();
        assertThat(data, is(notNullValue()));

        AuthoredChallenge authoredChallenge = data.getData();
        assertThat(authoredChallenge, is(notNullValue()));
    }

    @Test
    public void getCodeChallenge() throws Exception {
        Response<CodeChallenge> response = sService.getCodeChallenge(TEST_KATA_ID).execute();
        assumeThat(response.isSuccessful(), is(true));

        CodeChallenge codeChallenge = response.body();
        assertThat(codeChallenge, is(notNullValue()));

        assertThat(codeChallenge.getId(), is(TEST_KATA_ID));
    }

}