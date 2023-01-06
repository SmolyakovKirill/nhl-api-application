package com.example.minnesotawild.data.api

import com.example.minnesotawild.model.Team
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("{teamCondition}")

    suspend fun getCardInformation(@Path("teamCondition") cardBin: String): Response<Team>
}