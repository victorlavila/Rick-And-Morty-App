package com.leo.rickandmorty.home.domain.repository

import com.leo.rickandmorty.home.domain.entity.ResultInfo

interface HomeRepository {
    suspend fun getAllCharacters() : List<ResultInfo>
}