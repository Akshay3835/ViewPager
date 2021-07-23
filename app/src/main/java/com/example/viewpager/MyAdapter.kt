package com.example.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyAdapter(fm:FragmentManager,lifecycle: Lifecycle): FragmentStateAdapter(fm,lifecycle) {

    private val totalTabs : Int = 4

    override fun createFragment(position: Int): Fragment {
     return  when (position) {
            0->
            {
                MainFragment()
            }
           1 -> {
                SportsFragment()
           }
            2 -> {
                MovieFragment()
            }
            else -> {
                JobsFragment()
            }
     }
    }
    override fun getItemCount(): Int {
        return totalTabs
    }

}


