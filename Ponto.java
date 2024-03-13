/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author igorxf
 */
public class Ponto {
    private double x;
    private double y;

    public Ponto(){
        this.x = 0.0;
        this.y = 0.0;
    }
    
    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public void imprimir(){
        System.out.println("Ponto(" + this.x + "," + this.y + ")");
    }
    
    public double distanciaEntrePontos(Ponto outro){
        double deltaX = outro.getX() - this.x;
        double deltaY = outro.getY() - this.y;
        deltaX = Math.pow(deltaX, 2);
        deltaY = Math.pow(deltaY, 2);
        double distancia = Math.sqrt(deltaX + deltaY);
        return distancia;
    }
    
    public double getX(){
        return this.x;
    }
    
    public double getY(){
        return this.y;
    }
    
    public void setX(double x){
        this.x = x;
    }
    
    public void setY(double y){
        this.y = y;
    }
}
