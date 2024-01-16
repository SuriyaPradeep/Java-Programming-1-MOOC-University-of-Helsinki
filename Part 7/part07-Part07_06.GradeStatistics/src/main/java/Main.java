
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Points points = new Points();
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num == -1) {
                break;
            }
            points.add(num);
        }
        System.out.println("Point average (all): " + points.average());
        if (points.averagePass() == 0.0) {
            System.out.println("Point average (passing):-");
        } else {
            System.out.println("Point average (passing): " + points.averagePass());
        }
        System.out.println("Pass percentage: " + points.passPercentage());
        System.out.println("Grade distribution:");
        points.gradeDistribution();
    }
}
