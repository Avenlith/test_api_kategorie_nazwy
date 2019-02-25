package com.swapi.swapikotlin.api.model

data class Response<T>(
    var category: T,
    var count: Int
)