package com.goodinc.teamtrack

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentMoviesList : Fragment() {
    companion object{
        fun newInstance() : FragmentMoviesList = FragmentMoviesList()
    }

    private var cardClickListener: ClickMovieCardListener? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?):
            View? = inflater.inflate(R.layout.fragment_movies_list, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<View>(R.id.movie_card)?.setOnClickListener{
            cardClickListener?.onClickCard()
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is ClickMovieCardListener) {
            cardClickListener = context
        }
    }

    override fun onDetach() {
        super.onDetach()
        cardClickListener = null
    }
}