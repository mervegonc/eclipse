package codding.io.rentACar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import codding.io.rentACar.dataAccess.abstracts.BrandRepository;
import codding.io.rentACar.entities.concretes.Brand;

@Repository//bu sınıf bır dataccess nesnesidir
public class InMemoryBrandRepository implements BrandRepository {

	List<Brand> brands;
	
	public InMemoryBrandRepository() {
		brands = new ArrayList<Brand>();
		brands.add(new Brand(1,"BMW"));
		brands.add(new Brand(1,"MERCEDES"));
		brands.add(new Brand(1,"AUDİ"));
		brands.add(new Brand(1,"FİAT"));
		brands.add(new Brand(1,"RENAULT"));
		
	}
	
	@Override
	public List<Brand> getAll() {

		return brands;
	}
	

}
