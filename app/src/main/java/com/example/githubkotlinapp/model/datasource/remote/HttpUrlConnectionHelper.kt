package com.example.githubkotlinapp.model.datasource.remote

import android.util.JsonReader
import com.example.githubkotlinapp.model.Repo
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import java.io.InputStreamReader
import java.net.URL
import java.nio.charset.StandardCharsets

class HttpUrlConnectionHelper {

    private var USER_PROFILE_URL = "https://api.github.com/users/ssmobile"
    val USER_REPOS_URL = "$USER_PROFILE_URL/repos"
    private val TAG = "TAG_ConnectionHelper"

    companion object {
        fun getReposResponse(callback : HttpCallback) {
            val url = URL("https://api.github.com/users/ssmobile/repos")
            lateinit var jsonResponse : ArrayList<Repo>
            val `in` = InputStreamReader(url.openStream(),StandardCharsets.UTF_8)
            val gson = GsonBuilder().create()

                val reader = JsonReader(`in`)
                reader.beginArray()

                while (reader.hasNext())    {
                    var repo = reader

                }






        }
    }

    interface HttpCallback {
        fun onHttpUrlConnectionResponse(json : Any)
    }
}

