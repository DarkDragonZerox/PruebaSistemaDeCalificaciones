package modelos;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Alumno {
	String rut;
	String nombre;
	String apellido;
	String direccion;
	List<String> materias=new ArrayList<String>();
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public List<String> getMaterias() {
		return materias;
	}
	public void setMaterias(List<String> materias) {
		this.materias = materias;
	}
	@Override
	public String toString() {
		return "Alumno [rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
				+ ", materias=" + materias + "]";
	}
	
	
	
	
}
