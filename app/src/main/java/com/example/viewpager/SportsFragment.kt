package com.example.viewpager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment


class SportsFragment : Fragment() {

    var sportsImage : ImageView? = null
    var sportsTextView : TextView? = null
        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
           sportsImage = view?.findViewById(R.id.sports_image)
            sportsTextView = view?.findViewById(R.id.textView_sports)
            return inflater.inflate(R.layout.fragment_sports, container, false)
        }

    }