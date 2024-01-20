package service;

import java.util.List;
import java.util.Objects;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistance.Item;

public class ItemServiceImpl implements ItemService{
	
	private ItemDao itemDao;
	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
	}
	
	@Override
	public List<Item> getAll() {
		return itemDao.getAll();
	}
	@Override
	public void saveOrUpdate(Item item) {
		Objects.requireNonNull(item , "item should not be null");
		itemDao.saveOrUpdate(item);
		
	}
	
	
}
