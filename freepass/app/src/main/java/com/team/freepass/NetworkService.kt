package com.team.freepass

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface NetworkService {
    @POST("/filter.php")
    fun putTodaySurvey(
            @Header("Authorization") Authorization : Int,
            @Body TodaySurveyData : TodaySurveyData
    ) : retrofit2.Call<TodaySurveyResponse>
}