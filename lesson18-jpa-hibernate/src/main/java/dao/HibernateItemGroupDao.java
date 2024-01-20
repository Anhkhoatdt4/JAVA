package dao;

import java.util.List;

import javax.xml.transform.Transformer;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import com.mysql.cj.protocol.a.NativeConstants.IntegerDataType;

import persistance.ItemGroup;
import persistance.ItemGroupDto;

public class HibernateItemGroupDao extends HibernateAbstractDao implements ItemGroupDao{
	
	private static final String PARAM_ID = "pid";
	private static final String PARAM_NAME = "pname";
	private static final String PARAM_DESC = "pdesc";
	
	private static final String SQL_PARAM_ID = ":" + PARAM_ID;
	private static final String SQL_PARAM_NAME = ":" + PARAM_NAME;
	private static final String SQL_PARAM_DESC = ":" + PARAM_DESC;
	
	private static final String Get_ALL_ITEM_GROUP = ""
			+ "SELECT* FROM ITEM_GROUP";
	
	private static final String GET_ITEM = "" + 
			"SELECT * FROM ITEM_GROUP WHERE ID = " + SQL_PARAM_ID;
	
	private static final String STATISTIC = "" +
				"select ig.ID " + ItemGroupDto.PROP_ID +",\n"
				+ " ig.`NAME` " +ItemGroupDto.PROP_NAME + " , \n"
				+ " sum(od.AMOUNT)" + ItemGroupDto.PROP_AMOUNT + " \n"
				+ "from item_group ig\n"
				+ "join item it \r\n"
				+ "on ig.ID = it.ITEM_GROUP_ID\n"
				+ "join order_detail od\n"
				+ "on it.ID = od.ITEM_ID\n"
				+ "group by ig.ID";
	
	private static final String INSERT_ITEM_GROUP = ""
			+ "insert into item_group(ID ,NAME , `DESC`)\n"
			+ "values(" + SQL_PARAM_ID + " , " + SQL_PARAM_NAME + " , " + SQL_PARAM_DESC + ")" ;
	
	public List<ItemGroup> getAll() {
		// b1: lay ra session factory , session
		Session session = openSession();
		
		// b2 : tuu session --> goi ham de truyen vao cau lenh SQL 
		// roi tra ve doi tuong Query (NativeQuerry , JPQL/HQL , @NamedQuery)
		NativeQuery<ItemGroup> query = 
				session.createNativeQuery(Get_ALL_ITEM_GROUP,ItemGroup.class);
		// b3 : dung query
		// -> truyen tham so neu co 
		// -> goi truy van de tra ve du lieu
		
		List<ItemGroup> result = query.getResultList();
		
		return result;
	}
	
	@Override
	public ItemGroup get(int id) {
		
		// c1 -> su dung native query 
		Session session = openSession();
		
		 NativeQuery<ItemGroup> query = session.createNativeQuery(GET_ITEM, ItemGroup.class);
		
		query.setParameter(PARAM_ID, id,IntegerType.INSTANCE);
		
		// c2 --> built-in function of hibernate
		
		
		
		return query.uniqueResult();
	}
	

	@SuppressWarnings("deprecation")
	@Override
	public List<ItemGroupDto> statistic() {
	
		// b1 tao session
		Session session = openSession();
		
		// b2 tao native query -> createNativeQuery --> dau hoi warning vi chua biet kieu tra ve
		NativeQuery<?> query = session.createNativeQuery(STATISTIC);
		
		// b3: neu co thi set parameter 
		// b4 : mapping ket qua khi thuc hien native query vao KDL tra ve(dto) 
		// -> jpa/hibernate -> transformer
		query.addScalar(ItemGroupDto.PROP_ID,IntegerType.INSTANCE);
		query.addScalar(ItemGroupDto.PROP_NAME,IntegerType.INSTANCE);
		query.addScalar(ItemGroupDto.PROP_AMOUNT,IntegerType.INSTANCE);
		query.setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class));
		
		return safeList(query);
		}
	
	
	@Override
	public void save(ItemGroup itemGroup) {
		// c1 -> su dung native query 
		//Session session = openSession();
		
		//Transaction transaction = session.beginTransaction();
//		try {
			// cach 1 nativequery
//			NativeQuery<?> query= session.createNativeQuery(INSERT_ITEM_GROUP);
//			
//			query.setParameter(PARAM_ID, itemGroup.getId(),IntegerType.INSTANCE)
//				 .setParameter(PARAM_NAME, itemGroup.getName(),StringType.INSTANCE)
//				 .setParameter(PARAM_DESC , itemGroup.getDescription(),StringType.INSTANCE);
//				 
//			int affectedRows = query.executeUpdate();
//			
//			System.out.println(">> LOG: affeted rows -->" + affectedRows);
//			transaction.commit();
			
			// cach 2 0 builtin fuction of hibernate
//			session.saveOrUpdate(itemGroup);
//			
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//			transaction.rollback();
//		}
//		
			
		// c2 --> built-in function of hibernate
		excuteInTransaction(session -> {
			session.saveOrUpdate(itemGroup);
		});
	}
}
	

