package com.melika.repository

import com.melika.common.Result
import com.melika.model.CharactersModel
import kotlinx.coroutines.flow.Flow

interface CharactersRepository {

    fun fetchCharacters(): Flow<Result<CharactersModel>>

}