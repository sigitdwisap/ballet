package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import common.RestResponse;

import service.DancerSvc;

@RestController
@RequestMapping("/dancer")
public class DancerCtl {

	@Autowired
	private DancerSvc dancerSvc;
	
	@RequestMapping(value = "all", method = RequestMethod.GET)
	public RestResponse findAll() {
		RestResponse restResponse = new RestResponse(); 
		try {
			restResponse.setStatus(1);
			restResponse.setMessage("success");
			restResponse.setDatas(dancerSvc.findAll());
		} catch(Exception ex) {
			restResponse.setStatus(0);
			restResponse.setMessage(ex.getMessage());
		}
		return restResponse;				
	}
}
