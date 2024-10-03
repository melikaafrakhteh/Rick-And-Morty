package com.melika.data.repository

import com.melika.common.Result
import com.melika.data.mapper.toDomainModel
import com.melika.model.CharactersModel
import com.melika.network.api.RickAndMortyService
import com.melika.repository.CharactersRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.withContext
import javax.inject.Inject

class CharactersRepositoryImpl @Inject constructor(
    private val apiService: RickAndMortyService,
    private val defaultDispatcher: CoroutineDispatcher
) : CharactersRepository {
    override fun fetchCharacters(): Flow<Result<CharactersModel>> {
        return flow {
            when (val result = apiService.fetchCharacters()) {
                is Result.Error -> {
                    emit(Result.Error(exception = result.exception))
                }

                is Result.Success -> {
                    val mappedResult = withContext(defaultDispatcher) {
                        result.data.toDomainModel()
                    }
                    emit(Result.Success(data = mappedResult))
                }

                else -> Unit
            }
        }
    }
}