package application;

import java.text.SimpleDateFormat;
import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

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
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Department dpt = new Department();
		
		
		dpt.setId(1);
		dpt.setName("Books");
		
		Seller seller = new Seller(1, "Edan Almeida", "email@email.com", new Date(), 3000.0, dpt);
		
		System.out.println(dpt);
		System.out.println(seller);
		

	}

}
