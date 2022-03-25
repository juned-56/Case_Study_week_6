package com.mobile.dao;

import org.springframework.data.repository.CrudRepository;

import com.mobile.entity.Mobile;
//Crud Repository is the base interface and it acts as a marker interface
//it provides crud functions
//CrudRepository<Entity_Class<Mobile>, ID Wrapper_Walss<Integer>>
public interface MobileDao extends CrudRepository<Mobile, Integer>{

}
