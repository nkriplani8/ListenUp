package com.example.listenup.model;

import com.example.listenup.model.results.results;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Feed {

    @SerializedName("resultCount")
    @Expose
    private int resultCount;
    @SerializedName("results")
    @Expose
    private ArrayList<com.example.listenup.model.results.results>results;

    public int getResultCount() {
        return resultCount;
    }

    public void setResultCount(int resultCount) {
        this.resultCount = resultCount;
    }

    public ArrayList<results> getResults() {
        return results;
    }

    public void setResults(ArrayList<results> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Feed{" +
                "resultCount=" + resultCount +
                ", results=" + results +
                '}';
    }
}
