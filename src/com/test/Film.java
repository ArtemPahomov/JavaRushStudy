package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Film {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key = null;


        while ((key = reader.readLine())!=null) {
            Movie movie = MovieFactory.getMovie(key);
            if(movie==null){
                return;
            }
            System.out.println(movie.getClass().getSimpleName());
        }
    }
    static class MovieFactory{
        static Movie getMovie(String key){
            Movie movie = null;
            if ("soapOpera".equals(key)){
                movie = new SoapOpera();
            }else if("thriller".equals(key)){
                movie = new Thriller();
            }else if ("cartoon".equals(key)){
                movie= new Cartoon();
            }
            return movie;
        }
    }

    static abstract class Movie{


    }
    static class SoapOpera extends Movie{

    }static class Cartoon extends Movie{

    }static class Thriller extends Movie {

    }
}
