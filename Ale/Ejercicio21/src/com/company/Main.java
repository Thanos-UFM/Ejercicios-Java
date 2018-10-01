package com.company;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        String nombre= String.format("%s\n%s\n%s\n%s\n%s\n%s\n%s"
                , "*   *   *****   *      ****  "
                , "** **   *   *   *      *   * "
                , "* * *   *   *   *      *   * "
                , "*   *   *****   *      *   * "
                , "*   *   *   *   *      *   * "
                , "*   *   *   *   *      *   * "
                , "*   *   *   *   *****  ****  "
        );
        System.out.print(nombre);
    }
}
