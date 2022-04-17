package Tienda.demo.service;

import Tienda.demo.domain.Categoria;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface CategoriaService {
    public List<Categoria> getCategorias(boolean activos);
    
    public void save(Categoria categoria);
    
    public void delete(Categoria categoria);
    
    public Categoria getCategoria(Categoria categoria);
    
   
}
