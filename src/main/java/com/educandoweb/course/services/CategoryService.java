package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.repositories.CategoryRepository;

@Service	//registra um serviço na sua camada de serviço como componente
public class CategoryService {

	@Autowired	//faz a injeção de dependência para o programador
	private CategoryRepository repository;
	
	//método para retornar todos os usuários do banco de dados
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
