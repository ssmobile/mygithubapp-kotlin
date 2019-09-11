package com.example.githubkotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.githubkotlinapp.model.Repo
import com.example.githubkotlinapp.model.User
import com.example.githubkotlinapp.model.datasource.remote.retrofit.UserService
import com.squareup.picasso.Picasso
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        lateinit var user : User
        fun isUserInitialized() = ::user.isInitialized
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()

        Log.d("TAG_MAIN", "onResume")

        if (!isUserInitialized()) {
            UserService
                .createService()
                .getUser()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(object : Observer<User> {
                    lateinit var response: User

                    override fun onSubscribe(d: Disposable) {
                        Log.d("TAG_MAIN", "onSubscribe")
                    }

                    override fun onNext(t: User) {
                        response = t
                    }

                    override fun onError(e: Throwable) {
                        Log.e("TAG_Error", "Observer could not run properly", e)
                    }

                    override fun onComplete() {
                        Log.d("TAG_MAIN", "onComplete")
                        populateViews(response)
                    }
                })
        }
    }

    fun populateViews(user : User) {
        Log.d("TAG_MAIN", user.toString())

        Picasso.get().load(user.avatarUrl)
            .placeholder(R.drawable.placeholder_github)
            .into(profileIV)

        loginTV.text = user.login
        nameTV.text = user.name
        locationTV.text = user.location
        companyTV.text = user.company
        bioTV.text = user.bio
        reposNumTV.text = "${user.publicRepos}"
    }

    fun onClick(v : View) {

        startActivity(Intent(this,RepoActivity::class.java))
    }
}
