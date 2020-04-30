package com.mymenu.dao;
import org.springframework.data.repository.CrudRepository;

import com.mymenu.model.Menu;
public interface MenuDao extends CrudRepository<Menu, Integer>
{
}
