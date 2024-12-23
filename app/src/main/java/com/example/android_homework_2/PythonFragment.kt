package com.example.android_homework_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android_homework_2.databinding.FragmentPythonBinding


class PythonFragment : Fragment() {
    private lateinit var binding: FragmentPythonBinding
    private lateinit var adapter: RecyclerViewAdapter

    private val PythonCourse = listOf(
        Course("Module 1", "Beginner level", "20 Themes","6 weeks", 150),
        Course("Module 2", "Intermediate level", "30 Themes","8 weeks", 250),
        Course("Module 3", "Advanced level", "25 Themes","7 weeks", 350)
    )
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= FragmentPythonBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyView()
    }

    private fun initRecyView()=with(binding){
        PythonRecycler.layoutManager = LinearLayoutManager(activity)
        adapter=RecyclerViewAdapter(PythonCourse)
        PythonRecycler.adapter=adapter
    }

    companion object {
        @JvmStatic
        fun newInstance() = PythonFragment()
    }
}