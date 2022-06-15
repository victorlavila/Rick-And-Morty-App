package com.leo.rickandmorty.home.domain

import com.leo.rickandmorty.home.domain.entity.LocationInfo
import com.leo.rickandmorty.home.domain.entity.OriginInfo
import com.leo.rickandmorty.home.domain.entity.ResultInfo

class ResultFactory {

    private val location = LocationInfo(name = "Terra", url = "www.test.com")
    private val origin = OriginInfo(name = "Terraquio", url = "www.terra.com")
    val result = listOf(
        ResultInfo(
            created = "Bruce Willis",
            episode = listOf("1,2,3,4,5"),
            gender = "Man",
            id = 123,
            image = "imageRick",
            location = location,
            name = "Morty",
            origin = origin,
            species = "terraquio",
            status = "Alive",
            type = "Human",
            url = "www.rickAndMorty.com"
        )
    )
}