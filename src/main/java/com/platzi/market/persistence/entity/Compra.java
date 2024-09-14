package com.platzi.market.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
import java.util.List;

@Getter
@Setter

//
@Entity
@Table(name = "compras")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//clave primaria que se genera de manera automatica a medida que se van registrando

    @Column(name="id_compra")
    private Long idCompra;

    @Column(name = "id_cliente")
    private String idCliente;

    private LocalTime fecha;

    @Column(name = "medio_pago")
    private String medioPago;

    private String comentario;
    private  String estado;

    @ManyToOne
    @JoinColumn(name = "id_cliente", insertable = false, updatable = false)//no permita crear mas clientes atraves de esta relacion; aqui se esta conociendo la informacion de ese cliente que está realizando la compra
    private Cliente cliente;//la relacion, asi lo llamamos en la lista de la clase CLIENTE

    @OneToMany(mappedBy = "producto")
    private List<ComprasProducto> productos;

    @OneToMany(mappedBy = "compra") private List<ComprasProducto> productoss;




}
