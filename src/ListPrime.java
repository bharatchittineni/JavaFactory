import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ListPrime {

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=in.nextInt();
        }

        for(int j=0;j<a.length;j++){
            int m=a[j]/2;
            int c=0;
            if(a[j]==1){
                c=1;
            }else if(a[j]==2){
                c=0;
            }else{
                for(int k=2;k<=m;k++){
                    if((a[j]%k)==0){
                        c=c+1;
                        break;
                    }
                }
            }
            if(c>0){
                System.out.println("Not prime");
            }else{
                System.out.println("Prime");
            }
        }
    }
}



