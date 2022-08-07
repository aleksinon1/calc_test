/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Введите число 1: ");
        int num1 = scan.nextInt();
        System.out.print("Введите число 2: ");
        int num2 = scan.nextInt();
        int res;
        
        System.out.print("Введите действие: ");
        String action = scan.nextLine();
        action = scan.nextLine();
        switch(action) {
            case "+":
                res = num1 + num2;
                System.out.print("Результат: " + res);
        
        break;
            case "-":
                res = num1 - num2;
                System.out.print("Результат: " + res);
        break;
            case "*":
                res = num1 * num2;
                System.out.print("Результат: " + res);
        break;
            case "/":
                if(num2 == 0)
                System.out.println("Error");
                else {
                res = num1 / num2;
                System.out.print("Результат: " + res);
                }
        break;
        }
    }
}
