package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

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
double result = promedioTest.add(input);
assertEquals(result, 0);
}
@Test
void addOneDoubleOne() {
double input =1;
double result = promedioTest.add(input);
assertEquals(result, 1);
}
@Test
void addTwoDoubleOneZero() {
double input = new ArrayList <double>(1,2);

double result = promedioTest.add(input);
assertEquals(result, 1,5d ) ;
}
}
