package prova;

import java.util.ArrayList;

public class Main {

    public static void main(String args[]) {
        ArrayList<Figura2D> lista = new ArrayList<>();
  
        Circulo figura1 = new Circulo(3, "vermelho", true); 
        Quadrado figura2 = new Quadrado(3, "azul", false);
        
        lista.add(figura1);
        lista.add(figura2);
        
        for(Figura2D listas : lista) {
            if(listas instanceof Circulo) {
                Circulo circulo = (Circulo) listas;
                System.out.println("Círculo de raio " + circulo.getRaio() + " e cor " + circulo.getCor());
            } else if (listas instanceof Quadrado) {
                Quadrado quadrado = (Quadrado) listas;
                System.out.println("Quadrado de lado " + quadrado.getLado() + " e cor " + quadrado.getCor());
            }
        }
    }
}
