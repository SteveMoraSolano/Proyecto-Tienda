package Tienda.demo.dao;

import Tienda.demo.domain.Credito;
import org.springframework.data.repository.CrudRepository;

public interface CreditoDao extends CrudRepository<Credito, Long> {
    
}
