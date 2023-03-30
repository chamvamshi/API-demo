package com.example.APIDemo

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("products")
    fun getStatsData() : Call<MyData>

}