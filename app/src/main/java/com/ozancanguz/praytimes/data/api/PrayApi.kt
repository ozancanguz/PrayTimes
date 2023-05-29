package com.ozancanguz.praytimes.data.api

import com.ozancanguz.praytimes.data.alltimes.PrayTime
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface PrayApi {

    @Headers(
        "authorization: apikey 2xAW88zA1iemGAxzWMNumI:47IyS3uICCasjqzWaFtxnn",
        "content-type: application/json"
    )
    @GET("all")
    suspend fun searchByDayPray(@Query("data.city") city:String): Response<PrayTime>


}