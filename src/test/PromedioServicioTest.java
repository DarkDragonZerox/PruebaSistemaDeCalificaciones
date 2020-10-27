package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import servicios.PromedioServicioImp;

public class PromedioServicioTest {
	private PromedioServicioImp promedioTest;
@BeforeEach
	void setUp() {
	promedioTest=new PromedioServicioImp();
	
	}

@Test
void addOneDoubleZero() {
double input =0;
double promedio = promedioTest.calcularPromedio(input);
assertEquals(promedio, 0);
}
@Test
void addOneDoubleOne() {
double input =1;
double promedio = promedioTest.calcularPromedio(input);
assertEquals(promedio, 1);
}
@Test
void addTwoDoubleOneZero() {
	//List input = new ArrayList<Double>(Arrays.asList(1.,2));
	//List<Double> input= new ArrayList<Double>();
	 //input.add((double) 1);
	 //input.add((double) 0);
	List<Double> input = Arrays.asList(1.0,0.0);
double promedio = promedioTest.calcularPromedio(input);
assertEquals(promedio, 1) ;
}
}
