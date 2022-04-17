package Tienda.demo.service;

import Tienda.demo.domain.Articulo;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface ArticuloService {
    public List<Articulo> getArticulos(boolean activos);
    
    public void save(Articulo articulo);
    
    public void delete(Articulo articulo);
    
    public Articulo getArticulo(Articulo articulo);
    
   
}
