package Assignment2;
import java.util.*;;
public class Merging {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static void main(String[] args) {
       int n1,n2;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter 1st linked list length:");
       n1=sc.nextInt();
       int a[]=new int[n1];
       System.out.println("Enter node Elements:");
        for(int i=0; i<n1; i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter 2nd linked list length:");
       n2=sc.nextInt();
       int b[]=new int[n1];
       System.out.println("Enter node Elements:");
        for(int i=0; i<n1; i++){
            b[i]=sc.nextInt();
        }
        Node c=create(a);
        System.out.println("The First Linked list is: ");
        printing(c);
        Node d=create(b);
        System.out.println("The Second Linked list is: ");
        printing(d);
        int m[]=merging(c,d,a.length+b.length);
        Node res=create(m);
        System.out.println("The sorted Linked list is: ");
        printing(res);
    }
    public static Node create(int[] a){
        Node nod=new Node(0);
        Node temp=nod;
        for(int i=0; i<a.length; i++){
            Node temp_node=new Node(a[i]);
            temp.next=temp_node;
            temp=temp.next;
        }
        temp.next=null;
        return nod.next;
    }
    public static int[] merging(Node a,Node b,int size){
        int m[]=new int[size];
        Node t1=a;
        Node t2=b;
        int i=0;
        while(t1!=null){
            m[i]=t1.val;
            t1=t1.next;
            i+=1;
        }
        while(t2!=null){
            m[i]=t2.val;
            t2=t2.next;
            i+=1;
        }
        Arrays.sort(m);
        return m;
    } 
    public static void printing(Node nodee){
        Node t=nodee;
        while(t!=null){
            System.out.print(t.val+" ");
            t=t.next;
        }
        System.out.println();
    }
    
}
