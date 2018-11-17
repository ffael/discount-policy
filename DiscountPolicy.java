/**
 * @author Rafael Ferreira;
 * CS200 - Programming II
 * Assignment 4: Discount Policy;
 */

public abstract class DiscountPolicy {
    private String itemName;
    private double itemCost;
    private int nItems;

    public DiscountPolicy(String itemName, double itemCost, int nItems) {
        this.itemName = itemName;
        this.itemCost = itemCost;
        this.nItems = nItems;
    }

//    Define Get Methods
    public String getItemName(){
        return this.itemName;
    }

    public double getItemCost(){
        return this.itemCost;
    }

    public int getNitems(){
        return this.nItems;
    }

//    Specify Method to be Implemented by Children Classes
    public abstract double computeDiscount();

//    Checks for Equality
    @Override
    public boolean equals(Object obj){
        if(obj == this) return true;
        if(obj == null) return false;
        if(obj.getClass() == this.getClass()){
            DiscountPolicy other = (DiscountPolicy) obj;
            return(super.equals(other));
        }
        return false;
    }

//    Returns Object's Information as a String
    @Override
    public String toString(){
        return "Item: " + this.getItemName() + "\nPrice: $" + this.getItemCost() + "\nNumber of Items: " + this.getNitems() + "\nDiscount: $" + this.computeDiscount();
    }


}
