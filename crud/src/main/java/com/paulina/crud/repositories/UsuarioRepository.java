package com.paulina.crud.repositories;

import com.paulina.crud.models.UsuarioModelo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModelo, Long> {

}
