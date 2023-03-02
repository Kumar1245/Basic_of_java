 import java.util.*;


public class PwResourseArray1 {
    
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
           //int []arr={1,2,3,4,5};
            System.out.println("Enter the size of the array");
            int n=sc.nextInt();
              System.out.println("Enter the Array Element:\n");
            int [] arr=new int [n];
            for(int i=0; i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("\n Array element are:");
            for(int i=0; i<arr.length; i++){
                 System.out.print(arr[i] +" ");
            }
        }

        
    }
}
