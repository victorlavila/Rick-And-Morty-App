package com.leo.rickandmorty.home.domain.entity

data class ResultInfo(
    val created: String,
    val episode: List<String>,
    val gender: String,
    val id: Int,
    val image: String,
    val location: LocationInfo,
    val name: String,
    val origin: OriginInfo,
    val species: String,
    val status: String,
    val type: String,
    val url: String
)
