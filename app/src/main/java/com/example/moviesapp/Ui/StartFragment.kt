package com.example.moviesapp.Ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesapp.R
import com.example.moviesapp.databinding.FragmentStartBinding


class StartFragment : Fragment() {

    private var _binding : FragmentStartBinding? = null
    private val binding get() =_binding!!
    private lateinit var recyclerView: RecyclerView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentStartBinding.inflate(inflater, container, false)
        return binding.root

    }

    fun nextPage(){
        findNavController().navigate(R.id.action_startFragment_to_secondPageFragment)
    }


}