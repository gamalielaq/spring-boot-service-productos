package SpringBoot.app.productos.models.service;

import java.util.List;

import com.springboot.app.commons.entity.Producto;

public interface IProductoService {

    public List<Producto> findAll();

    public Producto findById(Long id);
    
    public Producto save(Producto producto);
    
    public void deleteById(Long id);

}
