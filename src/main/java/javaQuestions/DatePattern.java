package javaQuestions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DatePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String stringValue = sc.next();
        /*
          DD
          00 --> (0[1-9])
          19  ---> (1[0-9])
          29 --> (2[0-9])
          3  -->  (3[0-1])
          (0[1-9])|(1[0-9])|(2[0-9])|(3[0-1])  **

          MM
          01 --> (0[1-9])
          10 --> (1[0-2])

          (0[1-9])|(1[0-2])**

          YYYY
          0001  --> (000[1-9])
          ([0-9]{4})  --> 0123

          (000[1-9])|([0-9]{4})**

          ((0[1-9])|(1[0-9])|(2[0-9])|(3[0-1]))-((0[1-9])|(1[0-2]))-((000[1-9])|([0-9]{4}))
          .matches("^((0[1-9])|(1[0-9])|(2[0-9])|(3[0-1]))-((0[1-9])|(1[0-2]))-((000[1-9])|([0-9]{4}))$"))
         * */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(new Date());
        System.out.println(date);
        sc.close();

    }

}
