package com.te.springrestecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.springrestecommerce.bean.ItemInfoBean;
import com.te.springrestecommerce.dao.ItemDAOImpl;




@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	ItemDAOImpl ItemDAO;

	@Override
	public ItemInfoBean getitemData(int id) {
		
		return  ItemDAO.getitemData(id);
	}

	

	@Override
	public boolean addItem(ItemInfoBean infoBean) {
		
		return ItemDAO.addItem(infoBean);
	}

	@Override
	public boolean updateItem(ItemInfoBean infoBean) {
		
		return ItemDAO.updateItem(infoBean);
	}

	@Override
	public boolean deleteItem(int id) {
		
		return ItemDAO.deleteItem(id);
	}

}
