package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MovieManagerTest {

    MovieManager manager = new MovieManager();


    @Test
    public void shouldFindLastMoviesByLimit() {
        MovieManager manager = new MovieManager(3);

        manager.add("Movie1");
        manager.add("Movie2");
        manager.add("Movie3");


        String[] actual = manager.findLast();
        String[] expected = {"Movie3", "Movie2", "Movie1"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldFindLastMoviesLowerLimit() {
        MovieManager manager = new MovieManager(3);

        manager.add("Movie1");
        manager.add("Movie2");


        String[] actual = manager.findLast();
        String[] expected = {"Movie2", "Movie1"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldNotFindLastMoviesOverLimit() {
        MovieManager manager = new MovieManager(3);

        manager.add("Movie1");
        manager.add("Movie2");
        manager.add("Movie3");
        manager.add("Movie4");


        String[] actual = {};
        String[] expected = {};

        Assertions.assertArrayEquals(actual, expected);
    }


    @Test
    public void shouldFindAllMovies() {

        manager.add("Movie1");
        manager.add("Movie2");
        manager.add("Movie3");
        manager.add("Movie4");
        manager.add("Movie5");

        String[] actual = manager.findAll();
        String[] expected = {"Movie1", "Movie2", "Movie3", "Movie4", "Movie5"};

        Assertions.assertArrayEquals(actual, expected);


    }


    @Test
    public void shouldFindZeroMovies() {


        String[] actual = manager.findAll();
        String[] expected = {};

        Assertions.assertArrayEquals(actual, expected);

    }


    @Test
    public void shouldTestUnderLimitMovies() {

        manager.add("Movie1");
        manager.add("Movie2");
        manager.add("Movie3");
        manager.add("Movie4");


        String[] actual = manager.findAll();
        String[] expected = {"Movie1", "Movie2", "Movie3", "Movie4"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldFindMoviesOverLimit() {

        manager.add("Movie1");
        manager.add("Movie2");
        manager.add("Movie3");
        manager.add("Movie4");
        manager.add("Movie5");
        manager.add("Movie6");


        String[] actual = manager.findAll();
        String[] expected = {"Movie1", "Movie2", "Movie3", "Movie4", "Movie5", "Movie6"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldFindLastMovies() {

        manager.add("Movie1");
        manager.add("Movie2");
        manager.add("Movie3");
        manager.add("Movie4");
        manager.add("Movie5");


        String[] actual = manager.findLast();
        String[] expected = {"Movie5", "Movie4", "Movie3", "Movie2", "Movie1"};

        Assertions.assertArrayEquals(actual, expected);
    }

}
