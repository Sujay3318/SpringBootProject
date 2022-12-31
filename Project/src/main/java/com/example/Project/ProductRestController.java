package com.example.Project;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {

	@Autowired
	ProductRepository repository;

	private static final Logger LOGGER = LoggerFactory.getLogger(ProductRestController.class);

	@RequestMapping(value = "/products/", method = RequestMethod.GET)
	public ResponseEntity<List<Product>> getProducts() {
		//return repository.findAll();
		return ResponseEntity.ok( repository.findAll());
	}

	@RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
	public ResponseEntity<Product> getProduct(@PathVariable("id") int id) throws BadRequest {
		LOGGER.info("Finding product by ID:" + id);
		if(id>20)
		{
			throw new BadRequest("enter id less than 20");
		}
		//return repository.findById(id).get();
		return ResponseEntity.ok(repository.findById(id).get());
	}

	@RequestMapping(value = "/products/", method = RequestMethod.POST)
	public Product createProduct(@RequestBody Product product) {
		List<String> l1=new ArrayList<>();
		l1.add("pune");
		l1.add("mumbai");
		int i;
		List<String> city = product.getCity();
		for(i=0;i<city.size();i++)
		{
			System.out.println(i);
			if( !(l1.contains(city.get(i))))
			{		System.out.println(i);
				break;
			}
		}
		System.out.println(i);
		if(i==city.size())
		{
	
		return repository.save(product);
		}else
		{
			return new Product();
		}
	}

	@RequestMapping(value = "/products/", method = RequestMethod.PUT)
	public Product updateProduct(@RequestBody Product product) {
		return repository.save(product);
	}

	@RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
	public void deleteProduct(@PathVariable("id") int id) {
		repository.deleteById(id);
	}

}
