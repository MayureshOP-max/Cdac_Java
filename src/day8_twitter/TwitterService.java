package day8_twitter;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class TwitterService {
    private List<Tweet> tweets;

    public TwitterService() {
        this.tweets = new ArrayList<>();
    }

    public void addTweet(Tweet tweet) {
        tweets.add(tweet);
    }

    public List<Tweet> listTweetsInCurrentMonth() {
        LocalDate currentDate = LocalDate.now();
        return tweets.stream()
                .filter(tweet -> tweet.getDateOfPost().getMonth() == currentDate.getMonth() &&
                        tweet.getDateOfPost().getYear() == currentDate.getYear())
                .collect(Collectors.toList());
    }

    public List<Tweet> listTweetsByHashtag(String hashtag) {
        return tweets.stream()
                .filter(tweet -> tweet.getHashtags().contains(hashtag))
                .collect(Collectors.toList());
    }

    public Map<String, Long> countTweetsBySubject() {
        return tweets.stream()
                .collect(Collectors.groupingBy(Tweet::getSubject, Collectors.counting()));
    }

    public List<Tweet> listTweetsWithMoreThan10kViews() {
        return tweets.stream()
                .filter(tweet -> tweet.getNoOfViews() > 10000)
                .collect(Collectors.toList());
    }

    public List<Tweet> top5TrendingTweets() {
        return tweets.stream()
                .sorted(Comparator.comparingInt(Tweet::getNoOfViews).reversed())
                .limit(5)
                .collect(Collectors.toList());
    }
}
