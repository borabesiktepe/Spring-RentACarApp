package com.borabesiktepe.rentACar.business.abstracts;

import java.util.List;

import com.borabesiktepe.rentACar.business.requests.CreateBrandRequest;
import com.borabesiktepe.rentACar.business.responses.GetAllBrandsResponse;

public interface BrandService {
	List<GetAllBrandsResponse> getAll();
	void add(CreateBrandRequest createBrandRequest);
}
