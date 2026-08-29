import java.util.Scanner;
public class absoluteValue {
    public static void main(String[] args){
        // in absolute value-- positive values remains positive and negative becomes positive by multiplying it by -1
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int n = sc.nextInt();

        if(n<=0){

            System.out.print("absolute num " + n*(-1));
        }
        else {
            System.out.print( "Absolute num:" +n);
        }













    }
}
