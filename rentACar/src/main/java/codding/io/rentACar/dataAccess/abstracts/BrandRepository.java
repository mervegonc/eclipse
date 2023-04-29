package codding.io.rentACar.dataAccess.abstracts;
import java.util.List;

import codding.io.rentACar.entities.concretes.Brand;

public interface BrandRepository {
	List<Brand> getAll();
}
