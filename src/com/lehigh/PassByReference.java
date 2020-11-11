package com.lehigh;


class StringData {
    String data;
}

public class PassByReference {
    public void appendAAA(StringData sd){
        sd.data += "AAA";
    }

    public static void main(String[] args){
        StringData sd = new StringData();
        sd.data = "Hello"; // sd is an object, not a primitive
        PassByReference pbr = new PassByReference();
        pbr.appendAAA(sd);
        System.out.println(sd.data);
    }
}
