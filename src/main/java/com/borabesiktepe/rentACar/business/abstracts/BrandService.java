package com.borabesiktepe.rentACar.business.abstracts;

import java.util.List;

import com.borabesiktepe.rentACar.entities.concretes.Brand;

public interface BrandService {
	List<Brand> getAll();
}
