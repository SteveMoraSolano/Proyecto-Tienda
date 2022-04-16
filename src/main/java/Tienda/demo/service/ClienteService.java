package Tienda.demo.service;

import Tienda.demo.domain.Cliente;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface ClienteService {
    public List<Cliente> getClientes();
    
    public void save(Cliente cliente);
    
    public void delete(Cliente cliente);
    
    public Cliente getCliente(Cliente cliente);
    
   
}
