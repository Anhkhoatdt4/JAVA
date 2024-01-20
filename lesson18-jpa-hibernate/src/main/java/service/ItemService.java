package service;

import java.util.List;

import persistance.Item;

public interface ItemService {
	List<Item> getAll();
	
	void saveOrUpdate(Item item);
}
