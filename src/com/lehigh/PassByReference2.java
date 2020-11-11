package com.lehigh;

public class PassByReference2 {

    public void appendAAA(StringBuilder sb){ // an object
        sb.append("AAA");
    }

    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        PassByReference2 pbr = new PassByReference2();
        pbr.appendAAA(sb);
        System.out.println(sb.toString());
    }
}