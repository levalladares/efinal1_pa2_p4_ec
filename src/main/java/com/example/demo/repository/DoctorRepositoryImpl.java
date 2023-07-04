package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Doctor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class DoctorRepositoryImpl implements DoctorRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.entityManager.persist(doctor);
		
	}

	@Override
	public void actualizar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.entityManager.merge(doctor);
	}

	@Override
	public Doctor seleccionar(String nombre) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Doctor.class, nombre);
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		Doctor doc=this.seleccionar(nombre);
		this.entityManager.remove(doc);
	}

	@Override
	public Doctor seleccionarD(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Doctor> myQuery = this.entityManager
                .createQuery("SELECT e FROM Doctor e WHERE e.cedula=:datoCedula", Doctor.class);
		myQuery.setParameter("datoCedula", cedula);
		return myQuery.getSingleResult();
	}

}
