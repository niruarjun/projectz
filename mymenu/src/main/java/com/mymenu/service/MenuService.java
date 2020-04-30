package com.mymenu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mymenu.dao.MenuDao;
import com.mymenu.model.Menu;

@Service
public class MenuService 
{
	@Autowired
	MenuDao dao;
	public Menu createMenu(Menu menu) 
	{
		return dao.save(menu);
	}
	public Menu getMenuItem(int id) 
	{
		return dao.findById(id).get();
	}
	public void update(Menu books, int id) 
	{
		dao.save(books);
	}
	public void delete(int id) 
	{
		dao.deleteById(id);
	}
}