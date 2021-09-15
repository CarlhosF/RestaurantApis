package com.RestaurantServices.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RestaurantServices.app.entity.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long>{

}
