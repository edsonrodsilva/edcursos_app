package com.tcc.edcursos.remote;

public class ApiUtils {

    public static final String BASE_URL = "http://edcursos.edsonrodrigues.com.br/api/";

    public static UserService getUserService(){
        return RetrofitClient.getClient(BASE_URL).create(UserService.class);
    }
}
