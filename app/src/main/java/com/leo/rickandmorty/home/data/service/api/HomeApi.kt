package com.leo.rickandmorty.home.data.service.api

import com.leo.rickandmorty.home.data.model.CharacterResponse
import retrofit2.Response
import retrofit2.http.GET

interface HomeApi {

    @GET("character")
    suspend fun getAllCharacters(): Response<CharacterResponse>
}