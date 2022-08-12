package com.example.moviesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesapp.adapter.MoviesAdapter
import com.example.moviesapp.data.Datasource
import com.example.moviesapp.model.Movies

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lom:List<Movies> = Datasource().loadMovies()
        val MoviesAdapter= MoviesAdapter(lom,this)
        val recyclerView: RecyclerView =findViewById(R.id.rv_movies)
        recyclerView.adapter=MoviesAdapter
        recyclerView.setHasFixedSize(true)

    }
}