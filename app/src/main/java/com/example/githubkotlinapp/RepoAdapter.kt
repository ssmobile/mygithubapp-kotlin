package com.example.githubkotlinapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.githubkotlinapp.model.Repo
import kotlinx.android.synthetic.main.activity_main.view.nameTV
import kotlinx.android.synthetic.main.repo_list_item.view.*
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

class RepoAdapter(var repoList : List<Repo>) : RecyclerView.Adapter<RepoAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepoAdapter.ViewHolder  =
        ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.repo_list_item, parent, false))


    override fun getItemCount() = repoList.size

    override fun onBindViewHolder(holder: RepoAdapter.ViewHolder, position: Int) =
        holder.bindViews(repoList[position])


    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        fun bindViews(repo: Repo) {
            itemView.nameTV.text = repo.name
            itemView.languageTV.text = repo.language
            itemView.lastUpdateTV.text = getAgo(repo.pushedAt!!)
        }


        fun getAgo(repoDate: String) : String {
            val timemillis = longArrayOf(31536000000L, 2628002880L, 86400000L, 3600000, 60000, 1000)
            val timeStrings = arrayOf("year", "month", "day", "hour", "minute", "second")
            val pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'"
            val format = SimpleDateFormat(pattern)
            lateinit var date: Date

            try {
                date = format.parse(repoDate)
            } catch (e: ParseException) {
                e.printStackTrace()
            }


            val repoMillis = date.time
            val nowMillis = Date().time + timemillis[3]*4;
            val diff = nowMillis - repoMillis

            for (i in 0..timemillis.size) {
                val interval = diff/timemillis[i]

                if (interval != 0L) {
                    var suffix = ""

                    if (interval != 1L) suffix = "s"

                    return "Udpated $interval ${timeStrings[i]}$suffix ago"
                }


            }



            return "LAST UPDATED"
        }

    }

}