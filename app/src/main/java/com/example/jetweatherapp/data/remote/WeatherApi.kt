package com.example.jetweatherapp.data.remote

import android.icu.util.TimeZone
import com.example.jetweatherapp.data.remote.models.ApiCurrentWeather
import com.example.jetweatherapp.data.remote.models.ApiHourlyWeather
import com.example.jetweatherapp.data.remote.models.ApiWeather
import com.example.jetweatherapp.utils.ApiParameters
import com.example.jetweatherapp.utils.K
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    @GET(K.END_POINT)
    suspend fun getWeatherData(
        @Query(ApiParameters.LATITUDE) latitude:Float = -6.8F,
        @Query(ApiParameters.LONGITUDE) longitude:Float = 39.28F,
        @Query(ApiParameters.DAILY) daily:Array<String> = arrayOf(
            "weather_code",
            "temperature_2m_max",
            "temperature_2m_min",
            "wind_speed_10m_max",
            "wind_direction_10m_dominant",
            "sunrise",
            "sunset",
            "uv_index_max"
        ),
        @Query(ApiParameters.CURRENT_WEATHER) currentWeather: Array<String> = arrayOf(
            "temperature_2m",
            "is_day",
            "weather_code",
            "wind_speed_10m",
            "wind_direction_10m"
        ),
        @Query(ApiParameters.HOURLY) hourlyWeather: Array<String> = arrayOf(
            "weather_code",
            "temperature_2m"
        ),
        @Query(ApiParameters.TIME_FORMAT) timeFormat: String = "unixtime",
        @Query(ApiParameters.TIMEZONE) timeZone: String = "Europe/Berlin"
    ):ApiWeather

}

