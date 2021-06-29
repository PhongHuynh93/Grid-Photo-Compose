package com.umbrella.gridphoto.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.google.accompanist.coil.rememberCoilPainter
import com.umbrella.gridphoto.Greeting
import com.umbrella.gridphoto.ui.theme.GridPhotoTheme
import com.umbrella.gridphoto.util.rememberPhotoList

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun GridPhoto() {
    val data = rememberPhotoList()
    LazyVerticalGrid(
        cells = GridCells.Fixed(4),
        modifier = Modifier
            .fillMaxSize()
    ) {
        items(data.size) { photoUrl ->
            Image(
                painter = rememberCoilPainter(photoUrl),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth(),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GridPhotoTheme {
        GridPhoto()
    }
}