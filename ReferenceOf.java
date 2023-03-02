public class ReferenceOf {
    public static void main(String[] args) {
        int []a={1,2,4,5,6};
        int n =a.length;
        int []b=new int[n];

        b=a;
        b[0]=5;
        System.out.println("Original Array ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+ " ");    
        }
        System.out.println("\n Referenced Array");
        for(int i=0; i<n; i++){
            System.out.print(b[i]+ " ");

        }
    }
    
}
