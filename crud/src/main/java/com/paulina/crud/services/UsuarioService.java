package com.paulina.crud.services;

import com.paulina.crud.models.UsuarioModelo;
import com.paulina.crud.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModelo> obtenerUsuarios(){
        //casteamos para poder regresarlo a un json
        return(ArrayList<UsuarioModelo>) usuarioRepository.findAll();
    }

    public UsuarioModelo guardarUsuario(UsuarioModelo usuario){
        return usuarioRepository.save(usuario);
    }

    public boolean eliminarUsuario(Long id){
        try {
            usuarioRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }



}
