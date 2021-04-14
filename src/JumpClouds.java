import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JumpClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int[] p = new int[c.length];
        for(int i=1;i<=c.length; i++){
            int mc=0;
            if(c[i-1]!=1){
                for(int x=0; x<p.length; x++){
                    if(p[x]!=0){
                        mc=mc+1;
                    }
                }
                p[mc] = i;
            }
        }
        int mainc=0;
        for(int y=0;y<p.length;y++){
            if(p[y]!=0){
                mainc = mainc+1;
                System.out.println("C->"+p[y]);
                System.out.println("MainC->"+mainc);
            }
        }
        int y=0;
        while(y<p.length-2){
            if(p[y+2]-p[y] == 2){
                mainc = mainc-1;
                y=y+2;
            }else{
                y=y+1;
            }

        }
        /*for(int y=0;y<p.length-2;y++){
            if(p[y+1]-p[y] == 1 && p[y+2]-p[y+1]==1){
                mainc = mainc-1;
            }
        }*/
        System.out.println(mainc-1);
        return mainc-1;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("C:\\Files\\text1.txt")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
