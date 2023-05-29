package com.ozancanguz.praytimes.data.remote

import com.ozancanguz.praytimes.data.alltimes.PrayTime
import com.ozancanguz.praytimes.data.api.PrayApi
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource@Inject constructor(private val prayApi: PrayApi) {


    suspend fun searchByDayPray(city:String): Response<PrayTime> {
        return prayApi.searchByDayPray(city)
    }

}