package com.example.demo.hotel.service;

import com.example.demo.hotel.modelo.Habitacion;
import com.example.demo.hotel.modelo.Hotel;

public interface IHabitacionService {

	public void crear(Habitacion habitacion);
	public Habitacion consultar(Integer id);
	public void actualizar(Habitacion habitacion);
	public void eliminar(Integer id);
}
