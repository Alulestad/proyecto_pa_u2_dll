package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.concesionaria.modelo.Cliente;
import com.example.demo.concesionaria.modelo.Vehiculo;
import com.example.demo.concesionaria.service.IVehiculoService;
import com.example.demo.hotel.modelo.Habitacion;
import com.example.demo.hotel.modelo.Hotel;
import com.example.demo.hotel.service.IHabitacionService;
import com.example.demo.hotel.service.IHotelService;
import com.example.demo.libreria.modelo.Autor;
import com.example.demo.libreria.modelo.Libro;
import com.example.demo.libreria.service.IAutorService;
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
	
	
	
	//LIBRERIA:
	@Autowired
	private IAutorService  autorService;
	
	
	//CONCESIONARIA
	@Autowired
	private IVehiculoService iVehiculoService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2DllApplication.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("CONCESIONARIA");
		//OBJETOS CLIENTES BRUTOS
		Cliente clie1= new Cliente();
		clie1.setApellido("EC");
		clie1.setCedula("1231231231");
		clie1.setEmail("ec@gmai.com");
		clie1.setNombre("A");
		Cliente clie2= new Cliente();
		clie2.setApellido("DLL");
		clie2.setCedula("1212121212");
		clie2.setEmail("dll@gmai.com");
		clie2.setNombre("A");
		Cliente clie3= new Cliente();
		clie3.setApellido("YF");
		clie3.setCedula("1234123412");
		clie3.setEmail("yf@gmai.com");
		clie3.setNombre("B");
		Cliente clie4= new Cliente();
		clie4.setApellido("JC");
		clie4.setCedula("1234512345");
		clie4.setEmail("jc@gmai.com");
		clie4.setNombre("C");
		//Fin
		
		//OBJETOS VEHICULOS BRUTOS
		Vehiculo vehi1=new Vehiculo();
		vehi1.setAnio(LocalDateTime.of(2014, 1, 1, 1, 1));
		vehi1.setChasis("ab");
		vehi1.setMarca("Chevrolet");
		vehi1.setPrecio(new BigDecimal(1000));
		Vehiculo vehi2=new Vehiculo();
		vehi2.setAnio(LocalDateTime.of(2014, 1, 1, 1, 1));
		vehi2.setChasis("abc");
		vehi2.setMarca("KIA");
		vehi2.setPrecio(new BigDecimal(1000));
		Vehiculo vehi3=new Vehiculo();
		vehi3.setAnio(LocalDateTime.of(2015, 1, 1, 1, 1));
		vehi3.setChasis("abcd");
		vehi3.setMarca("Toyota");
		vehi3.setPrecio(new BigDecimal(1200));
		Vehiculo vehi4=new Vehiculo();
		vehi4.setAnio(LocalDateTime.of(2016, 1, 1, 1, 1));
		vehi4.setChasis("abcde");
		vehi4.setMarca("BMW");
		vehi4.setPrecio(new BigDecimal(1300));
		Vehiculo vehi5=new Vehiculo();
		vehi5.setAnio(LocalDateTime.of(2017, 1, 1, 1, 1));
		vehi5.setChasis("abcdef");
		vehi5.setMarca("Chevrolet");
		vehi5.setPrecio(new BigDecimal(1400));
		Vehiculo vehi6=new Vehiculo();
		vehi6.setAnio(LocalDateTime.of(2018, 1, 1, 1, 1));
		vehi6.setChasis("abcdefg");
		vehi6.setMarca("KIA");
		vehi6.setPrecio(new BigDecimal(1500));
		//FIN
		
		// COLECCIONES CLIENTES
		Set<Cliente> clientes1=new HashSet<>();
		clientes1.add(clie1);
		Set<Cliente> clientes21=new HashSet<>();
		clientes21.add(clie2);
		Set<Cliente> clientes2=new HashSet<>();
		clientes2.add(clie1);
		clientes2.add(clie2);
		Set<Cliente> clientes3=new HashSet<>();
		clientes3.add(clie1);
		clientes3.add(clie2);
		clientes3.add(clie3);
		Set<Cliente> clientes4=new HashSet<>();
		//clientes4.add(clie1);
		//clientes4.add(clie2);
		clientes4.add(clie3);
		clientes4.add(clie4);
		//FIN
		
		// COLECCIONES VEHICULOS
		Set<Vehiculo> vehiculos1=new HashSet<>();
		vehiculos1.add(vehi1);
		Set<Vehiculo> vehiculos2=new HashSet<>();
		vehiculos2.add(vehi1);
		vehiculos2.add(vehi2);
		Set<Vehiculo> vehiculos3=new HashSet<>();
		vehiculos3.add(vehi1);
		vehiculos3.add(vehi2);
		vehiculos3.add(vehi3);
		Set<Vehiculo> vehiculos4=new HashSet<>();
		vehiculos4.add(vehi1);
		vehiculos4.add(vehi2);
		vehiculos4.add(vehi3);
		vehiculos4.add(vehi4);
		Set<Vehiculo> vehiculos5=new HashSet<>();
		//vehiculos5.add(vehi1);
		//vehiculos5.add(vehi2);
		vehiculos5.add(vehi3);
		vehiculos5.add(vehi4);
		vehiculos5.add(vehi5);
		Set<Vehiculo> vehiculos6=new HashSet<>();
		vehiculos6.add(vehi1);
		vehiculos6.add(vehi2);
		vehiculos6.add(vehi3);
		vehiculos6.add(vehi4);
		vehiculos6.add(vehi5);
		vehiculos6.add(vehi6);
		//FIN
		
		//OBJETOS CLIENTES NETOS
		clie1.setVehiculos(vehiculos1);
		
		clie2.setVehiculos(vehiculos2);
		
		clie3.setVehiculos(vehiculos5);
		clie4.setVehiculos(vehiculos5);
		//FIN
		
		//OBJETOS VEHICULOS NETOS
		vehi1.setClientes(clientes1);
		
		vehi1.setClientes(clientes21);
		vehi2.setClientes(clientes21);
		
		vehi3.setClientes(clientes4);
		vehi4.setClientes(clientes4);
		vehi5.setClientes(clientes4);
		
		//FIN
		
		
		//inserciones
		//iVehiculoService.agregar(vehi1);
		//iVehiculoService.agregar(vehi2);
		System.out.println("vehi3");
		//iVehiculoService.agregar(vehi3);
		System.out.println("vehi4");
		//iVehiculoService.agregar(vehi4);
		System.out.println("vehi5");
		iVehiculoService.agregar(vehi5);
		
		
		
		
		
	}
	
	public void runAutores(String... args) throws Exception {
		
		Autor autor1= new Autor();
		autor1.setNombre("WS");
		Set<Autor> listaAutor1=new HashSet<Autor>(); 
		listaAutor1.add(autor1);
		
		Libro libro1=new Libro();
		libro1.setNombre("P. Web");
		libro1.setEditorial("PLANETA");
		libro1.setAutores(listaAutor1);
		
		Libro libro2=new Libro();
		libro2.setNombre("Redes");
		libro2.setEditorial("PLANETA");
		libro2.setAutores(listaAutor1);
		
		Set<Libro> listaLibros1=new HashSet<Libro>();
		listaLibros1.add(libro1);
		listaLibros1.add(libro2);
		
		autor1.setLibros(listaLibros1);
		autorService.agregarAutor(autor1);
		
	}
	
	
	public void runHoteles(String... args) throws Exception {

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
