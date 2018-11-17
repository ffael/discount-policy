/**
 * @author Rafael Ferreira;
 * CS200 - Programming II
 * Assignment 4: Discount Policy;
 */
import java.util.ArrayList;

public class DiscountPolicyTester {
    public static void main(String[] args){

        DiscountPolicy a = new BulkDiscount("Banana", 1.00, 10);
        DiscountPolicy b = new BuyNGet1Free("Sugar", 5.00, 2);
        DiscountPolicy c = new BuyNGet1Free("Cheese", 2.60, 2);
        DiscountPolicy d = new BulkDiscount("Coffee", 3.95, 8);
        DiscountPolicy e = new BulkDiscount("Salt", 1.35, 5);
        DiscountPolicy f = new BulkDiscount("Cookies", 2.90, 5);
        DiscountPolicy g = new BulkDiscount("Avocado", 2.00, 5);
        DiscountPolicy h = new BuyNGet1Free("Bread", 1.00, 4);
        DiscountPolicy i = new BuyNGet1Free("Milk", 1.80, 4);
        DiscountPolicy j = new BuyNGet1Free("Water Bottle", 2.30, 4);

        ArrayList<DiscountPolicy> purchases = new ArrayList<DiscountPolicy>(){{
            add(a);
            add(b);
            add(c);
            add(d);
            add(e);
            add(f);
            add(g);
            add(h);
            add(i);
            add(j);
        }};


        System.out.println("Purchase Info: \n");
        for(DiscountPolicy item: purchases){
            System.out.println(item.toString() + "\n");
        }

    }
}
