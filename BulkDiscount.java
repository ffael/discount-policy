/**
 * @author Rafael Ferreira;
 * CS200 - Programming II
 * Assignment 4: Discount Policy;
 */

public class BulkDiscount extends DiscountPolicy {
    private double percentage;
    private int minQuantity;

    public BulkDiscount(String itemName, double itemCost, int nItems){
        super(itemName, itemCost, nItems);
        this.percentage = 0.10;
        this.minQuantity = 5;
    }

//    Define Get Methods
    public double getPercentage(){
        return this.percentage;
    }

    public int getMinQuantity(){
        return this.minQuantity;
    }

//    Define Mutator Methods
    public void setPercentage(double percentage){
        this.percentage = percentage;
    }

    public void setMinQuantity(int minQuantity){
        this.minQuantity = minQuantity;
    }

//    Implements computeDiscount method from DiscountPolicy abstract
    public double computeDiscount(){
        int nItems = this.getNitems();
        double discount = 0.0;
        if(nItems >= minQuantity){
            this.percentage = 0.10;
            discount = (this.getItemCost() * this.getNitems()) * this.percentage;
            return discount;
        }
        return discount;
    }

//    Checks for Equality
    @Override
    public boolean equals(Object obj){
        if(obj == this) return true;
        if(obj == null) return false;
        if(obj.getClass() == this.getClass()){
            BulkDiscount other = (BulkDiscount) obj;
            return(super.equals(other) && this.percentage == other.percentage && this.minQuantity == other.minQuantity);
        }
        return false;
    }

//    Returns Object's Information as a String
    @Override
    public String toString(){
        return super.toString() + "\nMinimum Quantity to Get Discount: " + this.getMinQuantity() + "\nDiscount Percentage: " + (this.getPercentage() * 100) +  "%";
    }
}
