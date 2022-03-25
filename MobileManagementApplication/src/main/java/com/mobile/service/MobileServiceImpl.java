package com.mobile.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.dao.MobileDao;
import com.mobile.entity.Mobile;

@Service
@Transactional
public class MobileServiceImpl implements MobileService{
	@Autowired
	MobileDao dao;
	@Override
	public Mobile addMobile(Mobile mobile) {
		// TODO Auto-generated method stub
		return dao.save(mobile); //save a given entity
	}
	@Override
	public void deleteMobile(int mobileId) {
		// TODO Auto-generated method stub
		dao.deleteById(mobileId); //Delete the entity with the given id
	}
	@Override
	public Mobile updateMobile(Mobile mobile) {
		// TODO Auto-generated method stub
		return dao.save(mobile); //save a given entity
	}
	@Override
	public Optional<Mobile> getMobile(int mobileId) {
		// TODO Auto-generated method stub
		return dao.findById(mobileId); //retrieve an entity by its id
	}
	@Override
	public Iterable<Mobile> getAllMobiles() {
		// TODO Auto-generated method stub
		return dao.findAll(); //returns all instances of the type
	}
}
