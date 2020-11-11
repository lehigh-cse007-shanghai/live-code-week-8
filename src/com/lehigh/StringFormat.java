package com.lehigh;

public class StringFormat {

    void part1(){
        String name="sonoo";
        String sf1=String.format("name is %s",name);
        String sf12=String.format("name is %d",10009);
        String sf2=String.format("value is %f",32.33434);
        String sf3=String.format("value is %2.10f",32.33434);//returns 12 char fractional part filling with 0

        System.out.println(sf1);
        System.out.println(sf12);
        System.out.println(sf2);
        System.out.println(sf3);
    }

    void part2(){
        String str1 = String.format("%d", 101);          // Integer value
        String str2 = String.format("%s", "Amar Singh"); // String value
        String str3 = String.format("%f", 101.00);       // Float value
        String str4 = String.format("%x", 33);          // Hexadecimal value
        String str5 = String.format("%o", 65);  //65 = 1 * 8^2 + 0 * 8^1 + 1 * 8^0        // Octadecimal value
        String str6 = String.format("%c", 'c');          // Char value
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);
    }

    void part3(){
        String str1 = String.format("%d", 101);
        String str2 = String.format("|%10d|", 101);  // Specifying length of integer
        String str3 = String.format("|%-10d|", 101); // Left-justifying within the specified width
        String str4 = String.format("|  %d  |", 101);
        String str5 = String.format("|%010d|", 101); // Filling with zeroes
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
    }

    public static void main(String args[]){
        StringFormat sf = new StringFormat();
        sf.part3();
    }
}
