package com.lehigh;

public class MultilineString {

    public void printMultilineString_1(){
        String s = "It was the best of times, it was the worst of times,\n"
                + "it was the age of wisdom, it was the age of foolishness,\n"
                + "it was the epoch of belief, it was the epoch of incredulity,\n"
                + "it was the season of Light, it was the season of Darkness,\n"
                + "it was the spring of hope, it was the winter of despair,\n"
                + "we had everything before us, we had nothing before us";
        System.out.println(s);
    }

    public void printMultilineString_2(){
        String s = new StringBuilder()
                .append("It was the best of times, it was the worst of times,\n")
                .append("it was the age of wisdom, it was the age of foolishness,\n")
                .append("it was the epoch of belief, it was the epoch of incredulity,\n")
                .append("it was the season of Light, it was the season of Darkness,\n")
                .append("it was the spring of hope, it was the winter of despair,\n")
                .append("we had everything before us, we had nothing before us")
                .toString();
        System.out.println(s);
    }

    public void printMultilineString_3(){
        String s = String.format("%s\n%s\n%s\n%s\n%s\n%s"
                , "It was the best of times, it was the worst of times,"
                , "it was the age of wisdom, it was the age of foolishness,"
                , "it was the epoch of belief, it was the epoch of incredulity,"
                , "it was the season of Light, it was the season of Darkness,"
                , "it was the spring of hope, it was the winter of despair,"
                , "we had everything before us, we had nothing before us"
        );
        System.out.println(s);
    }

    public void printMultilineString_4(){
        String s = String.join("\n"
                , "It was the best of times, it was the worst of times,"
                , "it was the age of wisdom, it was the age of foolishness,"
                , "it was the epoch of belief, it was the epoch of incredulity,"
                , "it was the season of Light, it was the season of Darkness,"
                , "it was the spring of hope, it was the winter of despair,"
                , "we had everything before us, we had nothing before us"
        );
        System.out.println(s);
    }

}
