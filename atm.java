import java.util.Scanner;

public class atm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pass = 123;
        int i=0;
        
        do{
        System.out.println("Enter the password: ");
        int pw = sc.nextInt();
        
            if(pw==pass){
                System.out.println("Login Sucessfully");
                break;
            }
            else{
                System.out.println("try again");
                i++;
            }
        }while( i<3);
        if(i==3){
             System.out.println("Card Bolcked");
        }
        sc.close();
    }
}