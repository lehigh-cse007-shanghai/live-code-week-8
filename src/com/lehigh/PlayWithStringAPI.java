package com.lehigh;

// https://docs.oracle.com/javase/8/docs/api/java/lang/String.html

public class PlayWithStringAPI {  // Application Program Interface:
                              // a class with some (many) well defined methods
                              // that are ready to use.
    String s = "Hello Lehigh! Hello Shanghai! Hello Biden!";

    // charAt(int index)
    void testCharAt(){
        char c = s.charAt(13);
        System.out.println(c);
        c = s.charAt(14);
        System.out.println(c);
        c = s.charAt(15);
        System.out.println(c);
    }

    // compareTo(String anotherString)

    void testCompareTo(){
        String s1 = "A888AAuuuuuA";
        String s2 = "b---bbbkkkk";
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(s2.compareToIgnoreCase(s1));
    }

    // concat(String str)
    void testConcat(){
        String s1 = "A888AAuuuuuA";
        String s2 = "b---bbbkkkk";
        System.out.println(s1.concat(s2));
    }


    // https://stackoverflow.com/questions/1049228/charsequence-vs-string-in-java
    // contains(CharSequence s)  // https://www.baeldung.com/java-char-sequence-string

    void testContains(){
        String s1 = "A888AAuuuuuA";
        String s2 = "b---bbbkkkk";
        String s3 = "AuuuuuA";
        if(s1.contains(s3)){
            System.out.println(s1 + " contains " + s3);
        }
        else{
            System.out.println("not contains.");
        }
    }

    // equals(Object anObject)
    void testEquals(){
        String s1 = "Hello";
        String s2 = "HellO";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
    }

    // equalsIgnoreCase(String anotherString)

    // format(String format, Object... args)

    // indexOf(String str)

    void testIndexOf(){
        String s1 = "A888AAuuuuuA";
        String s2 = "b---bbbkkkk";
        String s3 = "AuuuuuA";
        System.out.println(s1.indexOf('8'));
        System.out.println(s1.indexOf("AAuu"));
        System.out.println(s1.indexOf(s3));
        System.out.println(s1.indexOf(s2));
    }

    // join(CharSequence delimiter, CharSequence... elements)

    void testJoin(){
        String year = "2020";
        String month = "11";
        String day = "11";
        System.out.println(String.join("/", year, month, day));
    }

    // length()

    // replace(CharSequence target, CharSequence replacement)
    void testReplace(){
        String applianceLetter = "I would like to join MIT, very sincerely.";
        System.out.println(applianceLetter.replace("MIT", "Lehigh University"));
    }

    // split(String regex)
    void testSplit(){
        String[] arr = "Lehigh Univ".split(" ");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        String[] arr2 = "2020 - 11 - 11".split(" - ", 2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
//        System.out.println(arr2[2]);
        String[] arr3 = "2020 - 11 - 11".split(" - ");
        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);
    }

    // split(String regex, int limit)

    // startsWith(String prefix)

    // substring(int beginIndex, int endIndex)
    void testSubstring(){
        String s1 = "ABCDEFG";
        System.out.println(s1.substring(2, 5));
        System.out.println(s1.substring(2));
    }

    // toLowerCase()

    // toUpperCase()

    // trim()
    void testTrim(){
        String s1 = "   Hello    Lehigh      ";
        System.out.println(s1.trim());
        // If you want a "Hello Lehigh" (just one space between words)
        // two steps:
        // split with space " "
        // join with space " " as well
    }

    // String.valueOf(int i) // int to string: https://www.javatpoint.com/java-int-to-string
    void testValueOf(){
        String s = String.valueOf(9999);
        System.out.println(s);
    }
}
