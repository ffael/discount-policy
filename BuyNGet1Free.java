/**
 * @author Rafael Ferreira;
 * CS200 - Programming II
 * Assignment 4: Discount Policy;
 */

public class BuyNGet1Free extends DiscountPolicy {
    private int n;

    public BuyNGet1Free(String itemName, double itemCost, int nItems){
        super(itemName, itemCost, nItems);
        this.n = 3;
    }

//    Define Get Methods
    public int getNFree(){
        return this.n;
    }

//    Implements computeDiscount method from DiscountPolicy abstract
    public double computeDiscount(){
        int nItems = this.getNitems();
        double discount = 0.0;
        int freeItems = 0;

        for(int i = 1; i <= nItems; i++){
            if(i % (n +1) == 0){
                freeItems++;
            }
        }
        discount = getItemCost() * freeItems;
        return discount;
    }

//    Checks for Equality
    @Override
    public boolean equals(Object obj){
        if(obj == this) return true;
        if(obj == null) return false;
        if(obj.getClass() == this.getClass()){
            BuyNGet1Free other = (BuyNGet1Free) obj;
            return(super.equals(other) && this.n == other.n);
        }
        return false;
    }

//    Returns Object's Information as a String
    @Override
    public String toString(){
        return super.toString() + "\nNumber of Items to Get a Free: " + (this.getNFree() + 1);
    }
}
