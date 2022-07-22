import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Product p1=new Product(1,"Soap",340);
//        Product p2=new Product(2,"paste",380);
//        Product p3=new Product(3,"Zing",320);

        List<Product> l1 = new ArrayList<>() ;
        Scanner s1=new Scanner(System.in);
        for(int i=0;i<4;i++){
            System.out.println("Enter Product id");
            int idd=s1.nextInt();
            System.out.println("Enter Product Name");
            String nm=s1.next();
            System.out.println("Enter Product Price");
            int p=s1.nextInt();
            l1.add(new Product(idd,nm,p));

        }

        System.out.println("Enter the number you want to sort");
        int cc=s1.nextInt();

        if(cc==1){
            Collections.sort(l1,new ProductPriceSort());
        }
        else if(cc==2){
            Collections.sort(l1,new ProductNameSort());
        }
        else {
            Collections.sort(l1,new ProductIdSort());
        }



        for(Product p:l1){
            System.out.println(p);
        }





    }
}
