import java.util.*;
import java.util.Arrays;
public class Missing {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of array:");
    int n=sc.nextInt();
    int a[]=new int[n];
    List<Integer> l=new ArrayList<Integer>();
    System.out.println("Enter array elements:");
    for(int i=0; i<n; i++){
        a[i]=sc.nextInt();
        l.add(a[i]);
    }
    Arrays.sort(a);
    int min=a[0],max=a[n-1];
    for(int j=min; j<max; j++){
           if(l.contains(j)==false){
               System.out.print(j+" ");
           }
    }
    sc.close();
}
}