package com.leo.rickandmorty.home.data.mapper

import com.leo.rickandmorty.home.data.model.*
import com.leo.rickandmorty.home.domain.entity.*

fun Result.resultToToDomain() =
    ResultInfo(
        created = this.created,
        episode = this.episode,
        gender = this.gender,
        id = this.id,
        image = this.image,
        location = this.location.getLocationMapper(),
        name = this.name,
        origin = this.origin.getOriginMapper(),
        species = this.species,
        status = this.status,
        type = this.type,
        url = this.url
    )

fun Location.getLocationMapper() =
    LocationInfo(
        name = this.name,
        url = this.url
    )

fun Origin.getOriginMapper() =
    OriginInfo(
        name = this.name,
        url = this.url
    )
