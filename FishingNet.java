//Рыболовная сеть
//        (Время: 1 сек. Память: 16 Мб Сложность: 10%)
//
//        Браконьер Петрович использует распространенный незаконный способ рыбалки с использованием рыболовной сети. Но проблема в том, что крупная рыба часто рвет сеть и приходится ее восстанавливать. Однажды Петрович задумался: какое максимальное количество повреждений может быть в рыболовной сети, таких, что сеть не будет разорвана на части? Вам предстоит помочь ему в вычислениях.
//
//        Сеть имеет прямоугольную форму размером M×N узлов, все смежные узлы соединены леской. Под разрывом будем понимать только единичный обрыв лески между двумя смежными узлами сети.
//
//        Например, если сеть имеет размер 2х2, то внешний вид сети будет напоминать квадрат, где допустим только один разрыв в одном из четырех возможных соединений, т.к. любые 2 разрыва приведут к разделению сети на 2 части.
//
//        Входные данные
//        Входной файл INPUT.TXT содержит два целых числа M и N – размеры рыболовной сети (1 ≤ M, N ≤ 10 000).
//
//        Выходные данные
//        В выходной файл OUTPUT.TXT выведите максимальное число разрывов заданной сети, которые не приведут к распадению рыболовной снасти Петровича.

import java.io.PrintWriter;
import java.util.Scanner;

public class FishingNet{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        long a = in.nextInt();
        long b = in.nextInt();

        out.print((a-1)*(b-1));

        out.flush();
    }
}