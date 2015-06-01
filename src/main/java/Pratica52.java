
import utfpr.ct.dainf.if62c.pratica.Equacao2Grau;
/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */

public class Pratica52 {
    public static void main(String[] args) throws Exception {
        Equacao2Grau eq;
        try {
            eq = new Equacao2Grau(1,2,9);
            System.out.println(eq.getRaiz1());
            System.out.println(eq.getRaiz2());
        } 
        catch (RuntimeException e) {
            System.out.println(e.getLocalizedMessage());
        }
        try {
            eq = new Equacao2Grau(0,2,9);
            System.out.println(eq.getRaiz1());
            System.out.println(eq.getRaiz2());
        } 
        catch (RuntimeException e) {
            System.out.println(e.getLocalizedMessage());
        }
        try {
            eq = new Equacao2Grau(1,5,4);
            System.out.println(eq.getRaiz1());
            System.out.println(eq.getRaiz2());
        } 
        catch (RuntimeException e) {
            System.out.println(e.getLocalizedMessage());
        }
        try {
            eq = new Equacao2Grau(1,2,1);
            System.out.println(eq.getRaiz1());
            System.out.println(eq.getRaiz2());
        } 
        catch (RuntimeException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}