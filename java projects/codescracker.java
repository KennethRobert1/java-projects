import java.io.IOException;
import java.util.Scanner;

public class codescracker {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of seconds: ");
        int seconds = sc.nextInt();

        Runtime run = Runtime.getRuntime();

        try{
            System.out.println("shutdon the pc after "+ seconds+"seconds");
            run.exec("shutdown -s -t "+ seconds);

        }
        catch(IOException e){
            System.out.println("Exception "+ e);  
        }
    }

}
