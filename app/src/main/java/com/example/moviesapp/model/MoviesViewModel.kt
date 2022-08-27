package com.example.moviesapp.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MoviesViewModel: ViewModel() {
    private val _MovieName = MutableLiveData <String>()
    val MovieName : LiveData <String> = _MovieName

    private val _ImageId = MutableLiveData <Int>()
    val ImageId : LiveData <Int> = _ImageId

    private val _MovieAbout = MutableLiveData <String>()
    val MovieAbout : LiveData <String> = _MovieAbout

    fun setMovieName(movieName: String){
        _MovieName.value = movieName
    }
    fun setImageId(imageId: Int){
        _ImageId.value = imageId

        }
    fun setMovieAbout(movieAbout: String) {
        _MovieAbout.value = movieAbout
    }
}