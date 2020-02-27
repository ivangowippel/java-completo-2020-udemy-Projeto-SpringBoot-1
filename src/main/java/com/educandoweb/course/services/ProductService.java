package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.repositories.ProductRepository;

@Service	//registra um serviço na sua camada de serviço como componente
public class ProductService {

	@Autowired	//faz a injeção de dependência para o programador
	private ProductRepository repository;
	
	//método para retornar todos os usuários do banco de dados
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
