package com.example.moviesapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesapp.R
import com.example.moviesapp.model.Movies



    class MoviesAdapter(val dataset:List<Movies>,val context: Context):RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder>() {




        class MoviesViewHolder(private val view:View) : RecyclerView.ViewHolder(view){
        val textView : TextView = view.findViewById(R.id.item_title)
        val imageView : ImageView =view.findViewById(R.id.item_image)
    }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
            val adapterLayout=LayoutInflater.from(parent.context).inflate(R.layout.itm_movies,parent,false)
            return MoviesViewHolder(adapterLayout)

        }

        override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
         val item=dataset[position]
            holder.textView.text=context.getString(item.moviesString)
            holder.imageView.setImageResource(item.moviesImageId)
        }

        override fun getItemCount()=dataset.size

    }




