package model;

public class sanpham {
	private String masanpham ;
	private String tensanpham ;
	private String loaisanpham ;
	private String hangsanxuat ;
	private int gianhap ;
	private int giaban ;
	private int tonkho ;
	private String hinhanh; 
	public sanpham(String masanpham, String tensanpham, String loaisanpham, String hangsanxuat, int gianhap, int giaban,
			int tonkho, String hinhanh) {
	
		this.masanpham = masanpham;
		this.tensanpham = tensanpham;
		this.loaisanpham = loaisanpham;
		this.hangsanxuat = hangsanxuat;
		this.gianhap = gianhap;
		this.giaban = giaban;
		this.tonkho = tonkho;
		this.hinhanh = hinhanh ;
	}
	public sanpham() {
		
	}
	public sanpham(String masanpham, String tensanpham, String hangsanxuat, int giaban,
			int tonkho) {
	
		this.masanpham = masanpham;
		this.tensanpham = tensanpham;
		this.hangsanxuat = hangsanxuat;
		this.giaban = giaban;
		this.tonkho = tonkho;
	
	}
	public String getMasanpham() {
		return masanpham;
	}
	public void setMasanpham(String masanpham) {
		this.masanpham = masanpham;
	}
	public String getTensanpham() {
		return tensanpham;
	}
	public void setTensanpham(String tensanpham) {
		this.tensanpham = tensanpham;
	}
	public String getLoaisanpham() {
		return loaisanpham;
	}
	public void setLoaisanpham(String loaisanpham) {
		this.loaisanpham = loaisanpham;
	}
	public String getHangsanxuat() {
		return hangsanxuat;
	}
	public void setHangsanxuat(String hangsanxuat) {
		this.hangsanxuat = hangsanxuat;
	}
	public int getGianhap() {
		return gianhap;
	}
	public void setGianhap(int gianhap) {
		this.gianhap = gianhap;
	}
	public int getGiaban() {
		return giaban;
	}
	public void setGiaban(int giaban) {
		this.giaban = giaban;
	}
	public int getTonkho() {
		return tonkho;
	}
	public void setTonkho(int tonkho) {
		this.tonkho = tonkho;
	}
	public String getHinhanh() {
		return hinhanh ;
	}
	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh ;
	}

}
