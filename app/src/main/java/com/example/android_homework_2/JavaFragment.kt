package com.example.android_homework_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android_homework_2.databinding.FragmentJavaBinding
import com.example.android_homework_2.databinding.FragmentPythonBinding

class JavaFragment : Fragment() {

    private lateinit var binding: FragmentJavaBinding
    private lateinit var adapter: RecyclerViewAdapter

    private val JavaCourse = listOf(
        Course("Module 1", "Beginner level", "25 Themes","6 weeks", 100),
        Course("Module 2", "Intermediate level", "30 Themes","8 weeks", 200),
        Course("Module 3", "Advanced level", "35 Themes","10 weeks", 300)
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentJavaBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyView()
    }

    private fun initRecyView()=with(binding){
        JavaRecycler.layoutManager = LinearLayoutManager(activity)
        adapter=RecyclerViewAdapter(JavaCourse)
        JavaRecycler.adapter=adapter
    }


    companion object {
        @JvmStatic
        fun newInstance() = JavaFragment()
    }
}