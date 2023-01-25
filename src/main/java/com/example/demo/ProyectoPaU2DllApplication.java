package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.hotel.modelo.Habitacion;
import com.example.demo.hotel.modelo.Hotel;
import com.example.demo.hotel.service.IHabitacionService;
import com.example.demo.hotel.service.IHotelService;
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
	
	/*
	@Autowired
	private ICiudadanoService ciudadanoService;
	
	@Autowired
	private IEmpleadoService empleadoService;
	*///CIUDADANO EMPLEADO
	@Autowired
	private IHotelService hotelService;
	
	@Autowired
	private IHabitacionService habitacionService;
	
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
		
		                              //////HOTEL HABITACIONES
		Hotel hotel1=new Hotel();
		hotel1.setDireccion("Colon y America");
		hotel1.setNombre("Rinconsito");
		
		Habitacion habitacion1= new Habitacion();
		habitacion1.setHotel(hotel1);
		habitacion1.setNumero("A1");
		Habitacion habitacion2= new Habitacion();
		habitacion2.setHotel(hotel1);
		habitacion2.setNumero("A2");
		Habitacion habitacion3= new Habitacion();
		habitacion3.setHotel(hotel1);
		habitacion3.setNumero("A3");
		
		List<Habitacion> listaHabi1=new ArrayList<Habitacion>();
		listaHabi1.add(habitacion1);
		listaHabi1.add(habitacion2);
		listaHabi1.add(habitacion3);
		
		hotel1.setHabitaciones(listaHabi1);
		
		
//		this.hotelService.crear(hotel1);
//		
//		hotel1.setNombre("Doña Pepa");
//		this.hotelService.actualizar(hotel1);
	
		//this.hotelService.consultar(1);
		
		//this.hotelService.eliminar(1);
		
		//System.out.println(this.hotelService.consultar(3)); 
		
		
		Hotel hotel=this.hotelService.consultar(3);
		Habitacion habitacion4= new Habitacion();
		habitacion4.setNumero("A5");
		
		habitacion4.setHotel(hotel);
		
		//this.habitacionService.crear(habitacion4);
		
		//******* Eliminar habitacion
		//this.habitacionService.eliminar(12); si funciono ****** ojo
		//ForMA 2 con merge
		//no parece funcionar pero equis
//		hotel.getHabitaciones().remove(1);
//		this.hotelService.actualizar(hotel);
		//******FIN******
		
		//FORMAS DE INSERTAR UNE NUEVA HABITACION
		//buscamos hotel
		//crea habitacion
		//set de hiotel en la habitacion
		//insert
		//En este caso hay dos caminos, el otro seria usando el merge de hotel.
		
		
		//******Consultar el hotel con las habitaciones******
		Hotel hotelCopHabitaciones=this.hotelService.consultar(3);
		System.out.println(hotelCopHabitaciones);
		
		List <Habitacion> listaDeH=hotelCopHabitaciones.getHabitaciones();
		listaDeH.forEach(System.out::println);
		//System.out.println(listaDeH);
		//Habitacion h1= hotelCopHabitaciones.getHabitaciones().remove(0);
		//System.out.println(h1);
		
		//******FIN******
		
	}

}
