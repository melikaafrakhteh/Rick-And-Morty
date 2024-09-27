package com.melika.characters.view

sealed interface CharactersUIState {
    data object Loading : CharactersUIState
    data object Failed : CharactersUIState
    data object FetchData : CharactersUIState
}