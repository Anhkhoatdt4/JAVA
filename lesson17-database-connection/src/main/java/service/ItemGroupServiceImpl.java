package service;

import java.util.List;

import bean.ItemGroup;
import dao.ItemGroupDao;
import dao.JDBCItemGroupDao;

public class ItemGroupServiceImpl implements ItemGroupService {
	
	private ItemGroupDao itemGroupDao;
	public ItemGroupServiceImpl() {
		itemGroupDao = new JDBCItemGroupDao();
	}
	
	@Override
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}
}
