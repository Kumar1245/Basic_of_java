import java.util.Scanner;

public class App {



    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
       
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("the number enter by user ");
        int   R=sc.nextInt();
        for(int i=0;i<R;i++){






            
            System.out.println("The number printed by for loop:"+i);
           
        }
        int i=0;
      
           do{
            System.out.println("the number is printed by do while :"+i);
            i++;
           }
           while(i<R);
         
        
         
        

        }
    }
}
