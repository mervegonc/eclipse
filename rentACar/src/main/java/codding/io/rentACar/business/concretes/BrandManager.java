package codding.io.rentACar.business.concretes;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import codding.io.rentACar.business.abstracts.BrandService;
import codding.io.rentACar.dataAccess.abstracts.BrandRepository;
import codding.io.rentACar.entities.concretes.Brand;

@Service//bu sınıf bır business nesnesidir
public class BrandManager implements BrandService{
	private BrandRepository brandRepository;
	
	@Autowired
	public BrandManager(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}
	@Override
	public List<Brand> getAll(){
		//iş kuralları
		return brandRepository.getAll();
	}
}
