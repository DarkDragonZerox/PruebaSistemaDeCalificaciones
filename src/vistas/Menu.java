package vistas;

import java.io.BufferedReader;
import java.io.FileReader;

import java.util.Arrays;
import java.util.Scanner;

import servicios.AlumnoServicio;
import servicios.ArchivoServicio;

public class Menu extends MenuTemplate {
	Scanner sm = new Scanner(System.in);
	AlumnoServicio alumnoServicio = new AlumnoServicio();
	ArchivoServicio archivoServicio = new ArchivoServicio();
	
	

@Override
	public void cargarDatos() {
	 // ArchivoServicio carga= new ArchivoServicio();
	 // carga.cargarDatos();
	BufferedReader br = null;
    try {
         
         br =new BufferedReader(new FileReader("D:\\Zero\\eclipse-workspace\\PruebaSistemaDeCalificaciones\\notas.csv"));
         String linea = br.readLine();
         while (null!=linea) {
            String [] valores = linea.split(",");
            System.out.println(Arrays.toString(valores));
            linea = br.readLine();
          		            
         }
         br.close();
      } catch (Exception e) {
    	  System.out.println("Algo Salio Mal");
      } 
    	  
     System.out.println(""); 
     System.out.println(""); 
     System.out.println(""); 
	}

	@Override
	public void expotarDatos() {
		// TODO Auto-generated method stub

	}

	@Override
	public void crearAlumno() {
		// TODO Auto-generated method stub

	}

	@Override
	public void agregarMateria() {
		// TODO Auto-generated method stub

	}

	@Override
	public void agregarNotasPasoUno() {
		// TODO Auto-generated method stub

	}

	@Override
	public void listarAlumnos() {
		// TODO Auto-generated method stub

	}

	@Override
	public void terminarPrograma() {
		// TODO Auto-generated method stub

	}

	@Override
	public void iniciarMenu() {
		// TODO Auto-generated method stub
		super.iniciarMenu();
	}

}
