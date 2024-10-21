package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Cliente;
import com.example.demo.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	private final ClienteRepository clienterepository;
	
	@Autowired
	public ClienteService(ClienteRepository clienterepository) {
		this.clienterepository = clienterepository;
	}

	//criação do cliente
	public Cliente saveCliente(Cliente cliente) {
		return clienterepository.save(cliente);
	}
	//buscar cliente 
	public Cliente getClienteById(Long id) {
		return clienterepository.findById(id).orElse(null);
	}
	//procurar todos os clientes
	public List<Cliente> getAllCliente(){
		return clienterepository.findAll();
	}
	
	//excluir os clientes
	public void deleteCliente(Long id) {
		clienterepository.deleteById(id);
	}
}
