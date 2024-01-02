package org.example;

public class StarPrint {
    public static void main(String[] args) {
        int rows=5;
        for(int i =rows;i>=0;i--){
            for (int j =0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int a=0;a<=rows;a++){
            for (int b=0;b<a;b++){
                System.out.print("*");
            }
            System.out.println( );
        }



    }
}
