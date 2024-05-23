import java.util.Scanner;

public class calculator {
    public static void main(String[] args){

        float result;

        Scanner S = new Scanner(System.in);
        System.out.println("enter first number.");
        float x = S.nextInt();

        
        System.out.println("enter your operator(+,-,/,*)");
        char operator = S.next().charAt(0);

       
        System.out.println("enter second number.");
        float y = S.nextInt();
        
        result = 0;

        if(operator =='+'){
            result = x+y;
        }else if(operator == '-'){
            result = x-y;
        }else if(operator == '*'){
            result = x*y;
        }else if(operator == '/' && y!=0){
            result =x/y;
        }else{
            System.out.println("invalid operator.");
           
        }
            
        System.out.println("your answer is: " + result);
     
        }
        }
    
    
        
    
    

