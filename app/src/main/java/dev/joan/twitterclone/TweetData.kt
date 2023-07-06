package dev.joan.twitterclone

data class TweetData(
    var avatar:String,
    var displayName: String,
    var handle:String,
    var tweet:String,
    var replyCount:String,
    var rtCount:String,
    var likeCount:String
)
