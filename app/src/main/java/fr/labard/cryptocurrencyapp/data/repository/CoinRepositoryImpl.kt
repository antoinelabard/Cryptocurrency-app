package fr.labard.cryptocurrencyapp.data.repository

import fr.labard.cryptocurrencyapp.data.remote.CoinPaprikaApi
import fr.labard.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import fr.labard.cryptocurrencyapp.data.remote.dto.CoinDto
import fr.labard.cryptocurrencyapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
): CoinRepository {
    override suspend fun getCoins(): List<CoinDto> = api.getCoins()

    override suspend fun getCoinById(coinId: String): CoinDetailDto = api.getCoinById(coinId)
}