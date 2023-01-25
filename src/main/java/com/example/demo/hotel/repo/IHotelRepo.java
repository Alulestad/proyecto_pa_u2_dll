package com.example.demo.hotel.repo;

import com.example.demo.hotel.modelo.Hotel;

public interface IHotelRepo {
	//CRUD
	public void insertar(Hotel hotel);
	public Hotel buscar(Integer id);
	public Hotel buscarLigero(Integer id);
	public void update(Hotel hotel);
	public void delete(Integer id);
	
}
