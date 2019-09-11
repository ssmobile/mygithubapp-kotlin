package com.example.githubkotlinapp.model

import android.os.Parcel
import android.os.Parcelable

import com.google.gson.annotations.SerializedName

class User : Parcelable {

    @SerializedName("login")
    var login: String? = null

    @SerializedName("id")
    var id: Int? = null

    @SerializedName("node_id")
    var nodeId: String? = null

    @SerializedName("avatar_url")
    var avatarUrl: String? = null

    @SerializedName("gravatar_id")
    var gravatarId: String? = null

    @SerializedName("url")
    var url: String? = null

    @SerializedName("html_url")
    var htmlUrl: String? = null

    @SerializedName("followers_url")
    var followersUrl: String? = null

    @SerializedName("following_url")
    var followingUrl: String? = null

    @SerializedName("gists_url")
    var gistsUrl: String? = null

    @SerializedName("starred_url")
    var starredUrl: String? = null

    @SerializedName("subscriptions_url")
    var subscriptionsUrl: String? = null

    @SerializedName("organizations_url")
    var organizationsUrl: String? = null

    @SerializedName("repos_url")
    var reposUrl: String? = null

    @SerializedName("events_url")
    var eventsUrl: String? = null

    @SerializedName("received_events_url")
    var receivedEventsUrl: String? = null

    @SerializedName("type")
    var type: String? = null

    @SerializedName("site_admin")
    var siteAdmin: Boolean? = null

    @SerializedName("name")
    var name: String? = null

    @SerializedName("company")
    var company: String? = null

    @SerializedName("blog")
    var blog: String? = null

    @SerializedName("location")
    var location: String? = null

    @SerializedName("email")
    var email: Any? = null

    @SerializedName("hireable")
    var hireable: Any? = null

    @SerializedName("bio")
    var bio: String? = null

    @SerializedName("public_repos")
    var publicRepos: Int? = null

    @SerializedName("public_gists")
    var publicGists: Int? = null

    @SerializedName("followers")
    var followers: Int? = null

    @SerializedName("following")
    var following: Int? = null

    @SerializedName("created_at")
    var createdAt: String? = null

    @SerializedName("updated_at")
    var updatedAt: String? = null

    protected constructor(`in`: Parcel) {
        this.login = `in`.readValue(String::class.java.classLoader) as String?
        this.id = `in`.readValue(Int::class.java.classLoader) as Int?
        this.nodeId = `in`.readValue(String::class.java.classLoader) as String?
        this.avatarUrl = `in`.readValue(String::class.java.classLoader) as String?
        this.gravatarId = `in`.readValue(String::class.java.classLoader) as String?
        this.url = `in`.readValue(String::class.java.classLoader) as String?
        this.htmlUrl = `in`.readValue(String::class.java.classLoader) as String?
        this.followersUrl = `in`.readValue(String::class.java.classLoader) as String?
        this.followingUrl = `in`.readValue(String::class.java.classLoader) as String?
        this.gistsUrl = `in`.readValue(String::class.java.classLoader) as String?
        this.starredUrl = `in`.readValue(String::class.java.classLoader) as String?
        this.subscriptionsUrl = `in`.readValue(String::class.java.classLoader) as String?
        this.organizationsUrl = `in`.readValue(String::class.java.classLoader) as String?
        this.reposUrl = `in`.readValue(String::class.java.classLoader) as String?
        this.eventsUrl = `in`.readValue(String::class.java.classLoader) as String?
        this.receivedEventsUrl = `in`.readValue(String::class.java.classLoader) as String?
        this.type = `in`.readValue(String::class.java.classLoader) as String?
        this.siteAdmin = `in`.readValue(Boolean::class.java.classLoader) as Boolean?
        this.name = `in`.readValue(String::class.java.classLoader) as String?
        this.company = `in`.readValue(String::class.java.classLoader) as String?
        this.blog = `in`.readValue(String::class.java.classLoader) as String?
        this.location = `in`.readValue(String::class.java.classLoader) as String?
        this.email = `in`.readValue(Any::class.java.classLoader)
        this.hireable = `in`.readValue(Any::class.java.classLoader)
        this.bio = `in`.readValue(String::class.java.classLoader) as String?
        this.publicRepos = `in`.readValue(Int::class.java.classLoader) as Int?
        this.publicGists = `in`.readValue(Int::class.java.classLoader) as Int?
        this.followers = `in`.readValue(Int::class.java.classLoader) as Int?
        this.following = `in`.readValue(Int::class.java.classLoader) as Int?
        this.createdAt = `in`.readValue(String::class.java.classLoader) as String?
        this.updatedAt = `in`.readValue(String::class.java.classLoader) as String?
    }

    constructor() {}

    override fun toString(): String {
        return "User{" +
                "login='" + login + '\''.toString() +
                ", id=" + id +
                ", nodeId='" + nodeId + '\''.toString() +
                ", avatarUrl='" + avatarUrl + '\''.toString() +
                ", gravatarId='" + gravatarId + '\''.toString() +
                ", url='" + url + '\''.toString() +
                ", htmlUrl='" + htmlUrl + '\''.toString() +
                ", followersUrl='" + followersUrl + '\''.toString() +
                ", followingUrl='" + followingUrl + '\''.toString() +
                ", gistsUrl='" + gistsUrl + '\''.toString() +
                ", starredUrl='" + starredUrl + '\''.toString() +
                ", subscriptionsUrl='" + subscriptionsUrl + '\''.toString() +
                ", organizationsUrl='" + organizationsUrl + '\''.toString() +
                ", reposUrl='" + reposUrl + '\''.toString() +
                ", eventsUrl='" + eventsUrl + '\''.toString() +
                ", receivedEventsUrl='" + receivedEventsUrl + '\''.toString() +
                ", type='" + type + '\''.toString() +
                ", siteAdmin=" + siteAdmin +
                ", name='" + name + '\''.toString() +
                ", company='" + company + '\''.toString() +
                ", blog='" + blog + '\''.toString() +
                ", location='" + location + '\''.toString() +
                ", email=" + email +
                ", hireable=" + hireable +
                ", bio='" + bio + '\''.toString() +
                ", publicRepos=" + publicRepos +
                ", publicGists=" + publicGists +
                ", followers=" + followers +
                ", following=" + following +
                ", createdAt='" + createdAt + '\''.toString() +
                ", updatedAt='" + updatedAt + '\''.toString() +
                '}'.toString()
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeValue(login)
        dest.writeValue(id)
        dest.writeValue(nodeId)
        dest.writeValue(avatarUrl)
        dest.writeValue(gravatarId)
        dest.writeValue(url)
        dest.writeValue(htmlUrl)
        dest.writeValue(followersUrl)
        dest.writeValue(followingUrl)
        dest.writeValue(gistsUrl)
        dest.writeValue(starredUrl)
        dest.writeValue(subscriptionsUrl)
        dest.writeValue(organizationsUrl)
        dest.writeValue(reposUrl)
        dest.writeValue(eventsUrl)
        dest.writeValue(receivedEventsUrl)
        dest.writeValue(type)
        dest.writeValue(siteAdmin)
        dest.writeValue(name)
        dest.writeValue(company)
        dest.writeValue(blog)
        dest.writeValue(location)
        dest.writeValue(email)
        dest.writeValue(hireable)
        dest.writeValue(bio)
        dest.writeValue(publicRepos)
        dest.writeValue(publicGists)
        dest.writeValue(followers)
        dest.writeValue(following)
        dest.writeValue(createdAt)
        dest.writeValue(updatedAt)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object {

        @JvmField
        val CREATOR: Parcelable.Creator<User> = object : Parcelable.Creator<User> {


            override fun createFromParcel(`in`: Parcel): User {
                return User(`in`)
            }

            override fun newArray(size: Int): Array<User?> = arrayOfNulls(size)

        }
    }

}