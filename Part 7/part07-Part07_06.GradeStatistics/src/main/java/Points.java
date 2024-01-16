/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suriya
 */
import java.util.*;

public class Points {

    private ArrayList<Integer> points;
    private ArrayList<Integer> passpoints;

    public Points() {
        this.points = new ArrayList<>();
        this.passpoints = new ArrayList<>();
    }

    public void add(int num) {
        if (num >= 0 && num <= 100) {
            points.add(num);
            if (num >= 50) {
                passpoints.add(num);
            }
        }
    }

    public double average() {
        int sum = 0;
        if (points.isEmpty()) {
            return 0;
        } else {
            for (int num : points) {
                sum += num;
            }
            return 1.0 * sum / points.size();
        }
    }

    public double averagePass() {
        int sum = 0;
        if (passpoints.isEmpty()) {
            return 0;
        } else {
            for (int num : passpoints) {
                sum += num;
            }
            return 1.0 * sum / passpoints.size();
        }
    }

    public double passPercentage() {
        return 100.0 * passpoints.size() / points.size();
    }

    public int gradeCount(int lower, int upper) {
        int count = 0;
        for (int grade : points) {
            if (grade >= lower && grade < upper) {
                count++;
            }
        }

        return count;
    }

    public void gradeDistribution() {
        int start = 5;
        while (start >= 0) {
            if (start == 5) {
                int count = this.gradeCount(90, 101);
                System.out.print(start + ": ");
                this.printGradeDistribution(count);
            } else if (start == 4) {
                int count = this.gradeCount(80, 90);
                System.out.print(start + ": ");
                this.printGradeDistribution(count);
            } else if (start == 3) {
                int count = this.gradeCount(70, 80);
                System.out.print(start + ": ");
                this.printGradeDistribution(count);
            } else if (start == 2) {
                int count = this.gradeCount(60, 70);
                System.out.print(start + ": ");
                this.printGradeDistribution(count);
            } else if (start == 1) {
                int count = this.gradeCount(50, 60);
                System.out.print(start + ": ");
                this.printGradeDistribution(count);
            } else {
                int count = this.gradeCount(0, 50);
                System.out.print(start + ": ");
                this.printGradeDistribution(count);
            }
            start -= 1;
            System.out.println("");
        }
    }

    public void printGradeDistribution(int repeat) {
        for (int i = 0; i < repeat; i++) {
            System.out.print("*");
        }
    }
}
