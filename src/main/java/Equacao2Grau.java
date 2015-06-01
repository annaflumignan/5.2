/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;
/**
 *
 * @author Anna
 */
public class Equacao2Grau <T extends  Number & Comparable  >{
    T a;
    T b;
    T c;
    public Equacao2Grau(T a,T b, T c) throws Exception{
        if(a.compareTo(0)==0){
            throw new RuntimeException("Coeficiente a não pode ser zero");
        }
        this.a= a;
        this.b= b;
        this.c= c;
    }

    public T getA() {
        return a;
    }

    public void setA(T a)throws Exception {
        if(a.compareTo(0)==0){
            throw new RuntimeException("Coeficiente a não pode ser zero");
        }
        this.a = a;
    }

    public T getB() {
        return b;
    }

    public void setB(T b) {
        this.b = b;
    }

    public T getC() {
        return c;
    }

    public void setC(T c) {
        this.c = c;
    }
    public double getRaiz1() throws Exception {
        double delta=b.doubleValue()*b.doubleValue()-(4*a.doubleValue()*c.doubleValue());
        if(delta<0){
            throw new RuntimeException("Equação não tem solução real");
        }
        return (-b.doubleValue()+Math.sqrt(delta))/(2*a.doubleValue());
    }
    public double getRaiz2()throws Exception{
        double delta=b.doubleValue()*b.doubleValue()-(4*a.doubleValue()*c.doubleValue());
        if(delta<0){
            throw new RuntimeException("Equação não tem solução real");
        }
        return (-b.doubleValue()-Math.sqrt(delta))/(2*a.doubleValue());
    }
}


