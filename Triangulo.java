/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author igorxf
 */
public class Triangulo {

    private Ponto p1;
    private Ponto p2;
    private Ponto p3;

    public Triangulo(Ponto p1, Ponto p2, Ponto p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public void imprimir() {
        System.out.println("P1(" + p1.getX() + "," + p1.getY() + ")");
        System.out.println("P2(" + p2.getX() + "," + p2.getY() + ")");
        System.out.println("P3(" + p3.getX() + "," + p3.getY() + ")");
    }

    public boolean isColineares(Ponto p1, Ponto p2, Ponto p3) {
        double deltaX1 = p2.getX() - p1.getX();
        double deltaY1 = p2.getY() - p1.getY();
        double deltaX2 = p3.getX() - p2.getX();
        double deltaY2 = p3.getY() - p2.getY();

        double razaoY1X1 = deltaY1 / deltaX1;
        double razaoY2X2 = deltaY2 / deltaX2;

        if (razaoY1X1 == razaoY2X2) {
            return true;
        } else {
            return false;
        }
    }

    public double perimetro(Ponto p1, Ponto p2, Ponto p3) {
        boolean verificat = isColineares(p1, p2, p3);
        if (verificat == false) {
            double distAB = p1.distanciaEntrePontos(p2);
            double distBC = p2.distanciaEntrePontos(p3);
            double distCD = p3.distanciaEntrePontos(p1);

            double ladoAB = distAB;
            double ladoBC = distBC;
            double ladoCD = distCD;

            double perimetro = ladoAB + ladoBC + ladoCD;
            return perimetro;
        } else {
            return -1;
        }
    }

    //public double areaTriangulo(Ponto p1, Ponto p2, Ponto p3){
    //}
    public double areaT(Ponto p1, Ponto p2, Ponto p3) {
        boolean verificat = isColineares(p1, p2, p3);
        if (verificat == false) {
            double perimetro = perimetro(p1, p2, p3);
            double semip = perimetro / 2.0;
            double distAB = p1.distanciaEntrePontos(p2);
            double distBC = p2.distanciaEntrePontos(p3);
            double distCD = p3.distanciaEntrePontos(p1);

            double ladoAB = distAB;
            double ladoBC = distBC;
            double ladoCD = distCD;

            double sub1 = semip - ladoAB;
            double sub2 = semip - ladoBC;
            double sub3 = semip - ladoCD;

            double multi = semip * sub1 * sub2 * sub3;

            double area = Math.sqrt(multi);

            return area;
        } else {
            return -1;
        }
    }

    public String tipo(Ponto p1, Ponto p2, Ponto p3) {
        boolean verificat = isColineares(p1, p2, p3);
        if (verificat == false) {
            double ladoAB = p1.distanciaEntrePontos(p2);
            double ladoBC = p2.distanciaEntrePontos(p3);
            double ladoCD = p3.distanciaEntrePontos(p1);

            if (ladoAB == ladoBC && ladoBC == ladoCD) {
                return "Triangulo Equilatero";
            } else if (ladoAB == ladoBC || ladoBC == ladoCD || ladoCD == ladoAB) {
                return "Triangulo Isosceles";
            } else {
                return "Triangulo Escaleno";
            }
        } else {
            return "Os pontos nao formam um triangulo";
        }

    }

    public Ponto getP1() {
        return this.p1;
    }

    public Ponto getP2() {
        return this.p2;
    }

    public Ponto getP3() {
        return this.p3;
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
}
