import java.util.Scanner;



public class Main {
    public static void main(String[] args){

        char operator;
        Double num1, num2, result;
        //create an object for scanner class//
        Scanner input = new Scanner(System.in);

        //ask user to enter operator//
        System.out.print(" Choose an operator: '+','-','*','/'");
        operator = input.next().charAt(0);

        //ask users to enter number //
        System.out.print("Enter the first number : ");
        num1 = input.nextDouble();

        System.out.print("Enter your second number : ");
        num2 = input.nextDouble();

        if(operator == '+') {
            result = (num1 + num2);
        }
        else if(operator =='-') {
            result = (num1 - num2);
        }
        else if (operator=='*'){
            result = (num1*num2);
        }
        else if (operator=='/');{
            result =(num1/num2);
        }

        System.out.println("Your result is :"+ result);











    }


}