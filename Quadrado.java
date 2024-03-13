/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author igorxf
 */
public class Quadrado {
    private Ponto p1;
    private Ponto p2;
    private Ponto p3;
    private Ponto p4;
    
    public Quadrado(Ponto p1, Ponto p2, Ponto p3, Ponto p4){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }
    
    public void imprimir(){
        System.out.println("P1(" + p1.getX() + "," + p1.getY() + ")");
        System.out.println("P2(" + p2.getX() + "," + p2.getY() + ")");
        System.out.println("P3(" + p3.getX() + "," + p3.getY() + ")");
        System.out.println("P4(" + p4.getX() + "," + p4.getY() + ")");       
    }
    
    public double areaQuadrado(Ponto p1, Ponto p2){
        boolean verificat = isQuadrado(p1, p2, p3, p4);
        if (verificat == true) {
            double distLado = p1.distanciaEntrePontos(p2);
            double lado = distLado;        
            double area = Math.pow(lado, 2);
            return area;
        }else 
            return -1;
    }
    
    public double perimetroQuadrado(Ponto p1, Ponto p2){
        boolean verificat = isQuadrado(p1, p2, p3, p4);
        if (verificat == true) {
            double dist = p1.distanciaEntrePontos(p2);
            double ladoAB = dist;
            double perimetro = 4*ladoAB; // como os 4 lados sao iguais, e so multiplicar por 4
            return perimetro;
        }else 
            return -1;
    }
    
    public boolean isQuadrado(Ponto p1, Ponto p2, Ponto p3, Ponto p4){
        if(p1.distanciaEntrePontos(p2) != p3.distanciaEntrePontos(p4))
            return false;
        else
            return true;
    }
    

    public Ponto getP1() {
        return p1;
    }

    public Ponto getP2() {
        return p2;
    }

    public Ponto getP3() {
        return p3;
    }

    public Ponto getP4() {
        return p4;
    }

    public void setP1(Ponto p1) {
        this.p1 = p1;
    }

    public void setP2(Ponto p2) {
        this.p2 = p2;
    }

    public void setP3(Ponto p3) {
        this.p3 = p3;
    }

    public void setP4(Ponto p4) {
        this.p4 = p4;
    }
    
    
}
