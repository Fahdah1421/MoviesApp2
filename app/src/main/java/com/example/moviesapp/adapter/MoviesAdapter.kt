package com.example.moviesapp.adapter

import android.graphics.Movie
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesapp.R
import com.example.moviesapp.data.loadMovies
import com.example.moviesapp.model.Movies


class MoviesAdapter() :RecyclerView.Adapter<MoviesAdapter.MovieViewHolder>() {
    private val MovieSet :  List <Movies> = loadMovies ()



class MovieViewHolder(private val view: View):RecyclerView.ViewHolder(view){
    val imageView : ImageView = view.findViewById(R.id.item_image)

}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
       val layout = LayoutInflater.from(parent.context).inflate(R.layout.itm_movies,parent,false)
        return MovieViewHolder(layout)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
    val item = MovieSet[position]
        holder.imageView.setImageResource(item.moviesImageId)
    }

    override fun getItemCount() = MovieSet.size


}




