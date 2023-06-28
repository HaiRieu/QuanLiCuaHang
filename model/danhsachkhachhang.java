package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.khachhang; 
import database.JDBCtiul;

public class danhsachkhachhang {
	public List<khachhang> laydanhsachkhachhang() {
		// khai báo 1 danh sách 
		List<khachhang> laydsskhachhang = new ArrayList<>() ;	
		
		try {
			// kết nối jdbc
			
			Connection con = new JDBCtiul().getConnection() ;
			String sql = "select * from khachhang";
		Statement ts = con.createStatement();
		ResultSet rs = ts.executeQuery(sql);
			// khai báo 1 đối tượng 
			khachhang objKH = null ;
			while (rs.next()) {
				objKH = new khachhang() ; 
			    objKH.setMakhachhang(rs.getString("makhachhang"));
			    objKH.setTenkhachhang(rs.getString("tenkhachhang"));
			    objKH.setGioitinh(rs.getString("gioitinh"));
			    objKH.setDiachi(rs.getString("diachi"));
			    objKH.setSodienthoai(rs.getInt("sodienthoai"));
			    objKH.setLoaikhachhang(rs.getString("loaikhachhang"));
			  	// thêm vào danh sách 
			    laydsskhachhang.add(objKH);
			}
			con.close();
			
		} catch (SQLException e) {
			 Logger.getLogger(danhsachkhachhang.class.getName()).log(Level.SEVERE, null, e);
		}
		return laydsskhachhang;

}
}
