package Tienda.demo.controller;


import Tienda.demo.domain.Articulo;
import Tienda.demo.service.ArticuloService;
import Tienda.demo.service.CategoriaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


/**
 *
 * @author steve
 */
@Controller
@Slf4j
public class ArticuloController {
    @Autowired
    private ArticuloService articuloService;
      @Autowired
    private CategoriaService categoriaService;
    @GetMapping("/articulo/listado")
    public String inicio(Model model) {



var articulos = articuloService.getArticulos(false);
model.addAttribute("articulos", articulos);


return "/articulo/listado";
    }
 @GetMapping("/articulo/nuevo")
    public String nuevoArticulo(Articulo articulo, Model model){
        var categorias=categoriaService.getCategorias(true);
        model.addAttribute("categorias",categorias);
        return "/articulo/modifica";
    }
    @PostMapping("/articulo/guardar")
    public String guardarArticulo(Articulo articulo){
        articuloService.save(articulo);
        return"redirect:/articulo/listado";
    }
    @GetMapping("/articulo/modificar/{idarticulo}")
    public String modificarArticulo(Articulo articulo, Model model){
        var respuesta = articuloService.getArticulo(articulo);
model.addAttribute("articulo", respuesta);
        return "/articulo/modifica";
    }
       @GetMapping("/articulo/articulo/{idarticulo}")
    public String eliminarArticulo(Articulo articulo){
articuloService.delete(articulo);
        return "redirect:/";
    }
}

