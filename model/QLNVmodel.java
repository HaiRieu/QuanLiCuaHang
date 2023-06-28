package model;

import java.util.ArrayList;
import model.nhanvien; 
public class QLNVmodel {
	private ArrayList<nhanvien> dsnhvien ;
	private String luachon ;
	private String tenfile ;
	private ArrayList<sanpham> dssanpham ;
	public QLNVmodel() {
		this.dsnhvien = new ArrayList<nhanvien>() ;
		this.dssanpham = new ArrayList<sanpham>() ;
		this.luachon = "";
		this.tenfile = "";
	}
	public ArrayList<nhanvien> getDsnhvien() {
		return dsnhvien;
	}
	public void setDsnhvien(ArrayList<nhanvien> dsnhvien) {
		this.dsnhvien = dsnhvien;
	}
	public String getLuachon() {
		return luachon;
	}
	public void setLuachon(String luachon) {
		this.luachon = luachon;
	}
	public String getTenfile() {
		return tenfile;
	}
	public void setTenfile(String tenfile) {
		this.tenfile = tenfile;
	}
	public void delete(nhanvien nv) {
		this.dsnhvien.remove(nv);
	}
	public void insert (nhanvien nv) {
		this.dsnhvien.add(nv);
	}
	public void update(nhanvien nv) {
		this.dsnhvien.remove(nv) ;
		this.dsnhvien.add(nv);
	}
	public boolean kiemtratontai (nhanvien nv) {
		for (nhanvien nhanvien : dsnhvien) {
			if(nhanvien.getId() == nv.getId()) {
				return true ;
			} 
		}
		return false ; 
	}

}
