package com.example.fabian.headfirst;

/**
 * Created by fabian on 01.07.17.
 */

public class Player {
    int number = 0;

    public void guess(){
        number = (int) (Math.random()*10);
        System.out.println("Im guessing " + number);

    }
}
