package com.ozancanguz.praytimes.ui.fragments.alltimes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ozancanguz.praytimes.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PrayTimeAllFragment : Fragment() {
   

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pray_time_all, container, false)
    }


}