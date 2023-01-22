package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Ciudadano;

public interface ICiudadanoService {

	public void agregar(Ciudadano ciudadano);
	public void borrar(Integer id);
	public Ciudadano consultar(Integer id);
	public void actualizar(Ciudadano ciudadano);
	
}
