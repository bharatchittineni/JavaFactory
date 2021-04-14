import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArrayOrderSwap {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int min=arr[0];
        int pos =0;
        int med=0;
        int swap =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==min){

                if( pos!=i){
                    System.out.println("Swap: "+arr[pos]+" "+arr[i]);
                    med=arr[pos];
                    arr[pos]=arr[i];
                    arr[i]=med;
                    swap=swap+1;
                }
                pos=pos+1;
                i =pos;
                min=arr[pos];
                for(int k=pos;k<arr.length;k++){
                    if(arr[k]<min){
                        min = arr[k];
                    }
                }
                System.out.println("Next Min->"+min+" Pos ->"+pos);
            }

        }
        return swap;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("C:\\Files\\text1.txt")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
