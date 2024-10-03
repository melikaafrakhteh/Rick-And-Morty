package com.melika.network.api

import com.melika.common.Result
import com.melika.network.model.characters.CharactersDto
import retrofit2.http.GET

interface RickAndMortyService {

    @GET("/character")
    suspend fun fetchCharacters(): Result<CharactersDto>
}