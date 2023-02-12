import java.util.*;
class Third
{
    static Scanner sc=new Scanner(System.in);
    static void Insert(ArrayList<String> productlist,ArrayList<ArrayList<String>> productdetails,ArrayList<Integer> productcount)
    {
        System.out.println("Enter product name");
        String pn=sc.next();
        
        System.out.println("Enter product quantity");
        int pq=sc.nextInt();
        System.out.println("Enter Specifications");
        sc.nextLine();
        String sp=sc.nextLine();
        System.out.println("Enter Cost");
        String c=sc.next();
        productlist.add(pn);
        ArrayList<String> a=new ArrayList<>();
        a.add(sp);
        a.add(c);
        a.add(Integer.toString(pq));
        productdetails.add(a);
        productcount.add(pq);
    }
    static void viewProducts(ArrayList<String> productlist,ArrayList<ArrayList<String>> productdetails,ArrayList<Integer> productcount)
    {
        for(int i=0;i<productlist.size();i++)
        {
            System.out.print(productlist.get(i)+"  ");
            String d="";
            for(int j=0;j<productdetails.get(i).size();j++)
            d+=productdetails.get(i).get(j)+" ";
            System.out.print(d);
            System.out.println("\n");
        }
    }
    static void productlist(ArrayList<String> productlist,ArrayList<Integer> productcount)
    {
        System.out.println("Enter productname to get count");
        String name=sc.next();
        int i=productlist.indexOf(name);
        System.out.println(productlist.get(i)+" "+productcount.get(i));
    }
    static void editproduct(ArrayList<String> productlist,ArrayList<ArrayList<String>> productdetails,ArrayList<Integer> productcount)
    {
        System.out.println("Enter productname to edit details");
        String r=sc.next();
        int t=productlist.indexOf(r);
        System.out.println("Enter product quantity");
        int pq=sc.nextInt();
        System.out.println("Enter Specifications");
        sc.nextLine();
        String specify=sc.nextLine();
        System.out.println("Enter Cost");
        String c=sc.next();
        ArrayList<String> a=new ArrayList<>();
        a.add(specify);
        a.add(c);
        a.add(Integer.toString(pq));
        productdetails.set(t, a);
        productcount.set(t,pq);
    }
    static void productcount(ArrayList<String> productlist,ArrayList<Integer> productcount)
    {
        System.out.println("Enter item name to get count");
        String pn=sc.next();
        int i=productlist.indexOf(pn);
        System.out.println(productlist.get(i)+"    "+productcount.get(i));
    }
    static void uproductdetailsateinventory(ArrayList<String> productlist,ArrayList<ArrayList<String>> productdetails,ArrayList<Integer> productcount)
    {
        System.out.println("Enter 1 to update and 2 to delete item quantity");
        int choice=sc.nextInt();
        if(choice==1)
        {
            System.out.println("Enter item name");
            String pn=sc.next();
            System.out.println("Enter no of items to add");
            int n=sc.nextInt();
            int i=productlist.indexOf(pn);
            productcount.set(i,n);
            int m=productcount.get(i);
            productdetails.get(i).set(2,Integer.toString(m));
        }
        else
        {
            System.out.println("Enter item name");
            String pn=sc.next();
            System.out.println("Enter no of items to add");
            int n=sc.nextInt();
            int i=productlist.indexOf(pn);
            productcount.set(i,productcount.get(i)-n);
            int m=productcount.get(i);
            productdetails.get(i).set(2,Integer.toString(m));
        }
    }
    public static void main(String[] args) {
        ArrayList<String> productlist=new ArrayList<>();
        ArrayList<ArrayList<String>> productdetails=new ArrayList<>();
        ArrayList<Integer> productcount=new ArrayList<>();
        System.out.println("Enter Number of items to be added");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            Insert(productlist,productdetails,productcount);
        }
        //viewProducts(productlist, productdetails, productcount);
        //productcount(productlist,productcount);
        
        int o=1;

        while(o==1)
        {
            System.out.print("select value to perform specific operation");
            System.out.print("1.print data");
            System.out.print("2.Add products");
            System.out.print("3.count of products");
            System.out.print("4.update details");
            System.out.print("5.to exit");
            int y=sc.nextInt();
            switch(y)
            {
                case 1:
                    viewProducts(productlist, productdetails, productcount);
                    break;
                case 2:
                    Insert(productlist,productdetails,productcount);
                    break;
                case 3:
                    productcount(productlist,productcount);
                    break;
                case 4:
                    uproductdetailsateinventory(productlist,productdetails,productcount);
                    break;
                default:
                    o=0;
                    break;
                    
            }

        }

    } 
}
