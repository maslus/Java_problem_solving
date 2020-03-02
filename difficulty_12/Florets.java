package difficulty_12;/*В рождественский вечер на окошке стояло три цветочка, слева направо: герань, крокус и фиалка.
Каждое утро Маша вытирала окошко и меняла местами стоящий справа цветок с центральным цветком.
А Таня каждый вечер поливала цветочки и меняла местами левый и центральный цветок.
Требуется определить порядок цветов ночью по прошествии K дней.

        Входные данные
        Во входном файле INPUT.TXT содержится натуральное число K – число дней (K ≤ 1000).

        Выходные данные
        В выходной файл OUTPUT.TXT требуется вывести три английских буквы: «G», «C» и «V» (заглавные буквы без пробелов),
        описывающие порядок цветов на окошке по истечении K дней (слева направо).
        Обозначения: G – герань, C – крокус, V – фиалка.

        Примеры
        №	INPUT.TXT	OUTPUT.TXT
        1	1	VGC
        2	5	CVG
*/

import java.io.*;
import java.util.*;

public class Florets{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        short K = in.nextShort();
        char[]arr={'G','C','V'};
        for (int i = 0; i < K; i++) {
            char temp = arr[2];
            arr[2]=arr[1];
            arr[1]=arr[0];
            arr[0]=temp;
        }
        for (int i = 0; i <3 ; i++) {
            out.print(arr[i]);
            out.flush();
        }

    }
}