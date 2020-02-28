/*
День программиста отмечается в 255-й день года (при этом 1 января считается нулевым днем).
Требуется написать программу, которая определит дату (месяц и число григорианского календаря),
на которую приходится День программиста в заданном году.

В григорианском календаре високосным является:

год, номер которого делится нацело на 400
год, номер которого делится на 4, но не делится на 100
Входные данные
В единственной строке входного файла INPUT.TXT записано целое число от 1 до 9999 включительно,
 которое обозначает номер года нашей эры.

Выходные данные
В единственную строку выходного файла OUTPUT.TXT нужно вывести дату Дня программиста в формате DD/MM/YYYY,
где DD — число, MM — номер месяца (01 — январь, 02 — февраль, ..., 12 — декабрь), YYYY — год в десятичной записи.

Примеры
№	INPUT.TXT	OUTPUT.TXT
1	2000	12/09/2000
2	2009	13/09/2009
 */

import java.io.*;
import java.util.*;

public class ProgDay{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        short year = in.nextShort();

         if (year%400==0||(year%4==0&&year%100!=0)){
             if (year<10){
                 out.println("12/09/000"+year);
                 out.flush();
             } else if (year>=10&&year<100){
                 out.println("12/09/00"+year);
                 out.flush();
             }  else if (year>=100&&year<1000){
                 out.println("12/09/0"+year);
                 out.flush();
             } else if (year>=1000){
                 out.println("12/09/"+year);
                 out.flush();
             }

         } else {
             if (year<10){
                 out.println("13/09/000"+year);
                 out.flush();
             }  else if (year>=10&&year<100){
                 out.println("13/09/00"+year);
                 out.flush();
             }  else if (year>=100&&year<1000){
                 out.println("13/09/0"+year);
                 out.flush();
             } else if (year>=1000){
                 out.println("13/09/"+year);
                 out.flush();
             }
         }
    }
}