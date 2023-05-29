package com.ozancanguz.praytimes.data.repository

import com.ozancanguz.praytimes.data.remote.RemoteDataSource
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class Repository@Inject constructor(private val remoteDataSource: RemoteDataSource) {


    var remote=remoteDataSource
}