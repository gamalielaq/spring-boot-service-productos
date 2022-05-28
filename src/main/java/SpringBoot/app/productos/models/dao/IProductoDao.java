package SpringBoot.app.productos.models.dao;

import org.springframework.data.repository.CrudRepository;

import SpringBoot.app.productos.models.entity.Producto;

public interface IProductoDao extends CrudRepository<Producto, Long> {
    
}
