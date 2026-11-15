package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomeItem = {
                "Bubblegum",
                "Toffee",
                "Ice cream",
                "Milk chocolate",
                "Doughnut",
                "Pancake"
        };
        double[] valorGanho = {
                202, 118, 2250, 1680, 1075, 80
        };
        double sum = 0;
        System.out.println("Earned amount:");
        for (int i = 0; i < 6; i++) {
            System.out.println(nomeItem[i] + ":  $" + valorGanho[i]);
            sum += valorGanho[i];
        }
        System.out.println("Income: $" + sum);
        System.out.println("Staff expenses:");
        double staffExpenses = scanner.nextDouble();
        System.out.println("Other expenses:");
        double otherExpenses = scanner.nextDouble();
        System.out.println("Net income: $" + (sum - (staffExpenses + otherExpenses)));
    }
}