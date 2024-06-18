package prova;

public class Quadrado  extends Figura2D implements Areaclaculada{
 private double lado;
 public Quadrado(double lado, String cor, Boolean curvado) {
		this.lado = lado;
		super.setCor(cor);
		super.setCurvado(curvado);
	}
public double getLado() {
	return lado;
}

public void setLado(double lado) {
	this.lado = lado;
}

@Override
 public double getarea() {
	return (lado * lado);
}
}
