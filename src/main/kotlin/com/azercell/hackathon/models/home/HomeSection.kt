package com.azercell.hackathon.models.home

data class HomeSection<T: HomeItem> (
    val title: String,
    val items: List<T>
)