package prova;

public class Circulo extends Figura2D implements Areaclaculada {
 private double raio; 
 
public Circulo(double raio, String cor, Boolean curvado) {
	this.raio = raio;
	super.setCor(cor);
	super.setCurvado(curvado);
}
public double getRaio() {
	return raio;
}
public void setRaio(double raio) {
	this.raio = raio;
}
@Override
public double getarea() {
	return (raio * raio) * 3.14;
}
}
