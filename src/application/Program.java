package application;

import model.entities.Department;

public class Program {

	public static void main(String[] args) {
		
//		Connection conn = null;
//		Statement st = null;
//		ResultSet rs = null;
//		
//		
//		try {
//			conn = DB.getConnection();
//			
//			st = conn.createStatement();
//			rs = st.executeQuery("SELECT * FROM DEPARTMENT");
//			
//			while (rs.next()) {
//				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
//			}
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			DB.closeResultSet(rs);
//			DB.closeStatement(st);
//			DB.closeConnection();
//		}
		
		Department dpt = new Department();
		
		dpt.setId(1);
		dpt.setName("Books");
		
		System.out.println(dpt);
		

	}

}
