/*
Однажды известный профессор обнаружил описания k конечных автоматов. По его мнению, нетривиальность конечного автомата,
имеющего n состояний и m переходов, можно описать целым числом d = 19m + (n + 239)*(n + 366) / 2 .
Чем больше d, тем больший интерес для науки представляет изучение его свойств.

Помогите профессору вычислить нетривиальность имеющихся у него автоматов.

Входные данные
Первая строка входного файла INPUT.TXT содержит целое число k (1 ≤ k ≤ 10000) – количество конечных автоматов.
Следующие k строк содержат по два целых числа ni (0 ≤ ni ≤ 1000) и mi (0 ≤ mi ≤ 26ni2) – число состояний
и переходов i-го автомата.

Выходные данные
Выходной файл OUTPUT.TXT должен состоять из k строк. На i-й строке выходного файла выведите одно число –
нетривиальность i-го автомата.
 */

import java.io.*;
import java.util.*;

public class StateMachine {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int k = in.nextInt();
        int[]n = new int[k];
        int[]m= new int[k];
        long[]d=new long[k];
        for (int i = 0; i < k; i++) {
            n[i] = in.nextInt();
            m[i] = in.nextInt();
            d[i] = 19*m[i] + (n[i] + 239)*(n[i] + 366) / 2;
        }

        for (int j = 0; j < k; j++) {
            System.out.println(d[j]);
        }
    }
}
/*
4
2 0
13 20
5 23
18 6	44344
48134
45699
49458

	2
15 20
1000 26000
48767
1340237
 */