package dev.joan.twitterclone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.joan.twitterclone.databinding.TweetListItemBinding

class Adapter(var Tweets_List:List<TweetData>): RecyclerView.Adapter<TweetsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetsViewHolder {
        var binding = TweetListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
    return TweetsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TweetsViewHolder, position: Int) {
        var tweet =Tweets_List.get(position)
        holder.binding.tvDisplayName.text =tweet.displayName
        holder.binding.tvHandle.text =tweet.handle
        holder.binding.tvTweet.text =tweet.tweet
        holder.binding.tvReplyCount.text =tweet.tweet
        holder.binding.tvLikeCount.text = tweet.likeCount.toString()
        holder.binding.tvRtCount.text = tweet.rtCount.toString()

//        holder.binding.apply {
//            binding.tvDisplayName.text =tweet.displayName
//            binding.tvHandle.text =tweet.handle
//            binding.tvTweet.text =tweet.tweet
//            binding.tvReplyCount.text =tweet.tweet
//            binding.tvLikeCount.text = tweet.likeCount.toString()
//            binding.tvRtCount.text = tweet.rtCount.toString()
//        }
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}
class TweetsViewHolder(var binding:TweetListItemBinding): RecyclerView.ViewHolder(binding.root)