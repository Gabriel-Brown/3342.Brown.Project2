/******************************************************
‘***  Project 2 - Car Class
‘***  Gabriel Brown
‘******************************************************
‘*** To Demonstrate classes, objects, attributes, and methods
‘***
‘******************************************************
‘*** 09/19/2017
‘******************************************************
‘*****************************************************/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

import java.awt.Color;

/**
 *
 * @author Gabe
 */
public class Car {
    private String make;
    private String model;
    private Color color;
    private int speed;
    
    public Car(String make, String model, Color color)
    {
        this.make = make;
        this.model = model;
        this.color = color;
        speed = 0;
    }
    
    /**
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * @param make the make to set
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color myColor) {
        color = myColor;
    }

    /**
     * @return the speed
     */
    public int getSpeed() {
        return speed;
    }
    
    
    public int accelerate()
    {
        speed += 5;
        return speed;
    }
    
    public int brake()
    {
        if (speed > 4) //no negative speed
            speed -= 5;
        return speed;
    }
    
}
