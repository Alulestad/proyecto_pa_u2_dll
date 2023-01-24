package com.example.demo.hotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.hotel.modelo.Hotel;
import com.example.demo.hotel.repo.IHotelRepo;

@Service
public class HotelServiceimpl implements IHotelService {

	@Autowired
	private IHotelRepo hotelRepo ;
	
	@Override
	public void crear(Hotel hotel) {
		// TODO Auto-generated method stub
		this.hotelRepo.insertar(hotel);
	}

	@Override
	public Hotel consultar(Integer id) {
		// TODO Auto-generated method stub
		return this.hotelRepo.buscar(id);
	}

	@Override
	public void actualizar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.hotelRepo.update(hotel);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.hotelRepo.delete(id);
	}

}
