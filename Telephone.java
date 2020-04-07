/*
Услуги телефонной сети оплачиваются по следующему правилу: за разговоры до А минут в месяц – В рублей за минуту,
а разговоры сверх установленной нормы оплачиваются из расчета С рублей за минуту. Требуется написать программу,
вычисляющую плату за пользование телефоном для разговоров продолжительностью Т минут в месяц.

Входные данные
Входной файл INPUT.TXT содержит натуральные числа A, B, C и T, не превышающие 1000.
Числа располагаются в одной строке и разделены пробелами.

Выходные данные
В выходной файл OUTPUT.TXT выведите единственное целое число – месячную плату за пользование телефоном.

Примеры
№	INPUT.TXT	OUTPUT.TXT
1	30 2 3 30	60
2	20 1 3 30	50
 */

import java.io.*;
import java.util.*;

public class Telephone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int T = in.nextInt();
        if (T <= A) {
            out.println(T * B);
            out.flush();
        } else {
            out.println((A * B) + (T - A) * C);
            out.flush();
        }
    }
}
