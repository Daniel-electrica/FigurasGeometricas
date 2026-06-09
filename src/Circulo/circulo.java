/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Circulo;
import FigurasGeometricas.FG;
/**
 *
 * @author josed
 */
public class circulo extends FG{
    
    private double radio;
    private static final double  PI=Math.PI;
    
     public double getRadio() {
        return radio;
    }
      public double getDiametro(){
        return radio*2;
    }
      public static double getPI(){
          return PI;
       
      }
      
      public void setRadio(){
          this.radio=radio;
      }
     public circulo(double radio){
         this.radio=radio;
     }
     @Override
    public double calcularPerimetro(){
        this.perimetro=2*radio*PI;
        return perimetro;
    }
    public double calcularArea(){
        this.area= Math.pow(radio, 2)*PI;
        return area;
    }

   
    
   
}
