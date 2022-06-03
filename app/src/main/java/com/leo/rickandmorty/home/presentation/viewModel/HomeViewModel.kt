package com.leo.rickandmorty.home.presentation.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.leo.rickandmorty.home.domain.mapper.resultToPresentation
import com.leo.rickandmorty.home.domain.usecase.HomeUseCase
import com.leo.rickandmorty.home.presentation.entity.ResultsToUi
import kotlinx.coroutines.launch

class HomeViewModel(
    private val homeUseCase: HomeUseCase
) : ViewModel() {

    val characterList = MutableLiveData<List<ResultsToUi>>()
    val loading = MutableLiveData<Boolean>()

    init {
        getCharacters()
    }

    private fun getCharacters() {
        viewModelScope.launch {
            homeUseCase.invoke().let {
                characterList.postValue(homeUseCase.invoke().map {
                    it.resultToPresentation()
                })
                loading.postValue(false)
            }
        }
    }
}