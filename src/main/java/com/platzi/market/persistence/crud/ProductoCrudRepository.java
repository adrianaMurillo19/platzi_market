package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
                                                             //la Clase y el Tipo de datos del id
public interface ProductoCrudRepository extends CrudRepository<Producto, Long> {


        //(como se llama en la clase)
    List<Producto> findByIdCategoria(int idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

    List<Producto> findByIdCategoriaOrderByNombreAsc(long idCategoria);
}
