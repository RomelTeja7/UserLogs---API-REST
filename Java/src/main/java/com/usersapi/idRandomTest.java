package com.usersapi;

import java.util.Random;

/**
 *
 * @author Romel
 */
public class idRandomTest {
    
    public static String randomId(String firstName, String lastName) {
        if (firstName == null || lastName == null || firstName.isEmpty() || lastName.isEmpty()) {
            throw new IllegalArgumentException("Names cannot be empty");
        }

        char firstInitial = firstName.charAt(0);
        char lastInitial = lastName.charAt(0);

        int randomNumber = 100_000_000 + new Random().nextInt(900_000_000);

        return String.valueOf(firstInitial) + lastInitial + randomNumber;
    }

    public static void main(String[] args) {
        System.out.println(randomId("Romel", "Tejada"));
    }
}