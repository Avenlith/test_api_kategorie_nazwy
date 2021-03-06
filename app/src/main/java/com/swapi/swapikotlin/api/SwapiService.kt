package com.swapi.swapikotlin.api

import com.swapi.swapikotlin.api.model.FilmDto
import com.swapi.swapikotlin.api.model.Response
import io.reactivex.Single
import retrofit2.http.GET

interface SwapiService {

  @GET("products")
  fun fetchFilms(): Single<Response<List<FilmDto>>>

}