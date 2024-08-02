package com.paulina.crud.controllers;

import com.paulina.crud.models.UsuarioModelo;
import com.paulina.crud.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/user")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
    public ArrayList<UsuarioModelo> obtenerUsuarios() {

        return usuarioService.obtenerUsuarios();
    }

    @PostMapping()
    public UsuarioModelo guardarUsuario(@RequestBody UsuarioModelo usuario){
        return this.usuarioService.guardarUsuario(usuario);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.usuarioService.eliminarUsuario(id);
        if(ok){
            return "Se eliminó el usuario con id " + id;
        }else{
            return "No pudo eliminar el usuario con id " + id;
        }
    }
}
