package com.example.dailydo.data.remote

 import com.example.dailydo.data.remote.dto.NewsResponse
 import retrofit2.http.GET
 import retrofit2.http.Query

//GET https://newsapi.org/v2/top-headlines?country=us&apiKey=API_KEY
interface NewsApiService {
    @GET("top-headlines")
    suspend fun getTopHeadlines(
        @Query("country") country : String ="us",
        @Query("apiKey") apiKey: String
    ): NewsResponse
}