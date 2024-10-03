package com.melika.usecase

import com.melika.common.Result
import com.melika.model.CharactersModel
import com.melika.repository.CharactersRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class FetchCharactersUseCase @Inject constructor(
    private val repository: CharactersRepository
) {
    operator fun invoke(): Flow<Result<CharactersModel>> {
        return repository.fetchCharacters()
    }
}