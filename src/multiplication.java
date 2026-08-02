import java.util.Scanner;

import java.util.Scanner;
public class multiplication {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number=sc.nextInt();

        Multiplication(number);



    }

    public static void Multiplication(int num){
        System.out.println("multiplication" +num+":");
        int limit =10;

        for(int i=0;i<=limit;i++){

            int product = num*i;
        System.out.println(num+"x"+i+"="+product);
        }
        return;
    }
}
