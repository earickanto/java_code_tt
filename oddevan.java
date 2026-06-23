import java.util.Scanner;

public class oddevan {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n%2 == 0){
            System.out.println("The given Number is Even: "+n);            
        }
        else{
            System.out.println("The  given number is Odd: "+ n);
        }
    }
}
