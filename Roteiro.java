/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.roteiro;

import classes.Ponto;
import classes.Quadrado;
import classes.Triangulo;

/**
 *
 * @author igorxf
 */
public class Roteiro {

    public static void main(String[] args) {
        
        Ponto p1 = new Ponto(4,2);
        Ponto p2 = new Ponto(2,6);
        Ponto p3 = new Ponto(6,2);
        Ponto p4 = new Ponto(2,4);
        Triangulo t = new Triangulo(p1, p2, p3);
        Quadrado q = new Quadrado(p1, p2, p3, p4);
        System.out.println(q.areaQuadrado(p1, p2));
        System.out.println(t.isColineares(p1, p2, p3));
    }
}
