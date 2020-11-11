package com.lehigh;

public class PassByValue {

    // primitive type
    public void appendAAA(String s){
        s += "AAA";
    }

    public static void main(String[] args){
        String s = "Hello"; // primitive, just like int, double, float, char
        PassByValue pbv = new PassByValue();
        pbv.appendAAA(s);
        System.out.println(s);
    }
}
