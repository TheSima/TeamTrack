package com.goodinc.teamtrack

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentMoviesDetails : Fragment(R.layout.fragment_movies_details) {
    companion object {
        fun newInstance() : FragmentMoviesDetails = FragmentMoviesDetails()
    }
}