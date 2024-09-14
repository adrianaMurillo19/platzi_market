package com.platzi.market.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
//esta clase mapea una tabla de la BD
@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//clave primaria que se genera de manera automatica a medida que se van registrando
    @Column(name = "id_producto")//el nombre verdadero de la columna
    private long idProducto;

    private String nombre;

    @Column(name = "id_categoria")//entre parentesis va el nombre de real
    private Long idCategoria;

    @Column(name = "codigo_barra")
    private String codigoBarra;

    @Column(name = "precio_venta")
    private Double precioVenta;

    @Column(name = "cantidad_sto")
    private Integer cantidadSto;

    private boolean estado;

    @ManyToOne
    @JoinColumn(name="id_categoria", insertable=false, updatable=false)//no se van a borrar o actualizar
    public Categoria categoria;//




}
