package com.leo.rickandmorty.home.domain.mapper

import com.leo.rickandmorty.home.domain.entity.LocationInfo
import com.leo.rickandmorty.home.domain.entity.OriginInfo
import com.leo.rickandmorty.home.domain.entity.ResultInfo
import com.leo.rickandmorty.home.presentation.entity.LocationToUi
import com.leo.rickandmorty.home.presentation.entity.OriginToUi
import com.leo.rickandmorty.home.presentation.entity.ResultsToUi

fun ResultInfo.resultToPresentation() =
    ResultsToUi(
        created = this.created,
        episode = this.episode,
        gender = this.gender,
        id = this.id,
        image = this.image,
        location = this.location.locationToPresentation(),
        name = this.name,
        origin = this.origin.originToPresentation(),
        species = this.species,
        status = this.status,
        type = this.type,
        url = this.url
    )

fun LocationInfo.locationToPresentation() =
    LocationToUi(
        name = this.name,
        url = this.url
    )

fun OriginInfo.originToPresentation() =
    OriginToUi(
        name = this.name,
        url = this.url
    )