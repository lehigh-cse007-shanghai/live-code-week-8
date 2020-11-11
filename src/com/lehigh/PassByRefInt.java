package com.lehigh;

class IntData {
    int data;
}

public class PassByRefInt {
    public void increaseBy10(IntData id){
        id.data += 10;
    }

    public static void main(String[] args){
        IntData id = new IntData();
        id.data = 20;
        PassByRefInt pbr = new PassByRefInt();
        pbr.increaseBy10(id);
        System.out.println(id.data);
    }
}
