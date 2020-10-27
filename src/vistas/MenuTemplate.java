package vistas;

import java.util.Scanner;

public class MenuTemplate {
Scanner sc =new Scanner (System.in);



public void cargarDatos() {
	
}
public void expotarDatos() {
	
}
public void crearAlumno() {
	
}
public void agregarMateria() {
	
}
public void agregarNotasPasoUno() {
	
}
public void listarAlumnos() {
	
}
public void terminarPrograma() {
	
}
public void iniciarMenu() {
	boolean salir =false;
	int option;
	
	while(!salir) {
	System.out.println("1-. Crear Alumnos");	
	System.out.println("2-. Listar Alumnos");	
	System.out.println("3-. Agregar Materias");	
	System.out.println("4-. Agregar Notas");	
	System.out.println("5-. Cargar Datos");	
	System.out.println("6-. Exportar Datos");	
	System.out.println("7-. Salir");
	try{
	System.out.println("Seleccion: ");
	option=sc.nextInt();
	switch(option){
	case 1:
		System.out.println("---Crear Alumno---");
		break;
	case 2:
		System.out.println("---ListarAlumnos---");
		break;
	case 3:
		System.out.println("---Agregar Materias---");
		break;
	case 4:
		System.out.println("---Agregar Notas---");
		break;
	case 5:
		System.out.println("---Cargar Datos---");
		break;
	case 6:
		System.out.println("---Exportar Datos---");
		break;
	case 7:
		salir=true;
		break;
	default:
		System.out.println("Solo numeros entre 1 y 7");
	}
	}catch(InputMismatchExepcion e) {
		System.out.println("debes Insertar un numero");
		sc.next();
	}
	}
	
}
}