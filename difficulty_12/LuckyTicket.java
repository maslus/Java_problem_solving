package difficulty_12;/*
Вы пользуетесь общественным транспортом? Вероятно, вы расплачивались за проезд и получали билет с номером.
Счастливым билетом называют такой билет с шестизначным номером, где сумма первых трех цифр равна сумме последних трех.
 Т.е. билет с номером 385916 – счастливый, т.к. 3+8+5=9+1+6. Вам требуется написать программу, которая проверяет
 счастливость билета.

Входные данные
В единственной строке входного файла INPUT.TXT записано одно целое число N (0 ≤ N < 106).

Выходные данные
В выходной файл OUTPUT.TXT нужно вывести «YES», если билет с номером N счастливый и «NO» в противном случае.

Примеры
№	INPUT.TXT	OUTPUT.TXT
1	385916	YES
2	123456	NO
 */
import java.io.*;
import java.util.*;

public class LuckyTicket{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = in.nextInt(); //385916
        int e = N/10;       //38591
        int d = N/100;     //3859
        int c = N/1000;    //385
        int b = N/10000;  //38

        int aa = N/100000; //3
        int bb = b-aa*10;  //8
        int cc = c-b*10;    //5

        int dd = d-c*10;
        int ee = e-d*10;
        int ff = N-e*10;


        if (aa+bb+cc==dd+ee+ff){
            out.println("YES");
            out.flush();
        }else {
            out.println("NO");
            out.flush();
        }
    }
}
