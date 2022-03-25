package com.mobile.service;

import java.util.List;
import java.util.Optional;

import com.mobile.entity.Mobile;

public interface MobileService {
	Mobile addMobile(Mobile mobile); //add mobile method
 
	Mobile updateMobile(Mobile mobile); // update mobile method

	void deleteMobile(int mobileId); //delete mobile method

	Optional<Mobile> getMobile(int mobileId); //get mobile method

	Iterable<Mobile> getAllMobiles(); //get all mobile method
}
