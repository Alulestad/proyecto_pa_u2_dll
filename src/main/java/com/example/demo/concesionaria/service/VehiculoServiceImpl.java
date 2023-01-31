package com.example.demo.concesionaria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.concesionaria.modelo.Vehiculo;
import com.example.demo.concesionaria.repository.IVehiculoRepository;

@Service
public class VehiculoServiceImpl implements IVehiculoService {

	@Autowired
	private IVehiculoRepository iVehiculoRepository;
	
	@Override
	public void agregar(Vehiculo vehiculo) {
		this.iVehiculoRepository.insert(vehiculo);

	}

	@Override
	public Vehiculo buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iVehiculoRepository.select(id);
	}

	@Override
	public Vehiculo buscartodos(Integer id) {
		// TODO Auto-generated method stub
		return this.iVehiculoRepository.selectAll(id);
	}

	@Override
	public void atualizar(Vehiculo vehiculo) {
		this.iVehiculoRepository.update(vehiculo);

	}

	@Override
	public void borrar(Integer id) {
		this.iVehiculoRepository.delete(id);

	}

}
