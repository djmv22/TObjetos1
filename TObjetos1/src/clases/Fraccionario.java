/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author DanielDeJesus
 */
public class Fraccionario {
    private int numerador;
    private int denominador;
    
    public Fraccionario(int numerador, int denominador){
        this.numerador=numerador;
        this.denominador=denominador;
        
       }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }   
    
    public Fraccionario operacion(Fraccionario f2, int op){
        Fraccionario f;
        int num=0, den=0;
        
        switch (op){
            case 0:
              num=this.numerador * f2.denominador + this.denominador * f2.numerador;
              den=this.denominador * f2.denominador;
            break;
            case 1:
              num=this.numerador * f2.denominador - this.denominador * f2.numerador;
              den=this.denominador * f2.denominador;
            break;
            case 2:
              num=this.numerador * f2.numerador;
              den=this.denominador * f2.denominador;
            break;
            case 3:
              num=this.numerador * f2.denominador;
              den=this.denominador * f2.numerador;
            break;        
        }
        f = new Fraccionario (num,den);
        return f;
        
    }
    
    public int convertirMixto(Fraccionario f2){
        int numero_Entero, num, den,op;
        num = f2.getNumerador();
        den = f2.getDenominador();
        op = num%den;
        numero_Entero = num/den;
        this.setNumerador(op);
        return numero_Entero;
    }
    
    
}
