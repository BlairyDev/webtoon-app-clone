package com.frontblairmasters.webtoonappclone

import android.R.attr.onClick
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon

import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController


@Composable
fun WebtoonBottomBar(
    modifier: Modifier = Modifier,
    navController: NavController
) {

    BottomAppBar(
        actions = {
            IconButton(
                onClick = {
                    navController.navigate(WebtoonScreen.Home.name)
                }
            ) {
                Icon(Icons.Filled.Home, contentDescription = "Home")
            }
            IconButton(
                onClick = {
                    navController.navigate(WebtoonScreen.Trending.name)
                }
            ) {
                Icon(Icons.Filled.PlayArrow, contentDescription = "Trending")
            }
            IconButton(
                onClick = {
                    navController.navigate(WebtoonScreen.Search.name)
                }
            ) {
                Icon(Icons.Filled.Search, contentDescription = "Search")
            }
            IconButton(
                onClick = {
                    navController.navigate(WebtoonScreen.Canvas.name)
                }
            ) {
                Icon(Icons.Filled.DateRange, contentDescription = "Canvas")
            }
            IconButton(
                onClick = {
                    navController.navigate(WebtoonScreen.Profile.name)
                }
            ) {
                Icon(Icons.Filled.Person, contentDescription = "Profile")
            }
        },
        floatingActionButton = {

        }
    )

}