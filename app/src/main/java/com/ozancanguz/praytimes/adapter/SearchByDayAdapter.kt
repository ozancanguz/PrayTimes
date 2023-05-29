package com.ozancanguz.praytimes.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ozancanguz.praytimes.R
import com.ozancanguz.praytimes.data.alltimes.PrayTime
import com.ozancanguz.praytimes.data.alltimes.SearchByDay
import com.ozancanguz.praytimes.databinding.SearchbydayRvLayoutBinding

class SearchByDayAdapter : RecyclerView.Adapter<SearchByDayAdapter.SearchViewHolder>() {
    class SearchViewHolder(val binding: SearchbydayRvLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    var searchByDayList = emptyList<SearchByDay>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = SearchbydayRvLayoutBinding.inflate(inflater, parent, false)
        return SearchViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SearchViewHolder, position: Int) {
        val currentTime = searchByDayList[position]
        holder.binding.timeTv.text = "Time:" +currentTime.saat
        holder.binding.statusTv.text = "Status: " +currentTime.vakit
    }

    override fun getItemCount(): Int {
        return searchByDayList.size
    }

    // Optional: Add a setter method to update the searchByDayList
    fun setData(newData:PrayTime) {
        this.searchByDayList=newData.result
        notifyDataSetChanged()
    }
}