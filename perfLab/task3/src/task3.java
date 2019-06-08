/*В магазине 5 касс, в каждый момент времени к кассе стоит очередь некоторой длины. 
Каждые 30 минут измеряется средняя длина очереди в каждую кассу и для каждой кассы это значение (число вещественное) 
записывается в соответсвующий ей файл (всего 5 файлов), магазин работает 8 часов в день. 
Рассматривается только один день. На момент запуска приложения все значения уже находятся в файлах. 
Написать программу, которая по данным замеров определяет интервал времени, когда в магазине было наибольшее количество посетителей за день. 
Будем считать что магазин работает с 12:00 до 20: 00, тогда первый замер производится в 12:00, второй 12:30 и тд. В сумме получится 17 замеров за рабочий день */
import java.util.Scanner;
public class task3{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int[] a = new int[17];
        System.out.println();
        for (int i = 0; i < 17; i++){
            a[i] = sc.nextInt();
            //System.out.print(a[i] + " ");
        }


        int[] b = new int[17];
        System.out.println();
        for (int i = 0; i < 17; i++){
            b[i] = sc.nextInt();
            //System.out.print(b[i] + " ");
        }
        int[] c = new int[17];
        System.out.println();
        for (int i = 0; i < 17; i++){
            c[i] = sc.nextInt();
            //System.out.print(c[i] + " ");
        }
        int[] d = new int[17];
        System.out.println();
        for (int i = 0; i < 17; i++){
            d[i] = sc.nextInt();
            //System.out.print(d[i] + " ");
        }
        int[] e = new int[17];
        System.out.println();
        for (int i = 0; i < 17; i++){
            e[i] = sc.nextInt();
            //System.out.print(e[i] + " ");
        }
        int max = a[0]+b[0]+c[0]+d[0]+e[0];
        int n = 0;
        for (int i = 1; i < 17; i++){
            if ((a[i]+b[i]+c[i]+d[i]+e[i]) > max){
                max = a[i]+b[i]+c[i]+d[i]+e[i];
                n = i;
            }
        }
        System.out.println("\n" + max);
        System.out.println(n);

        if ((double) n%2 == 0){
            System.out.println("period in "+ n/2);
        }else{
            System.out.println("period in " + n/2 + ":30");
        }



    }
    /*public static void deffArr (int arr[]){
        System.out.println();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 17; i++){
            arr[i] = sc.nextInt();
            System.out.print(arr[i] + " ");
            
        }
        
    }*/
}