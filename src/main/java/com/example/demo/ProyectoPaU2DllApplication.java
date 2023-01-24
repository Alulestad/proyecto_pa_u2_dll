package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.service.ICiudadanoService;
import com.example.demo.uce.service.IEmpleadoService;
import com.example.demo.uce.service.IEstudianteService;



@SpringBootApplication
public class ProyectoPaU2DllApplication implements CommandLineRunner{

	//@Autowired
	//private IEstudianteService estudianteService;
	
	@Autowired
	private ICiudadanoService ciudadanoService;
	
	@Autowired
	private IEmpleadoService empleadoService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2DllApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		Estudiante estu= new Estudiante();
//		estu.setNombre("Daniel");
//		estu.setApellido("Llumiquinga");
//		estu.setCedula("1721495628");
//		estu.setCiudad("Quito");
//		estu.setGenero("M");
		
		/*
		Ciudadano ciu= new Ciudadano();
		ciu.setApellido("Llumiquinga");
		ciu.setNombre("Daniel");
		
		Ciudadano ciu2= new Ciudadano();
		ciu2.setApellido("Llumiquinga2");
		ciu2.setNombre("Daniel2");
		
		Empleado empleado=new Empleado();
		Empleado empleado2=new Empleado();
		empleado2.setCiudadano(ciu2);
		empleado2.setFechaIngreso(LocalDateTime.now());
		empleado2.setSalario(new BigDecimal(10));
		
		ciu.setEmpleado(empleado);
		
		ciu2.setEmpleado(empleado2);
		
		
		//this.ciudadanoService.agregar(ciu);
		this.ciudadanoService.agregar(ciu2);
		
		//this.empleadoService.agregar(empleado2);
		
		*///EN CLASE 2023-01-23 
		
//		System.out.println(this.ciudadanoService.consultar(4));
//		System.out.println(this.empleadoService.consultar(1));
//		
//		ciu.setApellido("Molina");
//		this.ciudadanoService.actualizar(ciu);
//		
//		empleado.setSalario(new BigDecimal(100));
//		this.empleadoService.actualizar(empleado);
//		
//		this.empleadoService.borrar(empleado.getId());
//		this.ciudadanoService.borrar(ciu.getId());
		
	
//		
//		System.out.println("Se eliminara el estudiante: "+ estu);
//		this.estudianteService.borrar(1);
		
//		System.out.println("Agregar estudiante: "+estu );
		//this.estudianteService.agregar(estu);
		
//		Estudiante estudianteEncontrado= this.estudianteService.buscar(5);
//		System.out.println("Estudiante encontrado: "+estudianteEncontrado);
//		
//		estudianteEncontrado.setCiudad("Sangolqui");
//		this.estudianteService.modificar(estudianteEncontrado);
//		System.out.println("Estudiante modificado: "+ this.estudianteService.buscar(5));
//		System.out.println();
//		
		
		                              //////HOTEL HAVITACIONES
		
		
	}

}
