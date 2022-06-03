package com.leo.rickandmorty.home.domain.usecase

import com.leo.rickandmorty.home.domain.entity.ResultInfo

interface HomeUseCase {
    suspend operator fun invoke(): List<ResultInfo>
}