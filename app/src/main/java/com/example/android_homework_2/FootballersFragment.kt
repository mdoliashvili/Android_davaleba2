package com.example.android_homework_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android_homework_2.databinding.FragmentFootballersBinding
import com.example.android_homework_2.databinding.FragmentTeamsBinding


class FootballersFragment : Fragment() {

    private lateinit var binding: FragmentFootballersBinding
    private lateinit var adapter: RecyclerViewAdapter

    private val Footballers = listOf(
        Football("Marcelo"),
        Football("Ramos"),
        Football("Ronaldo")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFootballersBinding.inflate(inflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyView()
    }

    private fun initRecyView()=with(binding){
        FootballerRecycler.layoutManager = LinearLayoutManager(activity)
        adapter=RecyclerViewAdapter(Footballers)
        FootballerRecycler.adapter=adapter
    }

    companion object {
        @JvmStatic
        fun newInstance() = FootballersFragment()
    }
}