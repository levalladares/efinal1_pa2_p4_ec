package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.CitaMedica;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CitaMedicaRepositoryImpl implements CitaMedicaRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(CitaMedica cita) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cita);
		
	}

	@Override
	public void actualizar(CitaMedica cita) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cita);
	}

	@Override
	public CitaMedica seleccionar(String nTurno) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CitaMedica.class, nTurno);
	}

	@Override
	public void eliminar(String nTurno) {
		// TODO Auto-generated method stub
		CitaMedica citMe = this.seleccionar(nTurno);
		this.entityManager.remove(citMe);	
	}

	@Override
	public CitaMedica seleccionarCM(String nCita) {
		// TODO Auto-generated method stub
		TypedQuery<CitaMedica> myQuery = this.entityManager
                .createQuery("SELECT e FROM CitaMedica e WHERE e.nCita=:datoNCita", CitaMedica.class);
		myQuery.setParameter("datoNCita", nCita);
		return myQuery.getSingleResult();
	}

}
