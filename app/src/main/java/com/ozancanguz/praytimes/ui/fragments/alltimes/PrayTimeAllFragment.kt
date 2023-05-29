package com.ozancanguz.praytimes.ui.fragments.alltimes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ozancanguz.praytimes.databinding.FragmentPrayTimeAllBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PrayTimeAllFragment : Fragment() {

    private var _binding: FragmentPrayTimeAllBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentPrayTimeAllBinding.inflate(inflater, container, false)
        return binding.root





    }


}