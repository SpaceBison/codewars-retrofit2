package org.spacebison.codewarsretrofit2;

import java.io.IOException;

import okhttp3.Authenticator;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

public class AuthorizationAuthenticator implements Authenticator {
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
