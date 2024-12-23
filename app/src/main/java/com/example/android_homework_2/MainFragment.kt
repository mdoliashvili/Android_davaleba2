package com.example.android_homework_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.example.android_homework_2.databinding.FragmentMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    private val Flist = listOf(
       MovieFragment.newInstance(),
        SeriesFragment.newInstance()
    )
    private val tList = listOf("Movies","Series")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    private fun init() = with(binding){
        val adapter = ViewPagerAdapter(activity as FragmentActivity,Flist)
        viewpager.adapter=adapter
        TabLayoutMediator(TabLayout,viewpager){ tab, position ->
                tab.text=tList[position]
        }.attach()
    }

    companion object {
        @JvmStatic
        fun newInstance() = MainFragment()
    }
}