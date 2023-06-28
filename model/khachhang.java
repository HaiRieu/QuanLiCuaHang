package model;

public class khachhang {
	private String makhachhang ;
	private String tenkhachhang ;
	private String gioitinh ;
	private String diachi ;
	private int sodienthoai ;
	private String loaikhachhang ;
	
	public khachhang () {	
		
	}

	public khachhang(String makhachhang, String tenkhachhang, String gioitinh, String diachi, int sodienthoai,
			String loaikhachhang) {
		this.makhachhang = makhachhang;
		this.tenkhachhang = tenkhachhang;
		this.gioitinh = gioitinh;
		this.diachi = diachi;
		this.sodienthoai = sodienthoai;
		this.loaikhachhang = loaikhachhang;
	}

	public String getMakhachhang() {
		return makhachhang;
	}

	public void setMakhachhang(String makhachhang) {
		this.makhachhang = makhachhang;
	}

	public String getTenkhachhang() {
		return tenkhachhang;
	}

	public void setTenkhachhang(String tenkhachhang) {
		this.tenkhachhang = tenkhachhang;
	}

	public String getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
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

	public String getLoaikhachhang() {
		return loaikhachhang;
	}

	public void setLoaikhachhang(String loaikhachhang) {
		this.loaikhachhang = loaikhachhang;
	}

	
	
	

}
