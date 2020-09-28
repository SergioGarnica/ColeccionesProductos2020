//obtenerCargaPromedio: devuelve el peso (Kg) promedio de las cargas completadas (cargadas y luego descargadas).
//Implementar CINCO (5) casos de prueba representativos de la clase Montacargas.
package ar.edu.unlam.producto;

import java.util.ArrayList;

public class Montacargas {
private Double pesoMaximo=0.0;
private ArrayList<Carga>peso =new ArrayList<Carga>();

public Montacargas(Double pesoMaximo) {
	
	this.pesoMaximo = pesoMaximo;
}
public Double obtenerCarga() {
	Double pesoActual=0.0;
	for(Carga carga1:peso) {
		pesoActual+=carga1.getPeso();
	}
	return pesoActual;
}
public Boolean cargar(Carga carga) {
	if(this.pesoMaximo>this.obtenerCarga()+carga.getPeso()) {
		peso.add(carga);
		return true;
		
	}
	return false;
}

public boolean descargar() {
	if (!peso.isEmpty()) {
		peso.clear();
		return true;
	}
	return false;
}
public Double obtenerCargaPromedio() {
Double pesoActual=0.0;
Integer cantidadCargasCompletadas=0;
Double promedio=0.0;

for (Carga carga : peso) {
	pesoActual+=carga.getPeso();
	cantidadCargasCompletadas+=1;
}
promedio=pesoActual/cantidadCargasCompletadas;
return promedio;
}

}
