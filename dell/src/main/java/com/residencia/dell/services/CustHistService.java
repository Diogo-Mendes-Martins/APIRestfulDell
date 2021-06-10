package com.residencia.dell.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.dell.entities.CustHist;
import com.residencia.dell.exceptions.CustHistException;
import com.residencia.dell.repositories.CustHistRepository;

@Service
public class CustHistService {

	@Autowired
	public CustHistRepository custHistRepository;

	public CustHist findById(Integer id) {
		return custHistRepository.findById(id).get();
	}

	public List<CustHist> findAll() {
		return custHistRepository.findAll();
	}
	
	public List<CustHist> listarTodos(){
		return custHistRepository.findAll();
	}
	
	public void salvar(CustHist custhist){
		custHistRepository.save(custhist);
	}
	
	public CustHist salvarComRetorno(CustHist custhist){
		return custHistRepository.save(custhist);
	}

	public void update(CustHist custhist, Integer id) throws CustHistException{
		//Utilizando o Exception
    if(null == id)
			throw new CustHistException("Não foi informado um ID válido.");
		
		custHistRepository.save(custhist);
	}
	



}
