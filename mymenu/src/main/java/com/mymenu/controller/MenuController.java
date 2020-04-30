package com.mymenu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mymenu.model.Menu;
import com.mymenu.service.MenuService;

import io.swagger.annotations.ApiOperation;

@RestController
public class MenuController 
{
	@Autowired
	MenuService menuService;
	@ApiOperation(value = "Create a Menu")
	@PostMapping("/menu")
	private Menu createMenu(@RequestBody Menu menu) 
	{
		return menuService.createMenu(menu);
	
	}
	@ApiOperation(value = "get Items by Id")
	@GetMapping("/menu/{id}")
	private Menu getMenuItem (@PathVariable("id") int id) 
	{
		return menuService.getMenuItem(id);
	}
	@ApiOperation(value = "Update items by id")
	@PutMapping("/menu/{id}")
	private Menu update(@RequestBody Menu menu,@PathVariable("id") int id) 
	{
		 Menu menu1 = null;
		 
		if(menuService.getMenuItem(id)!=null) {
		 menu1 = menuService.createMenu(menu);
		}
		return menu1;
		
	}
	@ApiOperation(value = "Delete menu items by id")
	@DeleteMapping("/menu/{id}")
	private void delete(@PathVariable("id") int id) 
	{
		menuService.delete(id);
	}

}
