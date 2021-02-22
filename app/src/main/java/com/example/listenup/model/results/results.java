package com.example.listenup.model.results;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class results {
    @SerializedName("artistName")
    @Expose
    private String artistName;
    @SerializedName("trackName")
    @Expose
    private String trackName;
    @SerializedName("artworkUrl100")
    @Expose
    private String artworkUrl100;

    public String getArtworkUrl100() {
        return artworkUrl100;
    }

    public void setArtworkUrl100(String artworkUrl100) {
        this.artworkUrl100 = artworkUrl100;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }


    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    @Override
    public String toString() {
        return "results{" +
                "artistName='" + artistName + '\'' +
                ", trackName='" + trackName + '\'' +
                ", artworkUrl100='" + artworkUrl100 + '\'' +
                '}';
    }
}
