package com.example.githubkotlinapp.model.datasource.remote.retrofit

import com.example.githubkotlinapp.model.Repo
import com.example.githubkotlinapp.model.User
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface UserService {

    companion object {
        fun createService() : UserService =
            RetrofitHelper().getRetrofitInstance().create(UserService::class.java)
    }


    @GET("/users/ssmobile")
    fun getUser() : Observable<User>


    @GET("/users/ssmobile/repos")
    fun getRepos() : Observable<List<Repo>>
}