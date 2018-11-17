#Due: 11/17

##Inheritance and Abstract Classes

This program is designed to provide more practice for inheritance. You will write 3 classes and one tester class as described below.

- Class DiscountPolicy is an abstract class with a method called computeDiscount, which returns the discount for the purchase of a given number of an item. The class keeps the name of the item, the number of items being purchases, and the cost of one item.

- Class BulkDiscount, derived from DiscountPolicy, has two fields, minimum and percentage. computeDiscount method will return the discount that is calculated based on the percentage applied if the quantity of item purchased is more than minimum.
For example: if the number of items purchases is 5 or more, then there will be 10% discount on the total amount.

- Class BuyNGet1Free, derived from DiscountPolicy, has a single field called n. computeDiscount method will compute discount so that every nth item is free.
For example: for an item that costs $10 and when n is 3 -- purchase of 2 items results in no discount; purchase of 4 items results in a discount of $10, since the third item is free.

- The tester should create 10 different instances/objects of the classes, add them to an ArrayList of DiscountPolicy type, and test their methods. The program should show your knowledge of polymorphism.

Be sure to implement the classes as completely as a class should be, i.e. constructors, get, set, toString, and equals methods.
All your files must have a header with your name, and proper comments for classes (what the class is about and what it does, in your words) as well as appropriate lines of code and all methods.

Compile (10):\
Run (20):\
DiscountPolicy (10):\
BulkDiscount (15):\
BuyNGet1Free (20):\
Tester (15):\
Comments/name (10****):
