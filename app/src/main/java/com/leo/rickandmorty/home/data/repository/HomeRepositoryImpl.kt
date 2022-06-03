package com.leo.rickandmorty.home.data.repository

import com.leo.rickandmorty.home.data.mapper.resultToToDomain
import com.leo.rickandmorty.home.data.service.api.HomeApi
import com.leo.rickandmorty.home.data.service.util.Output
import com.leo.rickandmorty.home.data.service.util.parseResponse
import com.leo.rickandmorty.home.domain.entity.ResultInfo
import com.leo.rickandmorty.home.domain.repository.HomeRepository

class HomeRepositoryImpl(
    private val service: HomeApi
) : HomeRepository {
    override suspend fun getAllCharacters(): List<ResultInfo> {

        return when (
            val result = service.getAllCharacters().parseResponse()
        ) {
            is Output.Success -> {
                val listResponse = result.value.results

                listResponse.map {
                    it.resultToToDomain()
                }
            }
            is Output.Failure -> throw GetCategoriesException()
        }
    }
}

class GetCategoriesException : Exception()