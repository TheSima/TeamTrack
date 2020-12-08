package com.goodinc.teamtrack

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentMoviesList : Fragment(R.layout.fragment_movies_list) {
    companion object{
        fun newInstance() : FragmentMoviesList = FragmentMoviesList()
    }

    private val cardClickListener: ClickMovieCardListener? get() = (activity as? ClickMovieCardListener)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<View>(R.id.movie_card)?.setOnClickListener {
            cardClickListener?.onClickCard()
        }
    }
}