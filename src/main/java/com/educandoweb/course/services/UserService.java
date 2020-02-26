package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Service	//registra um serviço na sua camada de serviço como componente
public class UserService {

	@Autowired	//faz a injeção de dependência para o programador
	private UserRepository repository;
	
	//método para retornar todos os usuários do banco de dados
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
