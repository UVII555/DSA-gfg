import java.util.Scanner;
public class Divisibility5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number:" );
        int n = sc.nextInt();

      //  while(n>0){
            if (n%10==0 || n%10==5){
                System.out.print("Divisible by 5");
            }
            else{
                System.out.println("Not divisible by 5");

        }


    }


