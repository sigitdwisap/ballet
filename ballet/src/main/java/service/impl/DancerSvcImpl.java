package service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.DancerDao;
import dto.DancerDto;
import entity.Dancer;
import service.DancerSvc;

@Service("dancerSvc")
@Transactional
public class DancerSvcImpl implements DancerSvc {

	@Autowired
	private DancerDao dancerDao;
	
	@Override
	public List<DancerDto> findAll() {
		List<DancerDto> dancerDtos = new ArrayList<>();
		List<Dancer> dancers = dancerDao.findAll();
		for(Dancer dancer : dancers) {
			DancerDto dancerDto = new DancerDto();
			dancerDto.setDid(dancer.getDid());
			dancerDto.setName(dancer.getName());
			dancerDto.setBirthyear(dancer.getBirthyear());
			dancerDto.setCountry(dancer.getCountry());
			dancerDtos.add(dancerDto);
		}	
		return dancerDtos;
	}

}
