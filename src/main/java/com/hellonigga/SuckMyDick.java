package com.hellonigga;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SuckMyDick {

    private String name = null;
    private int suckCounter = 0;

    public void askName() throws IOException {
        System.out.println("What is your name, bitch?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        name = br.readLine();
    }

    public void suckRequest() throws IOException {

        for (int i = 0; i < 10; i++) {
            String answer = ask();

            if (answer.equalsIgnoreCase("y")) {
                suckDick();
            } else {
                otherWay();
            }

            if (suckCounter == 7) {
                cum();
                return;
            }
        }

        sad();

    }

    private String ask() throws IOException {
        if (name == null) {
            System.out.println("Would you kindly suck my dick?");
        } else {
            System.out.println("Would you kindly suck my dick, " + name + "?");
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    private void suckDick() {
        System.out.println("Good slave.");
        suckCounter++;
    }

    private void otherWay() {
        System.out.println("This way? *giving a hundred bucks*");
    }

    private void cum() {
        System.out.println("Ooooohhhhh! Do you like my fucking cum?!");
    }

    private void sad() {
        System.out.println("You are going to jail cus you don't know how to suck");
    }
}
