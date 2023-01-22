package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Empleado;

public interface IEmpleadoService {

	public void agregar(Empleado empleado);
	public void borrar(Integer id);
	public Empleado consultar(Integer id);
	public void actualizar(Empleado empleado);
}
