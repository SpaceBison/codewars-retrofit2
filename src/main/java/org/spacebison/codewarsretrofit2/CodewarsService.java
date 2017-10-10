package org.spacebison.codewarsretrofit2;


import org.spacebison.codewarsretrofit2.model.AuthoredChallenge;
import org.spacebison.codewarsretrofit2.model.CodeChallenge;
import org.spacebison.codewarsretrofit2.model.CompletedChallenge;
import org.spacebison.codewarsretrofit2.model.Data;
import org.spacebison.codewarsretrofit2.model.Paged;
import org.spacebison.codewarsretrofit2.model.User;

import java.io.IOException;

import okhttp3.Authenticator;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface CodewarsService {
    /**
     * Gets information about a specific user.
     *
     * @param id User ID or username.
     */
    @GET("users/{id}")
    Call<User> getUser(@Path("id") String id);

    /**
     * Gets a list of all code challenges completed by a given user.
     * By default only the first 200 code challenges will be returned.
     * You can page the results using the page param. The param is zero based.
     *
     * @param id   User ID or username.
     * @param page The page.
     */
    @GET("users/{id}/code-challenges/completed")
    Call<Paged<CompletedChallenge>> getUserCompletedChallenges(@Path("id") String id, @Query("page") int page);

    /**
     * Gets a list of all code challenges authored by a given user.
     *
     * @param id User ID or username.
     */
    @GET("users/{id}/code-challenges/authored")
    Call<Data<AuthoredChallenge>> getUserAuthoredChallenges(@Path("id") String id);

    /**
     * Gets information about a specific code challenge (kata).
     *
     * @param id Challenge ID or slug.
     */
    @GET("code-challenges/{id}")
    Call<CodeChallenge> getCodeChallenge(@Path("id") String id);

    class Factory {
        public static CodewarsService create(String apiKey) {
            return new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl("https://www.codewars.com/api/")
                    .client(getClient(apiKey))
                    .build()
                    .create(CodewarsService.class);
        }

        private static OkHttpClient getClient(String apiKey) {
            return new OkHttpClient.Builder()
                    .authenticator(new AuthorizationAuthenticator(apiKey))
                    .build();
        }

        private static class AuthorizationAuthenticator implements Authenticator {
            private final String mAuthorization;

            public AuthorizationAuthenticator(String authorization) {
                mAuthorization = authorization;
            }

            @Override
            public Request authenticate(Route route, Response response) throws IOException {
                return response.request().newBuilder()
                        .addHeader("Authorization", mAuthorization)
                        .build();
            }
        }
    }
}
