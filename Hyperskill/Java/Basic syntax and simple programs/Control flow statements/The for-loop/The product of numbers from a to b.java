//https://hyperskill.org/learn/step/2742

import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int left = scanner.nextInt();
        int right = scanner.nextInt();
 
        long prod = 1;
        for (int i = left; i < right; i++) {
            prod *= i;
        }
 
        System.out.println(prod);
    }
}