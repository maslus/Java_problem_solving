package difficulty_15;/*
Вася готовит инвентарь для ролевой игры. В игре должны принять участие n игроков,
каждый из которых будет изображать персонажа фантастического мира.
В процессе игры каждый персонаж будет обладать некоторым уровнем x, который представляет собой целое число от 1 до m.

Для обозначения уровня планируется использовать специальные значки двух цветов. Белый значок обозначает один уровень,
а красный значок – k уровней. Игрок, изображающий персонажа с уровнем x, должен иметь a белых значков и b красных значков,
чтобы сумма (a + b*k) была равна x. При этом персонажу не разрешается иметь более чем (k – 1) белых значков.

Значки для игры готовятся заранее, однако уровни персонажей заранее неизвестны.
Для успешного проведения игры всем персонажам необходимо выдать соответствующее их уровням количество значков.
Возникает вопрос: какое минимальное суммарное количество значков необходимо подготовить
для успешного проведения игры при любых уровнях участвующих персонажей.

Требуется написать программу, которая по заданным числам n, m и k вычисляет минимальное количество значков,
которое необходимо подготовить для успешного проведения игры.

Входные данные
Входной файл INPUT.TXT содержит расположенные в одной строке три целых числа:
n, m и k (1 ≤ n ≤ 104, 1 ≤ m ≤ 105, 1 ≤ k ≤ 105).

Выходные данные
В выходной файл OUTPUT.TXT выведите одно целое число — минимальное количество значков, которое требуется подготовить.

Пример
№	INPUT.TXT	OUTPUT.TXT
1	3 4 2	    9
 */

import java.io.*;
import java.util.*;

public class RolePlay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int b = 0;
        if (k != 0 && k <= m) {
            b = m / k;
        }
        int a = 0;
        if (k != 0 && k<=m) {
            a = k - 1;
        } else if (k==0||k>m){
            a = m;
        }

        out.println(n * (a + b));
        out.flush();
    }
}