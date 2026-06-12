/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Triangulo;

/**
 *
 * @author josed
 */
public class TrianguloEquilatero extends triangulo {

    public TrianguloEquilatero(double lado) {
        super(lado, lado, lado);
    }

    @Override
    protected double calcularArea() {
        return (Math.sqrt(3) / 4) * Math.pow(ladoA, 2);
    }
}