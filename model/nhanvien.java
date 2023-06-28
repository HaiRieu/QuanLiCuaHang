package model;

import java.util.ArrayList;

public class nhanvien {
	private String id ; 
	private String hoten ;
	private int luong ;
	private String diachi ;
	private int sodienthoai ;
	private String chucvu ; 
	public nhanvien(String id, String hoten, int luong, String diachi, int sodienthoai,String chucvu) {
	
		this.id = id;
		this.hoten = hoten;
		this.luong = luong;
		this.diachi = diachi;
		this.sodienthoai = sodienthoai;
		this.chucvu = chucvu ;
	}
	public nhanvien() {
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public int getLuong() {
		return luong;
	}
	public void setLuong(int luong) {
		this.luong = luong;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public int getSodienthoai() {
		return sodienthoai;
	}
	public void setSodienthoai(int sodienthoai) {
		this.sodienthoai = sodienthoai;
	}
	public String getChucvu() {
		return chucvu;
	}
	public void setChucvu(String chucvu) {
		this.chucvu = chucvu;
	}
	

	


}
