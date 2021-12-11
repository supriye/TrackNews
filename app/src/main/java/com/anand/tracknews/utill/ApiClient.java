package com.anand.tracknews.utill;

import static com.anand.tracknews.model.Contants.BASE_URL;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by prans on 05-03-2018.
 */

public class ApiClient {
    /**
     * Get Retrofit Instance
     */
    private static Retrofit getRetrofitInstance() {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    /**
     * Get API Service
     *
     * @return API Service
     */
    public static ApiResponse getApiService() {
        return getRetrofitInstance().create(ApiResponse.class);
    }
}