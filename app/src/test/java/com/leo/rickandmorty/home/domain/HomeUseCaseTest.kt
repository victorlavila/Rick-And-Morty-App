package com.leo.rickandmorty.home.domain

import com.leo.rickandmorty.home.domain.repository.HomeRepository
import com.leo.rickandmorty.home.domain.usecase.HomeUseCaseImpl
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class HomeUseCaseTest {

    private val repository = mockk<HomeRepository>()
    private val homeUseCase = HomeUseCaseImpl(repository)

    @Test
    fun `getAllCharacters receive list with success`() = runBlocking {
        // GIVEN
        coEvery { repository.getAllCharacters() } returns ResultFactory().result
        // WHEN
        val result = homeUseCase.invoke()
        // THEN
        Assert.assertEquals(result, ResultFactory().result)
    }
}