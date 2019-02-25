package com.swapi.swapikotlin.api.model

import com.google.gson.annotations.SerializedName

data class FilmDto(

    @SerializedName("id_category")
    var id_category: Int,

    @SerializedName("name")
    var name: String
)