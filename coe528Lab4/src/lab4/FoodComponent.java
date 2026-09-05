/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author i2wahid
 */
public abstract class FoodComponent {
    //instance variables;
    protected String name;
    
    //constructor:
    public FoodComponent(String name){
        this.name=name;
    }
    
    //abstract methods will be overrided and implemented there by the subclasses (primitive class and composite class)
    public abstract double getPrice();
    
    public abstract void print (int level);
}
