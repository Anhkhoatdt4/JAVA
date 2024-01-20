package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import bean.ItemGroup;
import configuration.DbConnection;
import ultis.SQLUtils;

public class JDBCItemGroupDao implements ItemGroupDao{
	
	private Connection conn;
	private Statement st;
	private ResultSet rs; 
	
	public JDBCItemGroupDao() {
		conn = DbConnection.getConnection();
	}
	
	@Override
	public List<ItemGroup> getAll() {
		List<ItemGroup> result = new ArrayList<>();
		String sql = "select * from item_group";
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				ItemGroup ig = new ItemGroup(
						rs.getInt("ID"),
						rs.getString("NAME"),
						rs.getString("DESC"));
				result.add(ig);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SQLUtils.close(rs,st);
		}
		
		return result;
	}
}
