package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class MovieManagerTest {

    MovieManager manager = new MovieManager();

    @BeforeEach

    public void setup() {
        manager.add("Movie1");
        manager.add("Movie2");
        manager.add("Movie3");
        manager.add("Movie4");
        manager.add("Movie5");
    }

    @Test
    public void shouldFindAllMovies() {

        String[] actual = manager.findAll();
        String[] expected = {"Movie1", "Movie2", "Movie3", "Movie4", "Movie5"};

        Assertions.assertArrayEquals(actual, expected);


    }

    @Test
    public void shouldFindFirstAndLastMovies() {


        String[] actual = {"Movie1", "Movie5"};
        String[] expected = {"Movie1", "Movie5"};

        Assertions.assertArrayEquals(actual, expected);


    }


    @Test
    public void shouldFindZeroMovies() {
        MovieManager manager = new MovieManager();

        String[] actual = manager.findAll();
        String[] expected = {};

        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    public void shouldReturnReverseMovies() {

        String[] actual = manager.findLast();
        String[] expected = {"Movie5", "Movie4", "Movie3", "Movie2", "Movie1"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldReturnReverseMoviesOverLimit() {
        MovieManager manager = new MovieManager(8);


        manager.add("Movie1");
        manager.add("Movie2");
        manager.add("Movie3");
        manager.add("Movie4");
        manager.add("Movie5");
        manager.add("Movie6");
        manager.add("Movie7");
        manager.add("Movie8");

        String[] actual = manager.findLast();
        String[] expected = {"Movie8", "Movie7", "Movie6", "Movie5", "Movie4", "Movie3", "Movie2", "Movie1"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldReturnReverseMoviesUnderLimit() {
        MovieManager manager = new MovieManager();


        manager.add("Movie1");
        manager.add("Movie2");
        manager.add("Movie3");
        manager.add("Movie4");


        String[] actual = manager.findLast();
        String[] expected = {"Movie4", "Movie3", "Movie2", "Movie1"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldTestOverLimitMovies() {
        MovieManager manager = new MovieManager();
        manager.add("Movie1");
        manager.add("Movie2");
        manager.add("Movie3");
        manager.add("Movie4");
        manager.add("Movie5");
        manager.add("Movie6");
        manager.add("Movie7");
        manager.add("Movie8");


        String[] actual = manager.findAll();
        String[] expected = {"Movie1", "Movie2", "Movie3", "Movie4", "Movie5", "Movie6", "Movie7", "Movie8"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldTestUnderLimitMovies() {
        MovieManager manager = new MovieManager();
        manager.add("Movie1");
        manager.add("Movie2");
        manager.add("Movie3");
        manager.add("Movie4");


        String[] actual = manager.findAll();
        String[] expected = {"Movie1", "Movie2", "Movie3", "Movie4"};

        Assertions.assertArrayEquals(actual, expected);
    }
}
