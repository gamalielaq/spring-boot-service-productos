package SpringBoot.app.productos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.app.commons.entity.Producto;


public interface IProductoDao extends CrudRepository<Producto, Long> {
    
}
