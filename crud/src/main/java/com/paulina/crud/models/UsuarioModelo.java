package com.paulina.crud.models;

import jakarta.persistence.*;

@Entity
@Table(name="usuario")
public class UsuarioModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Se genera automaticamente y de forma incrementable
    @Column(unique = true, nullable = false) //es único y no puede ser nulo
    private Long id;

    private String nombre;
    private String apellido; //el camel case lo pasaría al formato en la columna palabra_palabra
    private Integer edad;
    private String email;

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
