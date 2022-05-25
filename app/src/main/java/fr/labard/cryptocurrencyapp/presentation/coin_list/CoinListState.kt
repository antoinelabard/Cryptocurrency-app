package fr.labard.cryptocurrencyapp.presentation.coin_list

import fr.labard.cryptocurrencyapp.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
