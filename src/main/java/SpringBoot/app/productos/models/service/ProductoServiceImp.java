package SpringBoot.app.productos.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import SpringBoot.app.productos.models.dao.IProductoDao;
import SpringBoot.app.productos.models.entity.Producto;

@Service
public class ProductoServiceImp implements IProductoService {

    @Autowired
    private IProductoDao productoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> findAll() {
        return (List<Producto>) this.productoDao.findAll();
    }

    @Override
    public Producto findById(Long id) {
        return this.productoDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Producto save(Producto producto) {
        return this.productoDao.save(producto);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        this.productoDao.deleteById(id);
    }
}
