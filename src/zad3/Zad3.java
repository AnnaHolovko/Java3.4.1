package zad3;

import java.util.Scanner;

public class Zad3 {

    public static void main(String[] args) {
      /* 1. Создать 5 переменных различного содержания
         2. Создать массив, содержащий ФИО Ваших родственников
         3. Вывести значения массива в консоль, снабдив их текстовыми комментариями (Например, это мой папа - , это моя мама -…)
         4. Реализовать ввод данных для строки
         5. Реализовать ввод данных в массив
         6. Преобразовать переменную типа данных int в String, String в int, double в int, int в double.
         7. Оформить отчет о выполнении задания */

//1
        int ik=10;
        System.out.println("int     " + ik);
        long bk=7;
        System.out.println("long    " + bk);
        float fk=67;
        System.out.println("float   " + fk);
        double dk=3.1;
        System.out.println("double  " + dk);
        char gh='g';
        System.out.println("char    " + gh+"\n");
//2
        String[] Family1 = {"H.P.V.", "H.E.V.", "H.A.P."};
        for (int i = 0; i < Family1.length; i++) {
            System.out.println("ФИО [" + i + "]=" + Family1[i]);
        }
//3
        String Family[]={"H.P.V.","H.E.V","H.A.P."};
        System.out.print("fathers' FIO: " +Family[0]+"\n");
        System.out.print("mothers' FIO: " +Family[1]+"\n");
        System.out.print("my       FIO: " +Family[2]+"\n"+"\n");
//4
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        String s;
        System.out.print("vvedite stroku: ");
        s = sc.nextLine();
        System.out.println(s+"\n");
//5
        String[] mass= new String[10];
        Scanner ms = new Scanner(System.in);
        for(int i=1; i<10; i++) {
        System.out.print("vvedite element massiva:    ");
        mass[i]=ms.nextLine(); 
        System.out.println("mass[" + i +"]="+ mass[i]);}
//6
        //String в int
        String mString = "hello"; // строка
        Scanner dec = new Scanner(System.in);
        mString= dec.nextLine();
        int mInt = Integer.parseInt(mString);
        System.out.println(mInt);
        
        //int в String  
        int number = 1;
        String numberString = String.valueOf(number);
        System.out.println(numberString);
        
        //double в int
        double f = 2.2;
        int a = 1;
        f=a;
        System.out.println(a);
        
        //int в double.
        int n=4;
        double r=(double)n;
        System.out.println(r);
    }
}
