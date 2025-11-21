package com.techware.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "cliente")
@Data
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Cliente")
    private Long idcliente;
    
    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Apellido")
    private String apellido;
    
    @Column(name = "Correo_Electronico")
    private String correoElectronico;
}
