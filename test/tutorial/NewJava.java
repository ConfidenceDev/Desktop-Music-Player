/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial;

/**
 *
 * @author Confidence
 */
import java.lang.*;
//import java.util.Math;

public class NewJava {
   
    
 public static void main(String[] args) {
            /* Create and display the form */
            
            double x = 9;
            double pi = 3.141;
            double D = 5;
            double t = 4;
            
            double C;
            //double rel = Math.pow(4,2), Math.exp(5);
            //double y = 25;
            
            //System.out.println("Math.sqrt(" + x + ") = "  + Math.sqrt(x));
            //System.out.println("Math.exp(" + x + ") = "  + Math.exp(x));
            
            double B = - Math.pow(x, 2)/ (4 * D * t);
            
            C = (1/Math.sqrt(4 * pi * D * t)) * Math.exp(B);
            
            System.out.println("Answer : " + C);
    }
}
