/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda.demo.service;

import Tienda.demo.dao.ClienteDao;
import Tienda.demo.domain.Cliente;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author steve
 */

    @Service
public class ClienteServiceImpl implements ClienteService{
@Autowired
private ClienteDao clienteDao;

    @Override
    @Transactional(readOnly=true)
    public List<Cliente> getClientes() {
        return (List<Cliente>)clienteDao.findAll();
    }

    @Override
    @Transactional
    public void save(Cliente cliente) {
       clienteDao.save(cliente);
    }

    @Override
    @Transactional
    public void delete(Cliente cliente) {
 clienteDao.delete(cliente);
    }
    
    @Transactional(readOnly=true)
    public Cliente getClientes(Cliente cliente) {
        return clienteDao.findById(cliente.getIdcliente()).orElse(null);
    }

    @Override
    public Cliente getCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
}
