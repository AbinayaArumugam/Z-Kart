package com.zcart;

public class CheckingLayer {
    public static String encryptPassword(String str){
        String encrypted="";
        char[] ch=str.toCharArray();
        for (int i=0;i<ch.length;i++){
            if (ch[i]=='Z'){
                ch[i]='A';
            } else if (ch[i]=='z'){
                ch[i]='a';
            }
            else if(ch[i]=='9'){
                ch[i]='0';
            }char character=(char) (ch[i]+1);
            encrypted+=character;
            System.out.println("Just testing the checkin");
        }
        return encrypted;
    }
}
