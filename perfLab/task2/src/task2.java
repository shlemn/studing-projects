import java.util.Scanner;

public class task2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

        int s1 = sign(x, y, x1, y1, x2, y2);
        int s2 = sign(x, y, x2, y2, x3, y3);
        int s3 = sign(x, y, x3, y3, x4, y4);
        int s4 = sign(x, y, x4, y4, x1, y1);

        if (s1 < 0 && s2 < 0 && s3 < 0 && s4 < 0) { //если все имеют один знак и этот знак отрицательный при задании точек по часовой стрелке то точка будет внутри 4-хугольника
            System.out.println("in");              //если точки задаются против часовой то знаки должны быть одинаковые и положительные
        } else if (x1 == x && y1 == y || x2 == x && y2 == y || x3 == x && y3 == y || x4 == x && y4 == y) {
            System.out.println("top");
        } else if (s1 == 0 || s2 == 0 || s3 == 0 || s4 == 0) {
            System.out.println("side");
        } else {
            System.out.println("out");
        }
    }

    public static int sign(int px, int py, int ax, int ay, int bx, int by) { //определение знака
        return (bx - ax) * (py - ay) - (by - ay) * (px - ax);
    }
}

