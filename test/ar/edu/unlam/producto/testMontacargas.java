package ar.edu.unlam.producto;

import static org.junit.Assert.*;

import org.junit.Test;

public class testMontacargas {

	@Test
	public void testQueObtengaCarga() {
		Carga carga1=new Carga(3.45);
		Montacargas montacarga=new Montacargas(50.5);
		montacarga.cargar(carga1);
		Double valorEsperado=3.45;
		Double valorObtenido=montacarga.obtenerCarga();
		assertEquals (valorEsperado,valorObtenido);
	}
   @Test
   public void testQueCargueUnaCarga() {
	   Carga carga1=new Carga(5.55);
		Montacargas montacarga=new Montacargas(50.5);
		Boolean valorObtenido= montacarga.cargar(carga1);
		 assertTrue(valorObtenido);
		
   }
   @Test
   public void testQueDescargueUnaCarga() {
	   Carga carga1=new Carga(20.0);
	   Montacargas montacarga=new Montacargas(50.5);
	   montacarga.cargar(carga1);
		Boolean valorObtenido= montacarga.descargar();
		
		 assertTrue(valorObtenido);
   }
   @Test
   public void testQUeObtengaElPromedio() {
	   Carga carga1=new Carga(10.0);
	   Carga carga2=new Carga(10.0);
	   Montacargas montacarga=new Montacargas(45.5);
	   montacarga.cargar(carga1);
	   montacarga.cargar(carga2);
	   Double valorEsperado=10.0;
		Double valorObtenido=montacarga.obtenerCargaPromedio();
	   assertEquals(valorEsperado, valorObtenido);
   }
   @Test
   public void testQueVerifiqueQueSeCreoUnMontacargas() {
	   Montacargas montacarga2=new Montacargas(35.0);
	   assertNotNull(montacarga2);
   }
}
