package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.table.DefaultTableModel;

import com.mysql.cj.xdevapi.Result;

import model.nhanvien;
import database.JDBCtiul;
import viewf.fromview; 
public class danhsachnhanvien {
	
	public List<nhanvien> laydanhsach() {
		// khai báo 1 danh sách 
		List<nhanvien> laydanhsach = new ArrayList<>() ;	
		
		try {
			// kết nối jdbc
			
			Connection con = new JDBCtiul().getConnection() ;
			String sql = "select * from nhanvien ";
		Statement ts = con.createStatement();
		ResultSet rs = ts.executeQuery(sql);
			// khai báo 1 đối tượng 
			nhanvien objNV = null ;
			while (rs.next()) {
				objNV = new nhanvien() ;
				objNV.setId(rs.getString("id"));
				objNV.setHoten(rs.getString("hoten"));
			    objNV.setLuong(rs.getInt("luong"));
				objNV.setDiachi(rs.getNString("diachi"));
				objNV.setSodienthoai(rs.getInt("sodienthoai"));
				objNV.setChucvu(rs.getString("chucvu"));
				// thêm vào danh sách 
				laydanhsach.add(objNV);
			}
			con.close();
			
			
		} catch (SQLException e) {
			 Logger.getLogger(danhsachnhanvien.class.getName()).log(Level.SEVERE, null, e);
		}
		
		return laydanhsach;
	}
	
	
}
