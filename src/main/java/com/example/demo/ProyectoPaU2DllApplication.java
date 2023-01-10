package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.modelo.Profesor;
import com.example.demo.uce.service.IEstudianteService;
import com.example.demo.uce.service.IProfesorService;



@SpringBootApplication
public class ProyectoPaU2DllApplication implements CommandLineRunner{

	@Autowired
	private IEstudianteService estudianteService;
	@Autowired
	private IProfesorService iProfesorService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2DllApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Estudiante estu= new Estudiante();
//		estu.setId(8);
		estu.setNombre("Daniel");
		estu.setApellido("Llumiquinga");
		estu.setCedula("1721495628");
		estu.setCiudad("Quito");
		estu.setGenero("M");
		

//		
//		System.out.println("Se eliminara el estudiante: "+ estu);
//		this.estudianteService.borrar(1);
		
//		System.out.println("Agregar estudiante: "+estu );
		this.estudianteService.agregar(estu);
		
//		Estudiante estudianteEncontrado= this.estudianteService.buscar(5);
//		System.out.println("Estudiante encontrado: "+estudianteEncontrado);
//		
//		estudianteEncontrado.setCiudad("Sangolqui");
//		this.estudianteService.modificar(estudianteEncontrado);
//		System.out.println("Estudiante modificado: "+ this.estudianteService.buscar(5));
//		System.out.println();
		
		Profesor prof1= new Profesor();
		prof1.setNombre("Edison");
		prof1.setApellido("Andino");
		prof1.setCedula("984116515");
		prof1.setCiudad("Quito");
		prof1.setGenero("M");
		
		this.iProfesorService.agregar(prof1);
		
	}

}
