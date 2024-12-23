package com.example.android_homework_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android_homework_2.databinding.FragmentTeamsBinding

class TeamsFragment : Fragment() {
    private lateinit var binding:FragmentTeamsBinding
    private lateinit var adapter: RecyclerViewAdapter

    private val Teams = listOf(
        Football("Real"),
        Football("Arsenal"),
        Football("Tottenham")
    )
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTeamsBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyView()
    }

    private fun initRecyView()=with(binding){
        TeamsRecycler.layoutManager = LinearLayoutManager(activity)
        adapter=RecyclerViewAdapter(Teams)
        TeamsRecycler.adapter=adapter
    }

    companion object {
        @JvmStatic
        fun newInstance() = TeamsFragment()
    }
}