package fr.labard.cryptocurrencyapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import fr.labard.cryptocurrencyapp.presentation.coin_detail.CoinDetailScreen
import fr.labard.cryptocurrencyapp.presentation.coin_list.CoinListScreen
import fr.labard.cryptocurrencyapp.presentation.ui.theme.CryptoCurrencyAppTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CryptoCurrencyAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Scaffold(topBar = {
                        TopAppBar(
                            title = { Text("CryptoCurrency App") }
                        )
                    },
                        content = {
                            val navController = rememberNavController()
                            NavHost(
                                navController = navController,
                                startDestination = Screen.CoinListScreen.route
                            ) {
                                composable(
                                    route = Screen.CoinListScreen.route
                                ) {
                                    CoinListScreen(navController)
                                }
                                composable(
                                    route = Screen.CoinDetailScreen.route + "/{coinId}"
                                ) {
                                    CoinDetailScreen()
                                }
                            }
                        })
                }
            }
        }
    }
}
