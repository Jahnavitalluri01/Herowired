import java.util.Scanner;

class Product{
    private int productId;
    private String prodname;
    private int count;
    private float cost;
    Product(int productId,String prodname,int count,float cost){
        this.productId=productId;
        this.prodname=prodname;
        this.count=count;
        this.cost=cost;
    }
    public int getprodId(){
        return this.productId;
    }
    public String getprodname(){
        return this.prodname;
    }
    public float getcost(){
        return this.cost;
    }
    public int getcount(){
        return this.count;
    }
    public void setcount(int count){
          this.count=count;
    }
}
class Operations{
    int n=10;
    Product p[]=new Product[n];
    int i=0;
    public void addproduct(Product pr){
          p[i]=pr;
          i++;
    }
    public void products(){
        System.out.println("\nProductId\tProductName");
        for(int j=0; j<i; j++){
            System.out.println(p[j].getprodId()+"\t"+p[j].getprodname());
            }
    }
    public void productdetails(){
        System.out.println("\nProductId\tProductName\tProductCount\tProductCost\n");
        for(int j=0; j<i; j++){
        System.out.println(p[j].getprodId()+"\t"+p[j].getprodname()+"\t"+p[j].getcount()+"\t"+p[j].getcost());
        }
    }
    public void count(int productId){
        for(int j=0; j<i; j++){
            if(productId==p[j].getprodId()){
        System.out.println("The count of "+p[j].getprodId()+" is: "+p[j].getcount());
        return;
            }
        }
        System.out.println("Invalid ProductId is entered");
    }
    public void addcount(int productId,int value){
        for(int j=0; j<i; j++){
            if(productId==p[j].getprodId()){
                p[j].setcount(p[j].getcount()+value);
        return;
            }
        }
        System.out.println("Invalid ProductId");
    }
    public void deletecount(int productId,int value){
        for(int j=0; j<i; j++){
            if(productId==p[j].getprodId()){
                p[j].setcount(p[j].getcount()-value);
        return;
            }
        }
        System.out.println("Invalid ProductId");
    }

}
public class Fourth {
    public static void main(String[] args) {
        Operations o=new Operations();
        Scanner sc=new Scanner(System.in);
        Product ob;
        int prno,count;
        String name;
        float price;
        int c=0;
        while(true){
            System.out.println("Select your choice: ");
            System.out.println("1 for AddingProduct\n2 for seeing the product specifications\n3 for seeing the products Available\n4 for checking the product count\n5 for updating the product count\n6 for exit");
            int nn=sc.nextInt();
            switch(nn){
                case 1:
                      System.out.println("Enter productId:");
                      prno=sc.nextInt();
                      sc.nextLine();
                      System.out.println("Enter productname:");
                      name=sc.nextLine();
                      System.out.println("Enter productcount:");
                      count=sc.nextInt();
                      System.out.println("Enter productcost:");
                      price=sc.nextFloat();
                      ob=new Product(prno,name,count,price);
                      o.addproduct(ob);
                      break;
            
                case 2:
                o.productdetails();
                break;
                case 3:
                o.products();
                break;
                case 4:
                System.out.println("Enter the productId: ");
                 int id=sc.nextInt();
                 o.count(id);
                 break;
                 case 5:
                 System.out.println("Enter the productId: ");
                 int idd=sc.nextInt();
                 System.out.println("Enter 1 for product count addition and 2 for deletion:");
                 int n1=sc.nextInt();
                 System.out.println("Enter the count:");
                 int n2=sc.nextInt();
                 if(n1==1){
                    o.addcount(idd,n2);
                 }
                 else{
                    o.deletecount(idd,n2);
                 }
                 break;
                 case 6:
                 c=1;
                     break;
                }
                if(c==1){
                    break;
                }

        }

    }
}
