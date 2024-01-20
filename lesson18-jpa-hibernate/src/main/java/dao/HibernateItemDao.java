package dao;

import java.util.List;

import persistance.Item;

public class HibernateItemDao extends HibernateAbstractDao implements ItemDao {
	
	private static final String GET_ALL_ITEMS = ""
			+ "SELECT * FROM ITEM";
	
	@Override
	public List<Item> getAll() {
		return openSession().createNativeQuery(GET_ALL_ITEMS,Item.class)
				.getResultList();
	}
	
	@Override
	public void saveOrUpdate(Item item) {
	 excuteInTransaction(session -> session.saveOrUpdate(item));
		
	}
	
}