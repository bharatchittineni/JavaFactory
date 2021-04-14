import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Stacks {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Stack<Integer> bs = new Stack<Integer>();
        int rem;
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        while(n>0)
        {
            rem = n%2;
            n=n/2;
            bs.push(rem);
        }
        int mainC=0, res=0;
        while(!bs.isEmpty())
        {
            if((Integer)bs.pop() == 1){
                mainC = mainC+1;
            }else{
                if(mainC>res){
                    res=mainC;
                }

                mainC=0;
            }
            if(mainC>res){
                res=mainC;
            }

        }
        System.out.println(res);
        scanner.close();
    }
}