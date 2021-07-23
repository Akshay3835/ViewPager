package com.example.viewpager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment


class JobsFragment : Fragment() {

    var jobsImage : ImageView? = null
    var jobsTextView : TextView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        jobsImage = view?.findViewById(R.id.jobs_image)
        jobsTextView = view?.findViewById(R.id.textView_jobs)
        return inflater.inflate(R.layout.fragment_jobs, container, false)
    }
}