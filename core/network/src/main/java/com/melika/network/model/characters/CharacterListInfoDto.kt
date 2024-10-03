package com.melika.network.model.characters

import kotlinx.serialization.Serializable

@Serializable
data class CharacterListInfoDto(
    val count: Int,
    val pages: Int,
    val next: String?,
    val prev: String?
)
