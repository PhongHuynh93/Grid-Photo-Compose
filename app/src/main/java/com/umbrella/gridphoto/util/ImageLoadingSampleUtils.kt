package com.umbrella.gridphoto.util

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember

private val rangeForRandom = (0..100000)

@Composable
fun rememberPhotoList(
    seed: Int = rangeForRandom.random(),
    width: Int = 300,
    height: Int = width
): List<String> = remember {
    (0..100).map {
        randomSampleImageUrl(seed, width, height)
    }
}

fun randomSampleImageUrl(
    seed: Int = rangeForRandom.random(),
    width: Int = 300,
    height: Int = width,
): String {
    return "https://picsum.photos/seed/$seed/$width/$height"
}