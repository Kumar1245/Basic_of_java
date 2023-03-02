import java.util.Scanner;

public class PoNe {

    public static void main(String[] args) {
        Scanner scn =new Scanner (System.in);
         
        System.out.println("Enter the Length of Array: ");
        int n= scn.nextInt();

        int [] arr =new int [n];
        System.out.println("Enter the Array Element: ");
        for(int i=0;i<n; i++){
            arr[i] =scn.nextInt();
        }

        int [] ans= new int[n];

         int idx=0;
         for(int i=0;i<n;i++){
            if(arr[i] >=0){
                ans[idx] =arr[i];
                idx++;
            }
         }
         for(int i=0; i<n;i++){
            if(arr[i]<0){
                ans[idx]=arr[i];
                idx++;
            }
         }
         for(int i=0;i<n;i++){
            System.out.print(ans[i]+ " ");
         }

    }
    
}
