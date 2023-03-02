
import java.util.*;

public class cloning_Of_Array {
    public static void main(String[] args) {
        // int new_array[]= Arrays.copyOf(original_array,new_array_length);
        int [] a= {2,3,4,5,7};
        int n=a.length;
        int b[]=Arrays.copyOf(a,4);
        b[0]=5;
        System.out.println("Original Array");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+ " ");

        }
        System.out.println("\n Copied Array ");
        for(int i=0; i<b.length;i++){
            System.out.print(b[i] + " ");
        }



    }
    
}
