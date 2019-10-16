package com.company;

public class Main {

    public static void main(String[] args) {
        byte challengeByteValue = 123;
        short challengeShortValue = 22222;
        int challengeIntValue = 222222222;
        int sum = challengeByteValue + challengeIntValue + challengeShortValue;
        long challengeLongValue = 50000L + 10L * (sum);
        System.out.println(challengeLongValue);
    }
}
