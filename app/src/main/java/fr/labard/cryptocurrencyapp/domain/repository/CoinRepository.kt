package fr.labard.cryptocurrencyapp.domain.repository

import fr.labard.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import fr.labard.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>
    suspend fun getCoinById(coinId: String): CoinDetailDto
}