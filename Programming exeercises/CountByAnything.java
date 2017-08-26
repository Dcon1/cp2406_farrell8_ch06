import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
public class CountByAnything {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int userNumber;
        int maxNumber = 300;
        int startingNumber;
        System.out.println("Please enter the number you wish to use");
        userNumber = sc.nextInt();
        startingNumber = userNumber;
        while(userNumber < maxNumber)
            if((userNumber % 30) == 0)
            {
                System.out.println("\n");
                System.out.println(userNumber);
                userNumber = userNumber + startingNumber;
            }
            else
            {
                System.out.println(userNumber);
                userNumber = userNumber + startingNumber;
            }
    }
}