package D_1_a_BeginnerOfJava;

import java.util.Scanner;

public class CWM_12_E_1_FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Number: ");
        int number = scanner.nextInt();

       if (number % 3 ==0 && number % 5==0)
           System.out.println("Fizz Buzz");
       else if (number % 3==0)
           System.out.println("Fizz");
       else if (number % 5 == 0)
           System.out.println("Buzz");
else {
           System.out.println("-------------- ");
       }



    }
}
