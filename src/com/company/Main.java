package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите номер задания. Всего заданий 6.");
        Scanner scanner =new Scanner(System.in);
        int n=(new Scanner(System.in)).nextInt();
        switch (n)
        {
            case 1:  System.out.println("Введите свое имя");
                Scanner scan= new Scanner(System.in);
                String name=scan.next();
                System.out.println("Привет " + name);break;
            case 2:
                System.out.println("Vvedite slovo");
                Scanner scan2=new Scanner(System.in);
                String a=scan2.next();
                char[] b=a.toCharArray();
                for (int i = b.length - 1; i >= 0; --i){
                    System.out.println(b[i]);}
                    break;
            case 3:
                System.out.println("Введиче число");
                Scanner s=new Scanner(System.in);
                Random ran=new Random();
                int A1=Integer.parseInt(s.next());
                String r=" ";

                for ( int i = 0; i < A1; i++) {
                    r=r+String.valueOf(ran.nextInt(10)+" ");
                }
                System.out.println(r);
                for (int i = 0; i < A1; i++) {
                    System.out.println(ran.nextInt(10)+" ");
                } break;
            case 4:
                System.out.println("Введите верный пароль ");
                Scanner scan3 = new Scanner(System.in);
                String parol = scan3.next();
                scan3.close();
                if(parol.equals("1260")){
                    System.out.println("Пароль верный ");
                }
                else
                {
                    System.out.println("Пароль не верный");
                }
                break;
            case 5:
                Scanner scanner1 = new Scanner(System.in);
                System.out.print("Ввести  числа: ");
                int value = scanner1.nextInt();
                int sum = 0;
                while (value != 0) {

                    sum = sum + value % 10;
                    value = value / 10;

                }
                System.out.println("sum = " + sum);break;
            case 6:  System.out.print("Сколько целых чисел вы собираетесь ввести? ");
                Scanner scanner2 = new Scanner(System.in);
                int A2 = scanner2.nextInt();
                int[] m = new int[A2];
                System.out.print("Введите целые числа через пробел ");
                for (int i = 0; i < A2; i++) {
                    m[i] = scanner.nextInt();
                }
                for (int i = 0; i < A2; i++)
                    if (m[i] % 2 != 0)
                        System.out.println("Нечётное число:" + m[i]);
                    else if (m[i] % 2 == 0)
                        System.out.println("Чётное число:" + m[i]);
                int min = m[0];
                for (int i = 0; i < A2; i++) {
                    if (min > m[i])
                        min = m[i];
                }
                System.out.println("Мин. число:" + min);
                int max = m[0];
                for (int i = 0; i < A2; i++) {
                    if (max < m[i])
                        max = m[i];
                }
                System.out.println("Макс. число:" + max);
                for (int i = 0; i < A2; i++)
                    if ((m[i] % 3 == 0) || (m[i] % 9 == 0))
                        System.out.println("Число, которое делится на 3 или 9: " + m[i]);

                for (int i = 0; i < A2; i++)
                    if ((m[i] % 5 == 0) || (m[i] % 7 == 0))
                        System.out.println("Число, которое делится на 5 и 7: " + m[i]);
                for (int j = 0; j < A2-2; j++)
                    if (((m[j]) + (m[j + 2])) / 2 == m[j + 1]) {
                        System.out.println("Элементы, которые равны полусумме соседних элементов: " + m[j + 1]);
                    }
                    break;
        }
    }
}
