package com.frontblairmasters.webtoonappclone

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.frontblairmasters.webtoonappclone.ui.CanvasScreen
import com.frontblairmasters.webtoonappclone.ui.HomeScreen
import com.frontblairmasters.webtoonappclone.ui.ProfileScreen
import com.frontblairmasters.webtoonappclone.ui.SearchScreen
import com.frontblairmasters.webtoonappclone.ui.TrendingScreen

enum class WebtoonScreen(
    val route: String,
    val icon: ImageVector,
    val contentDestination: String
) {
    Home("Home", Icons.Filled.Home, "Home icon"),
    Trending("Trending", Icons.Filled.PlayArrow, "Trending icon"),
    Search("Search", Icons.Filled.Search, "Search icon"),
    Canvas("Canvas", Icons.Filled.DateRange, "Canvas icon"),
    Profile("Profile", Icons.Filled.Person, "Person icon")
}


@Composable
fun WebtoonNavigation(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            WebtoonBottomBar(navController = navController)
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = WebtoonScreen.Home.name,
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            composable(route = WebtoonScreen.Home.name) {
                HomeScreen()
            }
            composable(route = WebtoonScreen.Trending.name) {
                TrendingScreen()
            }
            composable(route = WebtoonScreen.Search.name) {
                SearchScreen()
            }
            composable(route = WebtoonScreen.Canvas.name) {
                CanvasScreen()
            }
            composable(route = WebtoonScreen.Profile.name) {
                ProfileScreen()
            }
        }

    }

}