package servicios;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelos.Alumno;

public class AlumnoServicio {
	Map <String, Alumno> ListaAlumnos =new HashMap<String, Alumno>();



   public Alumno crearAlumno(String pRut, String pNombre,String pApellido, String pDireccion, List<String>pMaterias)
   	{
	   //
	  
	    String rut =pRut;
   		String nombre=pNombre;
   		String apellido=pApellido;
   		String direccion= pDireccion;
   		List <String> materias= pMaterias;
		return crearAlumno(rut, nombre, apellido, direccion, materias);	
   		   		   		
   	}
   	}
	
	

