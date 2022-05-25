package fr.labard.cryptocurrencyapp.presentation.coin_detail

import fr.labard.cryptocurrencyapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coins: CoinDetail? = null,
    val error: String = ""
)
