import java.util.Scanner;

public class SumDigits {
  public static int sumDigits(long n){
    int sum = 0;  
    
    do{
      sum +=  n % 10;  
    }while ((n = n / 10) != 0); 
    
    return sum;
  } // sumDigits method
  
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int num = input.nextInt();
    
    System.out.println("The sum of the digits is " + sumDigits(num));
  } // main

} // sumDigits class