/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

import java.util.ArrayList;

/**
 *
 * @author i2wahid
 */
public class FoodCategory extends FoodComponent {
    //instance variable: (aggregation relationship - multiplicity: 0 or more)
    private ArrayList <FoodComponent> components;
    
    //constructor:
    public FoodCategory(String name){
        super(name);
        components = new ArrayList <FoodComponent>();
    }
    
    //method to add FoodComponents to the ArrayList
    public void add (FoodComponent c){
        components.add(c);
    }
    
    //method to remove FoodComponents from the ArrayList
    public void remove (FoodComponent c){
        components.remove(c);
    }
    
    @Override
    public double getPrice(){
        double sum=0.0;
        for(FoodComponent i : components){
            sum=sum+i.getPrice();
        }
        return sum; //returns the sum of the prices of all food components it contains
    }
    
    @Override
    public void print(int level){
        for(int i=0;i<level;i++){
            System.out.print("\t");
        }
        System.out.println("FoodCategory (" + name + ", " + getPrice() + ") contains:"); //outputting name and price of each category
        for(FoodComponent i: components){
            i.print(level+1); //outputting the food items the category contains and their individual prices
        }
    }
}