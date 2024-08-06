package com.example.jetweatherapp.domain.models

import android.health.connect.datatypes.units.Temperature
import com.example.jetweatherapp.utils.WeatherInfoItem

data class CurrentWeather(
    val temperature: Double,
    val time: String,
    val weatherStatus: WeatherInfoItem,
    val windDirection: String,
    val windSpeed: Double,
    val isDay: Boolean
)
