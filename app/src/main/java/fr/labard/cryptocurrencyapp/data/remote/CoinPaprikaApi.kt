package fr.labard.cryptocurrencyapp.data.remote

import fr.labard.cryptocurrencyapp.data.remote.dto.CoinDto
import retrofit2.http.GET

interface CoinPaprikaApi {
    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>
}