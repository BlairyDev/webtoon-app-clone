package com.frontblairmasters.webtoonappclone

import android.R.attr.label
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon

import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WebtoonTopBar(modifier: Modifier = Modifier) {

    TopAppBar(
        navigationIcon = {
            IconButton(onClick = {}) {
                Icon(Icons.Filled.PlayArrow, contentDescription = "Logo")
            }
        },
        title = { Text("") },
        actions = {
            IconButton(onClick = {}) {
                Icon(Icons.Filled.Info, contentDescription = "Treasure")
            }
        }

    )

}

@Preview
@Composable
fun WebtoonBottomBar(
    modifier: Modifier = Modifier,
    navController: NavController = rememberNavController(),
) {
    var selectedDestination by rememberSaveable { mutableIntStateOf(WebtoonScreen.Home.ordinal) }

    NavigationBar(windowInsets = NavigationBarDefaults.windowInsets) {
        WebtoonScreen.entries.forEachIndexed { index, destination ->
            NavigationBarItem(
                selected = selectedDestination == index,
                onClick = {
                    navController.navigate(destination.route)
                    selectedDestination = index
                },
                icon = {
                    Icon(
                        destination.icon,
                        contentDescription = destination.contentDestination
                    )
                },
            )
        }
    }

}