package SpringBoot.app.productos.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SpringBoot.app.productos.models.service.IProductoService;
import SpringBoot.app.productos.models.entity.Producto;

@RestController
@RequestMapping("/api")
public class ProductoController {
	
	@Autowired
	private Environment env;
	
	@Value("${server.port}")
	private Integer port; 
	
    @Autowired
    private IProductoService productoService;

    @GetMapping("/listar")
    public List<Producto> listar() {
        return this.productoService.findAll()
        		.stream().map( (producto) -> {
        			//producto.setPort(Integer.parseInt(env.getProperty("local.server.port")));
        			producto.setPort(port);
        			return producto;  
        		}).collect(Collectors.toList());
        
    }

    @GetMapping("/listar/{id}")
    public Producto detalle(@PathVariable Long id) {
    	Producto producto = this.productoService.findById(id); 
    	//producto.setPort(Integer.parseInt(env.getProperty("local.server.port")));
    	producto.setPort(port);
        return producto;
    }
}