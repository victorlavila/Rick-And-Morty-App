package com.leo.rickandmorty.home.di

import com.leo.rickandmorty.home.data.repository.HomeRepositoryImpl
import com.leo.rickandmorty.home.data.service.api.HomeApi
import com.leo.rickandmorty.home.data.service.HttpClient
import com.leo.rickandmorty.home.domain.repository.HomeRepository
import com.leo.rickandmorty.home.domain.usecase.HomeUseCase
import com.leo.rickandmorty.home.domain.usecase.HomeUseCaseImpl
import com.leo.rickandmorty.home.presentation.viewModel.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val homeModule = module {

    single<HomeRepository> {
        HomeRepositoryImpl(
            service = HttpClient().create(HomeApi::class)
        )
    }

    factory<HomeUseCase> {
        HomeUseCaseImpl(
            repository = get()
        )
    }

    viewModel {
        HomeViewModel(
            homeUseCase = get()
        )
    }
}