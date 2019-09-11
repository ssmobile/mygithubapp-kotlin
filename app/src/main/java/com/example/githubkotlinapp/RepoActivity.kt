package com.example.githubkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.githubkotlinapp.model.Repo
import com.example.githubkotlinapp.model.User
import com.example.githubkotlinapp.model.datasource.remote.retrofit.UserService
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_repo.*
import java.util.*
import kotlin.collections.ArrayList

class RepoActivity : AppCompatActivity() {

    companion object {
        lateinit var repos : ArrayList<Repo>
        fun isReposListInitialized() = ::repos.isInitialized
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_repo)
    }

    override fun onResume() {
        super.onResume()

        if (!isReposListInitialized()) {

            UserService
                .createService()
                .getRepos()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(object : Observer<List<Repo>> {
                    lateinit var repos: List<Repo>

                    override fun onSubscribe(d: Disposable) {
                        Log.d("TAG_MAIN", "onSubscribe")
                    }

                    override fun onNext(t: List<Repo>) {
                        repos = t
                    }

                    override fun onError(e: Throwable) {
                        Log.e("TAG_Error", "Observer could not run properly", e)
                    }

                    override fun onComplete() {
                        Log.d("TAG_Repos", "$repos")
                        Collections.sort(repos)
                        populateRecyclerView(repos)
                    }
                })
            }
        }

        fun populateRecyclerView(repos : List<Repo>) {
            reposRecyclerView.adapter = RepoAdapter(repos)
            reposRecyclerView.layoutManager = LinearLayoutManager(this)
        }
    }

