package com.ozancanguz.praytimes.ui.fragments.single

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ozancanguz.praytimes.databinding.FragmentSinglePrayTimeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SinglePrayTimeFragment : Fragment() {

    private var _binding: FragmentSinglePrayTimeBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSinglePrayTimeBinding.inflate(inflater, container, false)




        return binding.root

    }


}