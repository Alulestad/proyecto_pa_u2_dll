package com.example.demo.hotel.service;

import com.example.demo.hotel.modelo.Hotel;

public interface IHotelService {
	public void crear(Hotel hotel);
	public Hotel consultar(Integer id);
	public void actualizar(Hotel hotel);
	public void eliminar(Integer id);
}
