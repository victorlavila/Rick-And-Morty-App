package com.leo.rickandmorty.home.domain.entity

import com.leo.rickandmorty.home.data.model.Info


data class CharacterResponseInfo(
    val info: InfoDomain,
    val results: List<ResultInfo>
)
