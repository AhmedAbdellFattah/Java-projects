/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circle;

/**
 *
 * @author Legion
 */
public class CIRCLaya {
    private double radius;
    private String color;
    
    public CIRCLaya(){
        radius = 1.0;
        color = "red";
    }
    
    public CIRCLaya(double radius){
        this.radius = radius;
        color = "red";
    }
    
    public double getRadius(){
        return radius;
    }
    
    public double getArea(){
        return Math.PI*radius*radius;
    }
    }
