package Assignment2;
import java.util.*;;
public class Duplicates {
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
       System.out.println("Enter linked list length:");
       n1=sc.nextInt();
       int a[]=new int[n1];
       System.out.println("Enter node Elements:");
        for(int i=0; i<n1; i++){
            a[i]=sc.nextInt();
        }
        Node c=create(a);
        System.out.println("The Linked list is: ");
        printing(c);
        int m[]=remove(c);
        Node op=create(m);
        System.out.println("The Linked list after removing duplicates is: ");
        printing(op);

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
    public static void printing(Node nodee){
        Node t=nodee;
        while(t!=null){
            System.out.print(t.val+" ");
            t=t.next;
        }
        System.out.println();
    }
    public static int[] remove(Node c){
        Node t=c;
        ArrayList<Integer> l=new ArrayList<Integer>();
        while(t!=null){
          if(l.contains(t.val)==false){
             l.add(t.val);
          }
          t=t.next;
        }
        int arr[]=new int[l.size()];
        for(int i=0; i<l.size(); i++){
            arr[i]=l.get(i);
        }
        return arr;
        }
}
