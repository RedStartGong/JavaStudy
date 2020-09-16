package com.mhys.cinima;

public class Cinema {
    private Movie[] movies;

    public void addMovie(Movie movie) {
        if(movies == null) {
            movies = new Movie[1];
            movies[0] = movie;
        } else {
            int len = movies.length;
            Movie[] newMovies = new Movie[len + 1];
            for (int i = 0; i < len; i++) {
                newMovies[i] = movies[i];
            }
            newMovies[len + 1 -1] = movie;
            movies = newMovies;
        }
    }

    public void showMovies() {
        if (movies == null) {
            System.out.println("本影院暂时还没有电影");
            return;
        }
        for (int i = 0; i < movies.length; i++) {
            movies[i].showInfo();
        }
    }
}
