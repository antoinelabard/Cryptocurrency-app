package fr.labard.cryptocurrencyapp.data.remote

import fr.labard.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import fr.labard.cryptocurrencyapp.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {
    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coindId: String): CoinDetailDto
}