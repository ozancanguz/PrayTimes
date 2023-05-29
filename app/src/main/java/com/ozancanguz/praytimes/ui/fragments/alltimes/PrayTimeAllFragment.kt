package com.ozancanguz.praytimes.ui.fragments.alltimes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.ozancanguz.praytimes.adapter.SearchByDayAdapter
import com.ozancanguz.praytimes.databinding.FragmentPrayTimeAllBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PrayTimeAllFragment : Fragment() {

    private var _binding: FragmentPrayTimeAllBinding? = null

    private val binding get() = _binding!!
    private val viewModel:PrayAllTimeViewModel by viewModels()

    private val adapter=SearchByDayAdapter()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // setting up Recyclerview
        setupRv()



        // observe live data and update ui
        observeLiveData()

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentPrayTimeAllBinding.inflate(inflater, container, false)
        return binding.root


    }

    private fun observeLiveData() {
        binding.searchBtn.setOnClickListener {
            binding.pb.visibility=View.VISIBLE
            val city=binding.searchEditText.text.toString()
            viewModel.searchByDay(city)
            viewModel.searchByDay.observe(viewLifecycleOwner, Observer {
                adapter.setData(it)
                binding.pb.visibility=View.INVISIBLE
            })
        }
    }

    private fun setupRv() {
        binding.searchRv.layoutManager=LinearLayoutManager(requireContext())
        binding.searchRv.adapter=adapter
    }


}