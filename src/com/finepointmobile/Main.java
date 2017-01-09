package com.finepointmobile;

public class Main {

    public static void main(String[] args) {

        String original = "abcdeafgaaaaaa";
        int hasCharacter[] = new int[128];

        for (int i = 0; i < original.length(); i++) {

            Character character = original.charAt(i);
            hasCharacter[character] = hasCharacter[character] + 1;

            if (hasCharacter[character] > 1) {
                System.out.println("Has duplicates!");
                return;
            }
        }
    }
}
