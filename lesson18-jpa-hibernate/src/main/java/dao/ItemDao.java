package dao;

import java.util.List;

import persistance.Item;

public interface ItemDao {
	List<Item> getAll();
	void saveOrUpdate(Item item);
}
