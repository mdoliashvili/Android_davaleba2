package com.example.android_homework_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android_homework_2.databinding.FragmentMovieBinding
import com.example.android_homework_2.databinding.FragmentOneBinding


class Fragment_One : Fragment() {

    private lateinit var binding: FragmentOneBinding
    private lateinit var adapter: RecyclerViewAdapter

    private val countries = listOf(
        Country("Georgia","Tbilisi"),
        Country("France","Paris"),
        Country("Spain","Madrid")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOneBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyView()
    }

    private fun initRecyView()=with(binding){
        recyclerOne.layoutManager = LinearLayoutManager(activity)
        adapter=RecyclerViewAdapter(countries)
        recyclerOne.adapter=adapter
    }

    companion object {
        @JvmStatic
        fun newInstance() = Fragment_One()
    }
}