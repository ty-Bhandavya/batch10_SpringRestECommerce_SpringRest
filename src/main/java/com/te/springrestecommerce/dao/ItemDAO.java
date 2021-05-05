package com.te.springrestecommerce.dao;

import java.util.List;

import com.te.springrestecommerce.bean.ItemInfoBean;

public interface ItemDAO {

	
	public ItemInfoBean getitemData(int id);

	public boolean addItem(ItemInfoBean infoBean);

	public boolean updateItem(ItemInfoBean infoBean);

	public boolean deleteItem(int id);
	
}
