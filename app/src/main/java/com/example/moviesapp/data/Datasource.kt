package com.example.moviesapp.data

import com.example.moviesapp.R
import com.example.moviesapp.model.Movies


class Datasource {

    // list of items
    fun loadMovies(): List<Movies> {
         return listOf(
             Movies(R.string.movies1, R.drawable.image1),
             Movies(R.string.movies2, R.drawable.image3),
             Movies(R.string.movies3, R.drawable.image2),
             Movies(R.string.movies4, R.drawable.image4),
             Movies(R.string.movies5, R.drawable.image6),
             Movies(R.string.movies6, R.drawable.image5),
        )
}

  }