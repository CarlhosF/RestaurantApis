package com.RestaurantServices.app.Services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import com.RestaurantServices.app.Repository.MenuRepository;
import com.RestaurantServices.app.entity.Menu;


public class MenuService implements MenuInterface {

	private MenuRepository menuRepository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Menu> findAll() {
		// TODO Auto-generated method stub
		return menuRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Menu> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return menuRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Menu> findById(long id) {
		// TODO Auto-generated method stub
		return menuRepository.findById(id);
	}

	@Override
	@Transactional
	public Menu Save(Menu menu) {
		// TODO Auto-generated method stub
		return menuRepository.save(menu);
	}

	@Override
	@Transactional
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		menuRepository.deleteById(id);
	}

}
