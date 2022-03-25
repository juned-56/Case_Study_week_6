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
		return dao.save(mobile);
	}
	@Override
	public void deleteMobile(int mobileId) {
		// TODO Auto-generated method stub
		dao.deleteById(mobileId);
	}
	@Override
	public Mobile updateMobile(Mobile mobile) {
		// TODO Auto-generated method stub
		return dao.save(mobile);
	}
	@Override
	public Optional<Mobile> getMobile(int mobileId) {
		// TODO Auto-generated method stub
		return dao.findById(mobileId);
	}
	@Override
	public Iterable<Mobile> getAllMobiles() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
}
