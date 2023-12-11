package com.example.horoscapp.ui.horoscope.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.horoscapp.domain.model.HoroscopeInfo
import com.example.horoscapp.databinding.ItemHoroscopeBinding

class HoroscopeViewHolder(view: View): RecyclerView.ViewHolder(view){

    private val bindings = ItemHoroscopeBinding.bind(view)
    fun render(horoscopeInfo: HoroscopeInfo){
        val context = bindings.tvTitle.context
        bindings.ivHoroscope.setImageResource(horoscopeInfo.img)
        bindings.tvTitle.text = context.getText(horoscopeInfo.name)
    }
}