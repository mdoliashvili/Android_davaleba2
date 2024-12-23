package com.example.android_homework_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android_homework_2.databinding.FragmentMovieBinding
import com.example.android_homework_2.databinding.FragmentSeriesBinding

class SeriesFragment : Fragment() {
    private lateinit var binding: FragmentSeriesBinding
    private lateinit var adapter: RecyclerViewAdapter

    private val Series = listOf(
        Movie("Breaking Bad","Vince gilligan"),
        Movie("Band of brothers","Steven Spielberg"),
        Movie("Sherlock","Mark Gatiss")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSeriesBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyView()
    }

    private fun initRecyView()=with(binding){
        SeriesRecycler.layoutManager = LinearLayoutManager(activity)
        adapter=RecyclerViewAdapter(Series)
        SeriesRecycler.adapter=adapter
    }

    companion object {

        @JvmStatic
        fun newInstance() = SeriesFragment()
    }
}