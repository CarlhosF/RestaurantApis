package com.RestaurantServices.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RestaurantServices.app.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
