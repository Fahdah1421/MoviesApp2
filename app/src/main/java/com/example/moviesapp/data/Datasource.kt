package com.example.moviesapp.data

import com.example.moviesapp.R
import com.example.moviesapp.model.Movies




    // list of items
    fun loadMovies(): List<Movies> {
         return listOf(
             Movies(R.string.movies1, R.drawable.image1, R.string.about1),
             Movies(R.string.movies2, R.drawable.image3, R.string.movies3),
             Movies(R.string.movies2, R.drawable.image2,R.string.about2),
             Movies(R.string.movies4, R.drawable.image4,R.string.about4 ),
             Movies(R.string.movies5, R.drawable.image6,R.string.about6),
             Movies(R.string.movies6, R.drawable.image5,R.string.about5)
         )
    }

