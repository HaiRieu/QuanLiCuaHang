package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Action;
import javax.swing.JOptionPane;

import view.mkview;
import viewf.fromview;

public class mkcontroller implements Action{
     private mkview mkview ;
     private fromview fromview ;
     
     public mkcontroller(mkview mkview) {
    	 this.mkview = mkview ;
    	
     }
     public mkcontroller(fromview fromview) {
    	 this.fromview = fromview ;
     }

	public void actionPerformed(ActionEvent e) {
	String srl = e.getActionCommand() ;
	if(srl.equals("Login")) {
		this.mkview.dangnhaptk() ;
	}else if(srl.equals("Canced")) {
	System.exit(0);
	}else if(srl.equals("Thêm")) {
		this.fromview.xoanhungdanhmuc() ;
	}else if(srl.equals("Xóa")) {
		this.fromview.xoanhanvien() ;
	    }else if (srl.equals("resert")) {
	    	this.fromview.hienthidanhsachsinhvien();
	   }else if(srl.equals("Lưu")) {
	    	this.fromview.luunhanvien();
	    }else if (srl.equals("Kiểm Tra")) {
	    	this.fromview.kiemtra() ;
	    }else if(srl.equals("Chỉnh Sửa")) {
	    	this.fromview.chinhsuanhanvien();
	    }else if(srl.equals("Ressert ")) {
	    	this.fromview.hienthidanhsachsanpham() ;
	    }else if(srl.equals("Lưu ")) {
	    	this.fromview.Luusanpham(); 
	    }else if(srl.equals("Thêm ")) {
	    	this.fromview.themsanpham() ;
	    }else if(srl.equals("Kiểm Tra ")) {
	    	this.fromview.kiemtrasanpham() ;
	    }else if(srl.equals("Sửa ")) {
	    	this.fromview.suasanpham() ;
	    }else if(srl.equals("Xóa ")) {
	    	this.fromview.xoasanpham() ; 
	    }else if(srl.equals("Resert   ")) {
	    	this.fromview.hienthidanhsachkhachhang() ;
	    }else if(srl.equals("Thêm   ")) {
	    	this.fromview.themkhachhang();
	    }else if(srl.equals("Lưu  ")) {
	    	this.fromview.luukhachhang() ;
	    }else if(srl.equals("Xóa  ")) {
	    	this.fromview.xoakhachhang() ;
	    }else if(srl.equals("Sửa  ")) {
	    	this.fromview.suakhachhang() ;
	    }else if(srl.equals("Tạo Đơn ")) {
	    	this.fromview.taodondh() ;
	    }else if(srl.equals("Thanh Toán ")) {
	    	this.fromview.thanhtoandonhang();
	    }
	
	}
	
public Object getValue(String key) {
	
		return null;
	}

	@Override
	public void putValue(String key, Object value) {
	
		
	}

	@Override
	public void setEnabled(boolean b) {
	
		
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	

}
