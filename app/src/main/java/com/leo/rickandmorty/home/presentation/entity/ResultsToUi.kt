package com.leo.rickandmorty.home.presentation.entity

data class ResultsToUi(
    val created: String,
    val episode: List<String>,
    val gender: String,
    val id: Int,
    val image: String,
    val location: LocationToUi,
    val name: String,
    val origin: OriginToUi,
    val species: String,
    val status: String,
    val type: String,
    val url: String
)