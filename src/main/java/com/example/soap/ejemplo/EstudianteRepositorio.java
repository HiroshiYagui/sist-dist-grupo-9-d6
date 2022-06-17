package com.example.soap.ejemplo;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.howtodoinjava.xml.school.Estudiante;

@Component
public class EstudianteRepositorio {
	private static final Map<String, Estudiante> students = new HashMap<>();

	@PostConstruct
	public void initData() {
		
		Estudiante student = new Estudiante();
		student.setNombre("Carlos");
		student.setStandard(5);
		student.setDireccion("Salamanca");
		students.put(student.getNombre(), student);
		
		student = new Estudiante();
		student.setNombre("Alejandro");
		student.setStandard(5);
		student.setDireccion("Victoria");
		students.put(student.getNombre(), student);
		
		student = new Estudiante();
		student.setNombre("Danny");
		student.setStandard(6);
		student.setDireccion("Salvador");
		students.put(student.getNombre(), student);
		
		student = new Estudiante();
		student.setNombre("Lorena");
		student.setStandard(7);
		student.setDireccion("San Juan");
		students.put(student.getNombre(), student);
		
		
	}

	public Estudiante findEstudiante(String name) {
		Assert.notNull(name, "The Estudiante's name must not be null");
		return students.get(name);
	}
}