package day8_twitter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TwitterApp {

    public static void main(String[] args) {
        TwitterService twitterService = new TwitterService();

        Set<String> hashtags1 = new HashSet<>();
        hashtags1.add("#punerains");
        hashtags1.add("#flood");
        hashtags1.add("#weatherupdate");

        Set<String> hashtags2 = new HashSet<>();
        hashtags2.add("#flood");
        hashtags2.add("#weather");

        Set<String> hashtags3 = new HashSet<>();
        hashtags3.add("#sunnyday");
        hashtags3.add("#heatwave");

        twitterService.addTweet(new Tweet("Monsoon Update", LocalDate.now(), 5450, hashtags1));
        twitterService.addTweet(new Tweet("Flood Alert", LocalDate.now().minusDays(3), 122350, hashtags2));
        twitterService.addTweet(new Tweet("Summer Weather", LocalDate.now().minusMonths(1), 82520, hashtags3));
        twitterService.addTweet(new Tweet("Weekend Weather", LocalDate.now(), 25635, hashtags2));
        twitterService.addTweet(new Tweet("Heatwave Warning", LocalDate.now().minusDays(10), 22430, hashtags3));

        List<Tweet> currentMonthTweets = twitterService.listTweetsInCurrentMonth();
        System.out.println("Tweets posted in the current month:");
        currentMonthTweets.forEach(System.out::println);

        List<Tweet> floodTweets = twitterService.listTweetsByHashtag("#flood");
        System.out.println("\nTweets with hashtag #flood:");
        floodTweets.forEach(System.out::println);

        Map<String, Long> tweetCountBySubject = twitterService.countTweetsBySubject();
        System.out.println("\nCount of tweets by subject:");
        tweetCountBySubject.forEach((subject, count) -> System.out.println(subject + ": " + count));

        List<Tweet> popularTweets = twitterService.listTweetsWithMoreThan10kViews();
        System.out.println("\nTweets with more than 10k views:");
        popularTweets.forEach(System.out::println);

        List<Tweet> trendingTweets = twitterService.top5TrendingTweets();
        System.out.println("\nTop 5 trending tweets:");
        trendingTweets.forEach(System.out::println);
    }
}
