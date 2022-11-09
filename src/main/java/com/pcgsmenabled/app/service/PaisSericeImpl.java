package com.pcgsmenabled.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pcgsmenabled.app.dao.IPaisDao;
import com.pcgsmenabled.app.entity.Pais;

@Service
public class PaisSericeImpl implements IPaisService {
	@Autowired
	private IPaisDao paisDao;
	@Override
	public List<Pais> findAll() {
		// TODO Auto-generated method stub
		return (List<Pais>) paisDao.findAll();
	}

	@Override
	public Pais findById(String id) {
		// TODO Auto-generated method stub
		return paisDao.findById(id).orElse(null);
	}

	@Override
	public Pais save(Pais pais) {
		// TODO Auto-generated method stub
		return paisDao.save(pais);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		paisDao.deleteById(id);

	}

}
