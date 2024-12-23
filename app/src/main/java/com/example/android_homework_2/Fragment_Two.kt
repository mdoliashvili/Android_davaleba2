package com.example.android_homework_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android_homework_2.databinding.FragmentOneBinding
import com.example.android_homework_2.databinding.FragmentTwoBinding


class Fragment_Two : Fragment() {

    private lateinit var binding: FragmentTwoBinding
    private lateinit var adapter: RecyclerViewAdapter

    private val countries = listOf(
        Country("USA","Washington"),
        Country("Italy","Rome"),
        Country("Germany","Berlin")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentTwoBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyView()
    }

    private fun initRecyView()=with(binding){
        recyclertwo.layoutManager = LinearLayoutManager(activity)
        adapter=RecyclerViewAdapter(countries)
        recyclertwo.adapter=adapter
    }

    companion object {
        fun newInstance() = Fragment_Two()
    }
}