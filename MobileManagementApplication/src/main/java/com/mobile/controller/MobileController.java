package com.mobile.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.entity.Mobile;
import com.mobile.service.MobileService;

@RestController
@RequestMapping("/mobile") //class level url
public class MobileController {
	@Autowired
	MobileService service;
	@PostMapping("/addMobile") //method level url : http://localhost:2828/mobile/addmobile
	public Mobile addMobile(@RequestBody Mobile mobile){
		return service.addMobile(mobile);
	}
	@PutMapping("/updateMobile") //method level url : http://localhost:2828/mobile/updateMobile
	public Mobile updateMobile(@RequestBody Mobile mobile) {
		return service.updateMobile(mobile);
	}
	@GetMapping("/getMobile/{mid}") //method level url : http://localhost:2828/mobile/getMobile/mid
	public Optional<Mobile> getMobile(@PathVariable("mid") int mobileId) {
		return service.getMobile(mobileId);
	}
	@GetMapping("/getAllMobile") //method level url : http://localhost:2828/mobile/getAllMobile
	public Iterable<Mobile> getAllMobile() {
		return service.getAllMobiles();
	}
	@DeleteMapping("/deleteMobile/{mid}") //method level url : http://localhost:2828/mobile/deleteMobile/mid
	public void deleteMobile(@PathVariable("mid") int mobileId) {
		 service.deleteMobile(mobileId);
	}
}
