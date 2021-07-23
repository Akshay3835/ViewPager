package com.example.viewpager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class MovieFragment : Fragment() {

    var moviesImage : ImageView? = null
    var moviesTextView : TextView? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
      moviesImage = view?.findViewById(R.id.movies_image)
        moviesTextView = view?.findViewById(R.id.textView_movies)
        return inflater.inflate(R.layout.fragment_movie, container, false)
    }

}