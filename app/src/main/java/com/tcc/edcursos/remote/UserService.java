package com.tcc.edcursos.remote;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UserService {
    @GET("aluno-autenticar/{username}/{password}")
    Call<String> login(@Path("username") String username, @Path("password") String password);
}
