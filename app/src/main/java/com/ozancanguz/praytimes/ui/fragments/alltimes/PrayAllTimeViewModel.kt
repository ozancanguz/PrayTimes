package com.ozancanguz.praytimes.ui.fragments.alltimes

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.ozancanguz.praytimes.data.alltimes.PrayTime
import com.ozancanguz.praytimes.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PrayAllTimeViewModel@Inject constructor(private val repository: Repository, application: Application):AndroidViewModel(application) {


    val searchByDay=MutableLiveData<PrayTime>()

     fun searchByDay(city:String){
        viewModelScope.launch {
            val response=repository.remote.searchByDayPray(city)
             if(response.isSuccessful){
                 searchByDay.postValue(response.body())
             }else{
                 Log.e("viewmodel","no data found")
             }
        }
    }

}