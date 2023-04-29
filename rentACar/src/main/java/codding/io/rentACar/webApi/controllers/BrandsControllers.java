package codding.io.rentACar.webApi.controllers;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import codding.io.rentACar.business.abstracts.BrandService;
import codding.io.rentACar.entities.concretes.Brand;

@RestController //annotation bilgilendirme
@RequestMapping("/api/brands")
public class BrandsControllers {
	 private BrandService  brandService;

	public BrandsControllers(BrandService brandService) {
		super();
		this.brandService = brandService;
	}
	
	@GetMapping("/getAll")
	 public List<Brand> getAll(){
		return brandService.getAll();
	 }
	 
}
