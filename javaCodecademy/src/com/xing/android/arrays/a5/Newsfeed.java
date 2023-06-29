package com.xing.android.arrays.a5;

import java.util.Arrays;

public class Newsfeed {

    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    int[] views = {0, 0, 0, 0};
    String[] favoriteArticles;

    public Newsfeed() {
        favoriteArticles = new String[10];
    }

    public void setFavoriteArticles(int favoriteIndex,String newArticle) {
        favoriteArticles[favoriteIndex] = newArticle;
    }

    public static void main(String[] args) {
        Newsfeed sampleFeed = new Newsfeed();

        sampleFeed.setFavoriteArticles(2, "Humans: Exterminate Or Not?");
        sampleFeed.setFavoriteArticles(3, "Organic Eye Implants");
        sampleFeed.setFavoriteArticles(0, "Oil News");

        System.out.println(Arrays.toString(sampleFeed.favoriteArticles));
    }
}
