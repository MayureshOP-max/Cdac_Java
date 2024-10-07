package day8_twitter;

import java.time.LocalDate;
import java.util.Set;

public class Tweet {
    private String subject;
    private LocalDate dateOfPost;
    private int noOfViews;
    private Set<String> hashtags;

    public Tweet(String subject, LocalDate dateOfPost, int noOfViews, Set<String> hashtags) {
        this.subject = subject;
        this.dateOfPost = dateOfPost;
        this.noOfViews = noOfViews;
        this.hashtags = hashtags;
    }

    public String getSubject() {
        return subject;
    }

    public LocalDate getDateOfPost() {
        return dateOfPost;
    }

    public int getNoOfViews() {
        return noOfViews;
    }

    public Set<String> getHashtags() {
        return hashtags;
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "subject='" + subject + '\'' +
                ", dateOfPost=" + dateOfPost +
                ", noOfViews=" + noOfViews +
                ", hashtags=" + hashtags +
                '}';
    }
}
