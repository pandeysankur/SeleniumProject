package org.example;

public class ReversingSring {
    public static void main(String[] args) {
        String orignal="java";
        StringBuilder buffer=new StringBuilder(orignal);
        System.out.println(buffer.reverse());
//----------------------------------------------------
        char[] chars=orignal.toCharArray();
        for (int i = chars.length-1;i>=0;i--){
            System.out.println(chars[i]);
        }
        //--------------------------------------------------
        System.out.println(reverseString(orignal));
    }
    //----------------------------------------------------------
    public static String reverseString(String str) {
        if (str.isEmpty())
            return str;
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
