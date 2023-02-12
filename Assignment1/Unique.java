import java.util.*;
public class Unique {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of array:");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter array elements:");
    for(int i=0; i<n; i++){
        a[i]=sc.nextInt();
    }
    Map<Integer,Integer> m=new HashMap<Integer,Integer>();
    for(int j=0; j<n; j++){
        if(m.containsKey(a[j])==false){
            m.put(a[j],1);
            System.out.print(a[j]+" ");
        }
    }
}
}