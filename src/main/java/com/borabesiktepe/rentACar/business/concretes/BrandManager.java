package com.borabesiktepe.rentACar.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.borabesiktepe.rentACar.business.abstracts.BrandService;
import com.borabesiktepe.rentACar.dataAccess.abstracts.BrandRepository;
import com.borabesiktepe.rentACar.entities.concretes.Brand;

@Service
public class BrandManager implements BrandService {

	private BrandRepository brandRepository;
	
	@Autowired
	public BrandManager (BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}
	
	@Override
	public List<Brand> getAll() {
		//İş Kuralları
		
		return brandRepository.findAll();
	}
	
}
