package com.example.uni.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor 
@NoArgsConstructor

public class Matriculado implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	private int id_alumno;
	private int id_asignautra;
	private int id_curso_escolar;
	private String nombre;
	private String sexo;
	private String curso;
	private String grado;
	
	public int getId_alumno() {
		return id_alumno;
	}
	public void setId_alumno(int id_alumno) {
		this.id_alumno = id_alumno;
	}
	public int getId_asignautra() {
		return id_asignautra;
	}
	public void setId_asignautra(int id_asignautra) {
		this.id_asignautra = id_asignautra;
	}
	public int getId_curso_escolar() {
		return id_curso_escolar;
	}
	public void setId_curso_escolar(int id_curso_escolar) {
		this.id_curso_escolar = id_curso_escolar;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getGrado() {
		return grado;
	}
	public void setGrado(String grado) {
		this.grado = grado;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
