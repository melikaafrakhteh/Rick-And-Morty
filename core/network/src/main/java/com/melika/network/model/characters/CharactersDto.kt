package com.melika.network.model.characters

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class CharactersDto(
    val info: CharacterListInfoDto,
    @SerialName("result")
    val characters: List<CharacterDto>
)


