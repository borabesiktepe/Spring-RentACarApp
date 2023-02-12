package com.borabesiktepe.rentACar.dataAccess.abstracts;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.borabesiktepe.rentACar.entities.concretes.Brand;

@Repository
public interface BrandRepository {
	List<Brand> getAll();
}
