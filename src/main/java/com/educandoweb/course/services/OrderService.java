package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.repositories.OrderRepository;

@Service	//registra um serviço na sua camada de serviço como componente
public class OrderService {

	@Autowired	//faz a injeção de dependência para o programador
	private OrderRepository repository;
	
	//método para retornar todos os usuários do banco de dados
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
