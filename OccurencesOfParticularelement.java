public class OccurencesOfParticularelement {

    public static int count_of_element(int [] a,int x){
        int count =0;
        for(int i=0;i<a.length;i++){
            if(a[i]==x)
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int a[] = { 1, 4, 7, 9 , 1};

        System.out.println(count_of_element(a,1));
        
    }
    
}
