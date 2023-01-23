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
		
		
		Ciudadano ciu= new Ciudadano();
		ciu.setApellido("Llumiquinga");
		ciu.setNombre("Daniel");
		
		Empleado empleado=new Empleado();
		empleado.setCiudadano(ciu);
		empleado.setFechaIngreso(LocalDateTime.now());
		empleado.setSalario(new BigDecimal(10));
		
		//ciu.setEmpleado(empleado);
		
		this.ciudadanoService.agregar(ciu);
		this.empleadoService.agregar(empleado);
	
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
		
	}

}
