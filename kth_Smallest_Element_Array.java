import java.util.Arrays;
import java.util.Scanner;

public class kth_Smallest_Element_Array {


    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the length of the array: ");
        int n=sc.nextInt();
        int [ ] arr =new int [n];
        System.out.println("Enter the array Element:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        
        }
        int k =sc.nextInt();
        Arrays.sort(arr);
        System.out.print(" Kth Smalllest Element: "+arr[k-1]);
    }
    
}
