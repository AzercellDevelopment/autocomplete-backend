package com.azercell.hackathon.helper

class RandomImageUrlGenerator {
    companion object {
        fun generateImageURL(width: Int = 30, height: Int = 30) = "http://placehold.jp/${width}x${height}.png"
    }
}