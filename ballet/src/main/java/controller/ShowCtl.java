package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import common.RestResponse;
import dto.ShowDto;
import service.ShowSvc;

@RestController
@RequestMapping("/show")
public class ShowCtl {
	
	@Autowired
	private ShowSvc showSvc;
	
	@RequestMapping(value = "all", method = RequestMethod.GET)
	public RestResponse findAll() {
		RestResponse restResponse = new RestResponse(); 
		try {
			restResponse.setStatus(1);
			restResponse.setMessage("success");
			restResponse.setDatas(showSvc.findAll());
		} catch(Exception ex) {
			restResponse.setStatus(0);
			restResponse.setMessage(ex.getMessage());
		}
		return restResponse;				
	}

	@RequestMapping(value = "{sid}", method = RequestMethod.POST)
	public RestResponse save(@PathVariable("sid") int sid, @RequestBody ShowDto showDto) {
		RestResponse restResponse = new RestResponse(); 
		try {
			showSvc.save(showDto);
			restResponse.setStatus(1);
			restResponse.setMessage("success");
		} catch(Exception ex) {
			restResponse.setStatus(0);
			restResponse.setMessage(ex.getMessage());
		}
		return restResponse;				
	}

	@RequestMapping(value = "{sid}", method = RequestMethod.PUT)
	public RestResponse delete(@PathVariable("sid") int sid, @RequestBody ShowDto showDto) {
		RestResponse restResponse = new RestResponse(); 
		try {
			showSvc.delete(showDto);
			restResponse.setStatus(1);
			restResponse.setMessage("success");
		} catch(Exception ex) {
			restResponse.setStatus(0);
			restResponse.setMessage(ex.getMessage());
		}
		return restResponse;				
	}
}
