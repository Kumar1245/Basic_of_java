public class LastOccurence {


    // last occurences of the element  to the x

    public static int LastOccurences(int  a[],int x){

      int index= -1;
      for(int i=0; i<a.length; i++){
        if (a[i]==x){
            index=i;

        }
      }
    return index;

    }
    public static void main(String[] args) {
        int a []= {3,4,5,6,7,5,7,8,5};
        System.out.println(LastOccurences(a, 6));

    }
    
}
