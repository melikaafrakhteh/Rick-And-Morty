package com.melika.data.mapper

import com.melika.model.CharacterListInfoModel
import com.melika.model.CharacterModel
import com.melika.model.CharactersModel
import com.melika.network.model.characters.CharacterDto
import com.melika.network.model.characters.CharacterListInfoDto
import com.melika.network.model.characters.CharactersDto

fun CharactersDto.toDomainModel(): CharactersModel {
    return CharactersModel(
        info = info.toDomainModel(),
        characters = characters.map { it.toDomainModel() }
    )
}

fun CharacterListInfoDto.toDomainModel(): CharacterListInfoModel {
    return CharacterListInfoModel(
        count = count,
        pages = pages,
        next = next,
        previous = prev
    )
}

fun CharacterDto.toDomainModel(): CharacterModel {
    return CharacterModel(
        id = id,
        name = name,
        status = status,
        species = species,
        type = type,
        gender = gender,
        imageUrl = imageUrl
    )
}