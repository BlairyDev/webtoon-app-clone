package com.frontblairmasters.webtoonappclone.ui.common.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage

@Preview
@Composable
fun WebtoonGrid(modifier: Modifier = Modifier) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        items(12) {
            Card(
                onClick = {}
            ) {
                AsyncImage(
                    model = "https://mangadex.org/covers/d21f41e9-d1bc-4739-83e1-b1254c263ab8/98bcfe93-715e-4b0c-b62a-062f31a670eb.jpg",
                    contentDescription = "cover image of a webtoon"
                )
            }
        }
    }
}