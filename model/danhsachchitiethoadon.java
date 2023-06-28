package model;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import database.JDBCtiul;
import model.chitiethoahon;

public class danhsachchitiethoadon {
	public List<chitiethoahon> laydanhsachchitiethoadon() {
		// khai báo 1 danh sách 
		List<chitiethoahon> laydanhsachchitiethoadon = new ArrayList<>() ;	
		
		try {
			// kết nối jdbc
			
			Connection con = new JDBCtiul().getConnection() ;
			String sql = "select * from chitiethoadon ";
		Statement ts = con.createStatement();
		ResultSet rs = ts.executeQuery(sql);
			// khai báo 1 đối tượng 
			chitiethoahon objCTHD = null ;
			while (rs.next()) {
				objCTHD = new chitiethoahon() ;
			 objCTHD.setMachitiethoadon(rs.getString("macthd"));
			 objCTHD.setMahoadon(rs.getString("mahoadon"));
			 objCTHD.setSanpham(rs.getString("sanpham"));
			 objCTHD.setSoluong(rs.getInt("soluong"));
			 objCTHD.setTongtien(rs.getInt("tongtien"));
			 objCTHD.setChuthich(rs.getString("chuthich"));
			 laydanhsachchitiethoadon.add(objCTHD);
			}
			con.close();
			
		} catch (SQLException e) {
			 Logger.getLogger(danhsachchitiethoadon.class.getName()).log(Level.SEVERE, null, e);
		}
		return laydanhsachchitiethoadon ;

}
	

}
