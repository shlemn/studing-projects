import java.util.Scanner;

class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a+b>c&&a+c>b&&b+c>a&&a>0&&b>0&&c>0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }


    }
}
