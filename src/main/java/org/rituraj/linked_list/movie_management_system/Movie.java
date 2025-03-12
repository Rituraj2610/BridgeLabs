package org.rituraj.linked_list.movie_management_system;

import java.time.Year;

public class Movie {
    private String movieTitle;
    private int rating;
    private Year yearOfRelease;
    private String director;

    public Movie(String movieTitle, int rating, Year yearOfRelease, String director) {
        this.movieTitle = movieTitle;
        this.rating = rating;
        this.yearOfRelease = yearOfRelease;
        this.director = director;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Year getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(Year yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieTitle='" + movieTitle + '\'' +
                ", rating=" + rating +
                ", yearOfRelease=" + yearOfRelease +
                ", director='" + director + '\'' +
                '}';
    }
}
