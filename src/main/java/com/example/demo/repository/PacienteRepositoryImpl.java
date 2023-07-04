package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Paciente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PacienteRepositoryImpl implements PacienteRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(paciente);
		
	}

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entityManager.merge(paciente);
		
	}

	@Override
	public Paciente seleccionar(String nombre) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Paciente.class, nombre);

	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		Paciente pasi = this.seleccionar(nombre);
		this.entityManager.remove(pasi);
	}

	@Override
	public Paciente seleccionarP(String cedula) {
		// TODO Auto-generated method stub
		 TypedQuery<Paciente> myQuery = this.entityManager
	                .createQuery("SELECT e FROM Paciente e WHERE e.cedula=:datoCedula", Paciente.class);
	     myQuery.setParameter("datoCedula", cedula);
	     return myQuery.getSingleResult();
	}
	

}
