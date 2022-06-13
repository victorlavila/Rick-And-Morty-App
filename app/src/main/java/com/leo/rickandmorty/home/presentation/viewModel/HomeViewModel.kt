package com.leo.rickandmorty.home.presentation.viewModel

import androidx.lifecycle.LiveData
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

    private val _characterList = MutableLiveData<List<ResultsToUi>>()
    val characterList = this._characterList as LiveData<List<ResultsToUi>>
    private val _loading = MutableLiveData<Boolean>()
    val loading = _loading as LiveData<Boolean>

    init {
        getCharacters()
    }

    private fun getCharacters() {
        viewModelScope.launch {
            homeUseCase.invoke().let {
                _characterList.postValue(homeUseCase.invoke().map {
                    it.resultToPresentation()
                })
                _loading.postValue(false)
            }
        }
    }
}