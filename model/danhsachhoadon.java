package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.hoadon;
import database.JDBCtiul;

public class danhsachhoadon {
	public List<hoadon> laydanhsachhoadon() {
		// khai báo 1 danh sách 
		List<hoadon> laydanhsachhoadon = new ArrayList<>() ;	
		
		try {
			// kết nối jdbc
			
			Connection con = new JDBCtiul().getConnection() ;
			String sql = "select * from hoadon";
		Statement ts = con.createStatement();
		ResultSet rs = ts.executeQuery(sql);
			// khai báo 1 đối tượng 
			hoadon objHD = null ;
			while (rs.next()) {
				objHD = new hoadon() ;
			  objHD.setMahoadon(rs.getString("mahoadon"));
		      objHD.setKhachhang(rs.getString("khachhang"));
		      objHD.setNhanvien(rs.getString("nhanvien"));
		      objHD.setNgaylaphoadon(rs.getString("ngaylaphoadon"));
		      objHD.setTongtien(rs.getInt("tongtien"));
		      objHD.setChuthich(rs.getString("chuthich"));
			  laydanhsachhoadon.add(objHD);
			}
			con.close();
			
		} catch (SQLException e) {
			 Logger.getLogger(danhsachhoadon.class.getName()).log(Level.SEVERE, null, e);
		}
		return laydanhsachhoadon;

}
}
