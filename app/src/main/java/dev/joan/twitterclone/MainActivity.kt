package dev.joan.twitterclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.joan.twitterclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun displayTweets (){
        var tweet1 = tweetData("Hello Kotlin","abf","@adef",5,6,7)
        var tweet2 = tweetData("Hello Joan","abf","@adef",5,6,7)
        var tweet3 = tweetData("Hello Njiru","abf","@adef",5,6,7)
        var tweet4 = tweetData("Hello Njiru","abf","@adef",5,6,7)
        var tweet5 = tweetData("Hello Njiru","abf","@adef",5,6,7)
        var tweet6 = tweetData("Hello Njiru","abf","@adef",5,6,7)

        binding.rvTweets = listOf<TweetData>(tweet1,tweet2,tweet3,tweet4,tweet5,)
        var tweetsAdapter = tweetsrvAdapter(tweetList)
        binding.rvTweets.adapter = tweetsAdapter

    }

}