package com.example.horoscapp.data.providers

import com.example.horoscapp.R
import com.example.horoscapp.domain.model.HoroscopeInfo
import com.example.horoscapp.domain.model.HoroscopeInfo.*
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

class HoroscopeProviders @Inject constructor(){
    fun getHoroscopes():List<HoroscopeInfo>{
        return listOf(Aries
            ,Taurus
            ,Gemini
            ,Cancer
            ,Leo
            ,Virgo
            ,Libra
            ,Scorpio
            ,Sagittarius
            ,Capricorn
            ,Aquarius
            ,Piscies)
    }
}




