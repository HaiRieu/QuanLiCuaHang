package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.sanpham; 
import database.JDBCtiul;

public class danhsachsanpham {
	public List<sanpham> laydanhsachsanpham() {
		// khai báo 1 danh sách 
		List<sanpham> laydssanpham = new ArrayList<>() ;	
		
		try {
			// kết nối jdbc
			
			Connection con = new JDBCtiul().getConnection() ;
			String sql = "select * from sanpham ";
		Statement ts = con.createStatement();
		ResultSet rs = ts.executeQuery(sql);
			// khai báo 1 đối tượng 
			sanpham objSP = null ;
			while (rs.next()) {
				objSP = new sanpham() ; 
				objSP.setMasanpham(rs.getString("masanpham"));
			    objSP.setTensanpham(rs.getString("tensanpham"));
			    objSP.setLoaisanpham(rs.getString("loaisanpham"));
			    objSP.setHangsanxuat(rs.getString("hangsanxuat"));
			    objSP.setGianhap(rs.getInt("gianhap"));
			    objSP.setGiaban(rs.getInt("giaban"));
			    objSP.setTonkho(rs.getInt("tonkho"));
			    objSP.setHinhanh(rs.getString("hinhanh"));
				// thêm vào danh sách 
			    laydssanpham.add(objSP);
			}
			con.close();
			
		} catch (SQLException e) {
			 Logger.getLogger(danhsachsanpham.class.getName()).log(Level.SEVERE, null, e);
		}
		return laydssanpham;
	}
	
}
