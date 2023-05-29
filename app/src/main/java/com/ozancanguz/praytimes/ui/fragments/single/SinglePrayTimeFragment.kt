package com.ozancanguz.praytimes.ui.fragments.single

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ozancanguz.praytimes.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SinglePrayTimeFragment : Fragment() {
   

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_single_pray_time, container, false)
    }


}