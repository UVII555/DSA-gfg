// complement of base 10 integer leetcode 1009

import java.util.Scanner;
public class Complement_of_Base {
  public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter number to flip: ");
       int n = sc.nextInt();

       int mask = 1;
       while (mask < n) {


           mask = (mask << 1) | 1;

       }

       System.out.print("Compliment = " + (n^mask));




}}
