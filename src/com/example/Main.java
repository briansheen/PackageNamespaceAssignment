package com.example;

import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.CharUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.MutablePair;

public class Main {

    public static void main(String[] args) {

        Boolean bUtilsCheck = new Boolean(null);
        Boolean cUtilsCheck = new Boolean(false);

        Foo myTweet = new Foo();
        myTweet.setTweet("this is my first tweet!");
        myTweet.setNumberofchars(StringUtils.length(myTweet.getTweet()));
        System.out.println(myTweet);

        Foo myTweet2 = new Foo();
        myTweet2.setTweet("this is my second tweet!");
        myTweet2.setNumberofchars(StringUtils.length(myTweet2.getTweet()));

        System.out.println(myTweet2);
        System.out.println("does my first tweet equal my second tweet? " + myTweet.equals(myTweet2));
        System.out.println(myTweet.hashCode());
        System.out.println(myTweet2.hashCode());

        myTweet.setTweet("this is my third tweet!");
        myTweet.setNumberofchars(StringUtils.length(myTweet.getTweet()));
        System.out.println(myTweet);

        myTweet2.setTweet("this is my third tweet!");
        myTweet2.setNumberofchars(StringUtils.length(myTweet2.getTweet()));

        System.out.println(myTweet2);
        System.out.println("does my first tweet equal my second tweet? " + myTweet.equals(myTweet2));
        System.out.println(myTweet.hashCode());
        System.out.println(myTweet2.hashCode());


        System.out.println(BooleanUtils.isNotFalse(bUtilsCheck));
        bUtilsCheck = BooleanUtils.toBooleanObject(1);
        System.out.println(BooleanUtils.toStringTrueFalse(bUtilsCheck));
        System.out.println(BooleanUtils.toStringYesNo(bUtilsCheck));
        System.out.println(BooleanUtils.toStringOnOff(bUtilsCheck));
        bUtilsCheck = BooleanUtils.negate(bUtilsCheck);
        System.out.println(String.valueOf(BooleanUtils.toInteger(bUtilsCheck)));

        MutablePair mp = new MutablePair(bUtilsCheck, cUtilsCheck);
        mp.setRight(true);
        cUtilsCheck = (Boolean) mp.getRight();

        System.out.println(BooleanUtils.compare(bUtilsCheck, cUtilsCheck));

        mp.setRight(false);
        mp.setLeft(true);
        bUtilsCheck = (Boolean) mp.getLeft();
        cUtilsCheck = (Boolean) mp.getRight();

        System.out.println(BooleanUtils.compare(bUtilsCheck, cUtilsCheck));

        String random = RandomStringUtils.random(20);
        System.out.println(random);

        char[] charArray = random.toCharArray();
        String[] stArray = new String[charArray.length];
        for (int i = 0; i < charArray.length; ++i) {
            stArray[i] = CharUtils.unicodeEscaped(charArray[i]);
            System.out.print(stArray[i] + " ");
        }

        random = RandomStringUtils.randomNumeric(20);
        System.out.println("\n"+random);

        random = RandomStringUtils.randomGraph(5, 20);
        System.out.println(random);

        random = RandomStringUtils.randomAlphabetic(20);
        System.out.println(random);

        charArray = random.toCharArray();

        for (int i = 0; i < charArray.length; ++i) {
            stArray[i] = CharUtils.unicodeEscaped(charArray[i]);
            System.out.print(stArray[i] + " ");
        }

    }


}

