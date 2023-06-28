package model;

public class hoadon {
	private String mahoadon ;
	private String khachhang ;
	private String nhanvien ;
	private String ngaylaphoadon ;
	private String chuthich ;
	private int tongtien ;
	
	
	
   public hoadon(String mahoadon, String khachhang, String nhanvien, String ngaylaphoadon, String chuthich,
			int tongtien) {
		this.mahoadon = mahoadon;
		this.khachhang = khachhang;
		this.nhanvien = nhanvien;
		this.ngaylaphoadon = ngaylaphoadon;
		this.chuthich = chuthich;
		this.tongtien = tongtien;
	}

public hoadon() {
		
	}

public String getMahoadon() {
	return mahoadon;
}

public void setMahoadon(String mahoadon) {
	this.mahoadon = mahoadon;
}

public String getKhachhang() {
	return khachhang;
}

public void setKhachhang(String khachhang) {
	this.khachhang = khachhang;
}

public String getNhanvien() {
	return nhanvien;
}

public void setNhanvien(String nhanvien) {
	this.nhanvien = nhanvien;
}

public String getNgaylaphoadon() {
	return ngaylaphoadon;
}

public void setNgaylaphoadon(String ngaylaphoadon) {
	this.ngaylaphoadon = ngaylaphoadon;
}

public String getChuthich() {
	return chuthich;
}

public void setChuthich(String chuthich) {
	this.chuthich = chuthich;
}

public int getTongtien() {
	return tongtien;
}

public void setTongtien(int tongtien) {
	this.tongtien = tongtien;
}

}
