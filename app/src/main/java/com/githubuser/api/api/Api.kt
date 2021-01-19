package com.githubuser.api.api

import com.githubuser.api.data.model.DetailUserResponse
import com.githubuser.api.data.model.User
import com.githubuser.api.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token b34db87f3c6dd9dd271722c639fc530fae796c4c")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token b34db87f3c6dd9dd271722c639fc530fae796c4c")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token b34db87f3c6dd9dd271722c639fc530fae796c4c")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token b34db87f3c6dd9dd271722c639fc530fae796c4c")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}