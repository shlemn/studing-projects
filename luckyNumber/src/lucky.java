import java.util.*;
public class lucky {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String numSt = sc.nextLine();
            char a[] = numSt.toCharArray();
            for (int l = 0; l < a.length; l++){
                System.out.println(a[l]);

            }System.out.println();
            int[] b = new int[numSt.length()/2];
            int[] c = new int[numSt.length()/2];
            int sumHalf1 = 0;
            int sumHalf2 = 0;
            int m = b.length;
            int n = c.length;

            for (int i = 0; i < m; i++){
                b[i] = Character.getNumericValue(a[i]);
                System.out.println(b[i]);
                sumHalf1 = sumHalf1 + b[i];
            }
            System.out.println(sumHalf1);

            for (int j = 0; j < n; j++){
                c[j] = Character.getNumericValue(a[j+m]);
                System.out.println(c[j]);
                sumHalf2 = sumHalf2 + c[j];
            }
            System.out.println(sumHalf2);
            if (sumHalf1 == sumHalf2){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }




    /*
    String numSt = "" + num;
    System.out.println(numSt);
    double[] a = new double[numSt.length()];
    for (int i = 0; i < numSt.length(); i++) {
        a[i] = num%10;
        num = num/10;
        System.out.println(a [i]);
    }


    for (int j = a.length/2; j<=a.length - 1; j++){
        sumHalf2 = sumHalf2 + a [j];
    }
    for (int h = a.length/2 - 1; h>=0; h--){
        sumHalf1 = sumHalf1 + a [h];
    }
    if (sumHalf1 == sumHalf2){
        System.out.println("YES");
    }else{
        System.out.println("NO");
    }
    **/

        }
    }