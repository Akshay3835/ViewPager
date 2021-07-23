package com.example.viewpager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class MainFragment : Fragment() {

    var homeImage : ImageView? = null
    var homeTextView : TextView? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        homeImage = view?.findViewById(R.id.Home_image)
        homeTextView = view?.findViewById(R.id.textView_home)
        return inflater.inflate(R.layout.fragment_main, container, false)
    }
}