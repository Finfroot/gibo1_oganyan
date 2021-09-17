package ru.mirea.gibo1.dz.dz2;
import java.lang.*;
import java.util.Scanner;

public class Calc_For {
    public static void main(String[] args) {
        int a = 0,b=0,c=0,d=0;
        Scanner num = new Scanner(System.in);
        System.out.println("Введите 4 числа ");
        a = num.nextInt();
        b = num.nextInt();
        c = num.nextInt();
        d = num.nextInt();
    int[] sum1 ={a,b,c,d};
    int sum = 0;
        for (int k = 0; k<sum1.length;k++){
    sum = (int) (sum + sum1[k]);
        }
        System.out.println("summa ravna:"+sum+"\n");
        int max =sum1[0];
        int min=sum1[0];
        for (int j = 0; j < sum1.length; j++) {
            if (sum1[j] < min)
                min = sum1[j];
            if (sum1[j] > max)
                max = sum1[j];}

        System.out.println("max= "+max+"\t"+" min= "+min);
        double average = 0;
        average = sum / sum1.length;
        System.out.println("Среднее арифметическое массива " + average);

}
                 }
