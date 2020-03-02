package difficulty_13;/*
Как и многие другие девочки, Маша любит разные гадания.
Некоторое время назад Маша узнала новый способ гадать на числах – для какого-нибудь интересующего ее
натурального числа n надо посчитать сумму всех чисел, на которые n делится без остатка.
Маша не очень любит арифметику, и попросила вас написать программу, которая автоматизирует процесс гадания.

Входные данные
В единственной строке входного файла INPUT.TXT записано натуральное число n (n ≤ 1000),
которое Маша была вынуждена сообщить.

Выходные данные
В выходной файл OUTPUT.TXT выведите сумму всех натуральных делителей числа n.

Примеры
№	INPUT.TXT	OUTPUT.TXT
1	6	12
2	10	18
 */
import java.io.*;
import java.util.*;

public class Divination{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        short n = in.nextShort();
        int sum = n;
        for (int i = n/2; i >=1 ; i--) {
            if (n%i==0){
                sum+=i;
            }
        }
        out.println(sum);
        out.flush();
    }
}