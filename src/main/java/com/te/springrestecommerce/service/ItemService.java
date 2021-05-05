package com.te.springrestecommerce.service;

import com.te.springrestecommerce.bean.ItemInfoBean;

public interface ItemService {


	public ItemInfoBean getitemData(int id);

	public boolean addItem(ItemInfoBean infoBean);

	public boolean updateItem(ItemInfoBean infoBean);

	public boolean deleteItem(int id);

}