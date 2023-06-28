package model;

public class chitiethoahon {
private String machitiethoadon ;
private String mahoadon ;
private String sanpham ;
private int soluong  ;
private int tongtien ;
private String chuthich ;

public chitiethoahon(String machitiethoadon, String mahoadon, String sanpham, int soluong, int tongtien,
		String chuthich) {
	this.machitiethoadon = machitiethoadon;
	this.mahoadon = mahoadon;
	this.sanpham = sanpham;
	this.soluong = soluong;
	this.tongtien = tongtien;
	this.chuthich = chuthich;
}
public chitiethoahon() {
	
}
public String getMachitiethoadon() {
	return machitiethoadon;
}
public void setMachitiethoadon(String machitiethoadon) {
	this.machitiethoadon = machitiethoadon;
}
public String getMahoadon() {
	return mahoadon;
}
public void setMahoadon(String mahoadon) {
	this.mahoadon = mahoadon;
}
public String getSanpham() {
	return sanpham;
}
public void setSanpham(String sanpham) {
	this.sanpham = sanpham;
}
public int getSoluong() {
	return soluong;
}
public void setSoluong(int soluong) {
	this.soluong = soluong;
}
public int getTongtien() {
	return tongtien;
}
public void setTongtien(int tongtien) {
	this.tongtien = tongtien;
}
public String getChuthich() {
	return chuthich;
}
public void setChuthich(String chuthich) {
	this.chuthich = chuthich;
}


}
