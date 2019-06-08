import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class task1 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] a = new int[length];
        int sum = 0;
        for (int i = 0; i < length; i++){
            a[i] = sc.nextInt();
           // System.out.print(a[i] + " ");
        }

        /*File file = new File("input.txt");
        int length = 0;

            Scanner sc = new Scanner(file);
            while (sc.hasNextInt()) {
                System.out.println(sc.nextInt());
                length++;
            }
        System.out.println(length);




        int sum = 0;
        int a[] = new int[length];




            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
                System.out.println(a[i]);
            } */




         /*   int sum = 0;
        try {
            Scanner s = new Scanner(new File("input.txt"));
            int[] a = new int[s.nextInt()];
            for (int i = 0; i < a.length; i++) a[i] = s.nextInt();

        }
        catch (FileNotFoundException e) {
            System.out.println("No file found: " + file);
        }*/
        bubbleSort(a);
        for (int i = 0; i < a.length; i++){
            //System.out.print(a[i] + " ");
            sum += a[i];
        }

        //поиск проценталя 90
        double proc = Math.ceil(90/100d*a.length);
        System.out.println("\n90 percentile " + a[(int) proc - 1]);

        //поиск медианы
        double me;
        if (a.length%2 == 0){ //если четное число элементов, то медиана находится как среднее двух центральных элементов
            me = (double) (a[a.length/2] + a[a.length/2 - 1])/2;
        }else{
            me = a[a.length/2];
        }

        //нахождение среднего
        double avg;
        avg = (double) sum/a.length;
        System.out.print("median " + me);
        System.out.print("\naverage " + avg);
        System.out.println("\nmax " + a[a.length-1]);
        System.out.println("min " + a[0]);

    }

    //сортировка пузырьком
    public static void bubbleSort(int[] a){
        for(int i = a.length - 1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( a[j] > a[j + 1] ){
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
        System.out.println();
    }


}
