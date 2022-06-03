package com.leo.rickandmorty.home.domain.usecase

import com.leo.rickandmorty.home.domain.entity.ResultInfo
import com.leo.rickandmorty.home.domain.repository.HomeRepository

class HomeUseCaseImpl(
    private val repository: HomeRepository,
) : HomeUseCase {
    override suspend fun invoke(): List<ResultInfo> = try {
        repository.getAllCharacters()
    }
    catch (exception: Exception) {
        listOf()
    }
}