import java.util.Scanner;

public class simmetry {
    public static String intToString(String input) {
        while (input.length() < 4) input = "0" + input;
        return input;
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String s = sr.next();
        s=intToString(s);
        int a = Integer.parseInt(s);

        int x4 = a/1000;
        int x3 = a%1000/100;
        int x2 = a%100/10;
        int x1 = a%10;

        if ((10*x4+x3)==(10*x1+x2))
            System.out.print(1);
        else
            System.out.print(2);
    }
}

