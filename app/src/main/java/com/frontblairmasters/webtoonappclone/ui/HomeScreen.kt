package com.frontblairmasters.webtoonappclone.ui


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.frontblairmasters.webtoonappclone.ui.common.composables.WebtoonGrid

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.padding(15.dp)
    ) {
        HomeContent()
    }

}

@Composable
fun HomeContent(modifier: Modifier = Modifier) {
    WebtoonGrid()
}


