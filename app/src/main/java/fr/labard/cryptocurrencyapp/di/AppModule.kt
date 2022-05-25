package fr.labard.cryptocurrencyapp.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import fr.labard.cryptocurrencyapp.common.Constants
import fr.labard.cryptocurrencyapp.data.remote.CoinPaprikaApi
import fr.labard.cryptocurrencyapp.data.repository.CoinRepositoryImpl
import fr.labard.cryptocurrencyapp.domain.repository.CoinRepository
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun providePaprikaApi(): CoinPaprikaApi = Retrofit.Builder()
        .baseUrl(Constants.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(CoinPaprikaApi::class.java)

    @Provides
    @Singleton
    fun provideCoinRespository(api: CoinPaprikaApi): CoinRepository = CoinRepositoryImpl(api)
}