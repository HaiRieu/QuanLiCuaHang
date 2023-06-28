package viewf;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.mkcontroller;
import database.JDBCtiul;
import model.QLNVmodel;
import model.chitiethoahon;
import model.danhsachchitiethoadon;
import model.danhsachhoadon;
import model.danhsachkhachhang;
import model.danhsachnhanvien;
import model.danhsachsanpham;
import model.hoadon;
import model.nhanvien;
import model.sanpham;
import model.khachhang;

import javax.imageio.ImageIO;
import javax.naming.Binding;
import javax.swing.Action;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.Vector;

import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.util.Util;

import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import model.danhsachnhanvien;
import model.danhsachkhachhang;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.io.File;
import java.nio.Buffer;

import javax.swing.JScrollBar;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextArea;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;


public class fromview extends JFrame {
    private danhsachnhanvien danhsachnhanvien ;
    private QLNVmodel qlnVmodel ;
	private JPanel contentPane;
	public JTextField textField_id;
	public JTextField textField_hoten;
	public JTextField textField_luong;
	public JTextField textField_dc;
	public JTable table;
	public JTextField textField_std;
	private JButton jbutton_xoa;
	private JPanel panel_nhanvien;
	private JTextField textField_timkiemnv;
	private JTable table_1;
	private JTextField textField_masp;
	private JTextField textField_tensp;
	private JTextField textField_hangsx;
	private JTextField textField_loaisp;
	private JTextField textField_gianhap;
	private JTextField textField_giaban;
	private JTextField textField_tonkho;
	private JPanel jpanle_sanpham;
	private JTextField textField_timkiemsp;
	private JTable table_2;
	private JTextField textField_makh;
	private JTextField textField_tenkh;
	private JTextField textField_diachikh;
	private JTextField textField_sdtkh;
	private JRadioButton jradio_gioitinhnam;
	private JRadioButton jradio_gioitinhnu;
	private JComboBox jcombo_loaikh;
	private JLabel jlable_minhoa;
	private String pathfile;
	private JTextField jtextfile_anh;
	private JTextField textField_timkiemkh;
	private JTable table_3;
	private JTextField textField_mhd;
	private JTextField textField_ngaylaphd;
	private JTextField textField_tongtien;
	private JTable table_4;
	private JTextField textField_machthd;
	private JTextField textField_mahoad2;
	private JTextField textField_tongtienhd2;
	private JComboBox comboBox_sanphamhd;
	private JComboBox comboBox_khachhanghd;
	private JComboBox comboBox_nhanvienhd;
	private JComboBox jcomboBox_chucvu;
	private JComboBox jcomboBox_chucvu_1;
	private JPanel panle_hoadon;
	private JRadioButton jradio_tktenkh;
	private JRadioButton jradio_tksdtkh;
	private JTextField textField_soluongcthd;
	private JTable table_5;
	private JTextField textField_khdh;
	private JTextField textField_mahddh;
	private JTextField textField_ngaylapdh;
	private JTextField textField_ctdh;
	private JComboBox comboBox_nvdh;
	private JLabel jlable_tongtien;
	private JPanel panel_donhang;
	private JLabel jlable_soluonghd2;
	private JLabel jlable_sanphamdh2;
	private JTextField textField_macthddh;
	
   
	public fromview() {
		this.qlnVmodel = new QLNVmodel() ;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1019, 673);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setLocationRelativeTo(null);
        this.setTitle("Quản Lí Cửa Hàng Linh Kiện Điện Tử");
        this.setSize(1187,700);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Action ac = new mkcontroller(this);
		
		
		JTabbedPane jtabbebpane_fom = new JTabbedPane(JTabbedPane.LEFT);
		jtabbebpane_fom.setFont(new Font("Tahoma", Font.BOLD, 28));
		jtabbebpane_fom.setBounds(0, 0, 1163, 674	);
		contentPane.add(jtabbebpane_fom);
		
		 panel_nhanvien = new JPanel();
		panel_nhanvien.setBackground(new Color(192, 192, 192));
		panel_nhanvien.setToolTipText("");
		jtabbebpane_fom.addTab("Nhân viên", null, panel_nhanvien, null);
		jtabbebpane_fom.setBackgroundAt(0, new Color(128, 128, 255));
		panel_nhanvien.setLayout(null);
		
		JButton jbutton_them = new JButton("Thêm");
		jbutton_them.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(fromview.class.getResource("themicon.png"))));
		jbutton_them.addActionListener(ac);
		jbutton_them.setBounds(407, 416, 118, 36);
		jbutton_them.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_nhanvien.add(jbutton_them);
		
		JButton jbutton_kiemtra = new JButton("Kiểm Tra");
		jbutton_kiemtra.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(fromview.class.getResource("xemicon.png"))));
		jbutton_kiemtra.addActionListener(ac);
		jbutton_kiemtra.setBounds(407, 473, 145, 36);
		jbutton_kiemtra.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_nhanvien.add(jbutton_kiemtra);
		
				
		JLabel jlaybo_hienthids = new JLabel("Danh Sách Nhân Viên");
		jlaybo_hienthids.setFont(new Font("Tahoma", Font.BOLD, 18));
		jlaybo_hienthids.setBounds(10, 10, 271, 27);
		panel_nhanvien.add(jlaybo_hienthids);
		
		JLabel jlable_id = new JLabel("ID");
		jlable_id.setFont(new Font("Tahoma", Font.BOLD, 14));
		jlable_id.setBounds(70, 294, 41, 36);
		panel_nhanvien.add(jlable_id);
		
		JLabel lblNewLabel_1 = new JLabel("Họ Và Tên");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(48, 355, 113, 40);
		panel_nhanvien.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Lương");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(48, 421, 113, 27);
		panel_nhanvien.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Địa chỉ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(48, 471, 113, 40);
		panel_nhanvien.add(lblNewLabel_3);
		
		textField_id = new JTextField();
		textField_id.setBounds(161, 301, 171, 27);
		panel_nhanvien.add(textField_id);
		textField_id.setColumns(10);
		
		textField_hoten = new JTextField();
		textField_hoten.setBounds(161, 364, 171, 27);
		panel_nhanvien.add(textField_hoten);
		textField_hoten.setColumns(10);
		
		textField_luong = new JTextField();
		textField_luong.setBounds(161, 423, 171, 27);
		panel_nhanvien.add(textField_luong);
		textField_luong.setColumns(10);
		
		textField_dc = new JTextField();
		textField_dc.setBounds(161, 480, 171, 27);
		panel_nhanvien.add(textField_dc);
		textField_dc.setColumns(10);
		
		textField_std = new JTextField();
		textField_std.setBounds(161, 535, 171, 27);
		panel_nhanvien.add(textField_std);
		textField_std.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(72, 41, 799, 152);
		panel_nhanvien.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
			},
			new String[] {
				"ID", "H\u1ECD V\u00E0 T\u00EAn", "L\u01B0\u01A1ng", "\u0110\u1ECBa ch\u1EC9 ", "S\u1ED1 \u0110i\u1EC7n Tho\u1EA1i ", "Ch\u1EE9c V\u1EE5 "
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(52);
		table.getColumnModel().getColumn(1).setPreferredWidth(112);
		table.getColumnModel().getColumn(2).setPreferredWidth(89);
		table.getColumnModel().getColumn(3).setPreferredWidth(90);
		table.getColumnModel().getColumn(4).setPreferredWidth(95);
		scrollPane.setViewportView(table);
		
		JButton jbutton_reset = new JButton("resert");
		jbutton_reset.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(fromview.class.getResource("reserticon.png"))));
		jbutton_reset.addActionListener(ac);
		jbutton_reset.setFont(new Font("Tahoma", Font.BOLD, 18));
		jbutton_reset.setBounds(42, 221, 145, 41);
		panel_nhanvien.add(jbutton_reset);
		
		JLabel lblNewLabel = new JLabel("Số Điện Thoại");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(38, 531, 113, 31);
		panel_nhanvien.add(lblNewLabel);
		
		
		 jpanle_sanpham = new JPanel();
		jpanle_sanpham.setBackground(new Color(192, 192, 192));
		jtabbebpane_fom.addTab("Sản Phẩm ", null, jpanle_sanpham, null);
		jtabbebpane_fom.setBackgroundAt(1, new Color(128, 128, 255));
		jpanle_sanpham.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(109, 10, 761, 139);
		jpanle_sanpham.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = (DefaultTableModel) table_1.getModel(); 
				int irow = table_1.getSelectedRow() ;
				String masanpham = model.getValueAt(irow, 0)+"";
				String tensanpham = model.getValueAt(irow, 1)+"";
				String loaisanpham = model.getValueAt(irow, 2)+"";
				String hangsanxuat = model.getValueAt(irow, 3)+"" ;
				int gianhap = Integer.valueOf(model.getValueAt(irow, 4)+"");
				int giaban = Integer.valueOf(model.getValueAt(irow, 5)+"");
				int tonkho = Integer.valueOf(model.getValueAt(irow, 6)+"");
				String hinhanh = model.getValueAt(irow, 7)+"";
				
				sanpham sp = new sanpham(masanpham, tensanpham, loaisanpham, hangsanxuat, gianhap, giaban, tonkho, hinhanh);
				
				textField_masp.setText(sp.getMasanpham());
				textField_tensp.setText(sp.getTensanpham());
				textField_loaisp.setText(sp.getLoaisanpham());
				textField_hangsx.setText(sp.getHangsanxuat());
				textField_gianhap.setText(sp.getGianhap()+"");
				textField_giaban.setText(sp.getGiaban()+"");
				textField_tonkho.setText(sp.getTonkho()+"");
				jtextfile_anh.setText(sp.getHinhanh());
				jlable_minhoa.setIcon(ResizeImage(sp.getHinhanh()));
			
					}
		});
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 S\u1EA3n Ph\u1EA9m", "T\u00EAn S\u1EA3n Ph\u1EA9m", "Lo\u1EA1i S\u1EA3n Ph\u1EA9m", "H\u00E0ng S\u1EA3n Xu\u1EA9t", "Gi\u00E1 Nh\u1EADp ", "Gi\u00E1 B\u00E1n", "T\u1ED3n kho", "Hình Ảnh"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JLabel jlable_masp = new JLabel("Mã Sản Phẩm");
		jlable_masp.setFont(new Font("Tahoma", Font.BOLD, 12));
		jlable_masp.setBounds(62, 226, 90, 23);
		jpanle_sanpham.add(jlable_masp);
		
		JLabel jlable_loaisp = new JLabel("Loại Sản Phẩm");
		jlable_loaisp.setFont(new Font("Tahoma", Font.BOLD, 12));
		jlable_loaisp.setBounds(60, 321, 100, 23);
		jpanle_sanpham.add(jlable_loaisp);
		
		JLabel jlable_hangsp = new JLabel("Hàng Sản Xuất");
		jlable_hangsp.setFont(new Font("Tahoma", Font.BOLD, 12));
		jlable_hangsp.setBounds(60, 371, 108, 23);
		jpanle_sanpham.add(jlable_hangsp);
		
		JLabel jlable_tensp = new JLabel("Tên Sản Phẩm");
		jlable_tensp.setFont(new Font("Tahoma", Font.BOLD, 12));
		jlable_tensp.setBounds(60, 272, 100, 23);
		jpanle_sanpham.add(jlable_tensp);
		
		JLabel jlable_gianhap = new JLabel("Giá Nhập ");
		jlable_gianhap.setFont(new Font("Tahoma", Font.BOLD, 12));
		jlable_gianhap.setBounds(73, 411, 79, 23);
		jpanle_sanpham.add(jlable_gianhap);
		
		JLabel jlable_giaban = new JLabel("Giá Bán");
		jlable_giaban.setFont(new Font("Tahoma", Font.BOLD, 12));
		jlable_giaban.setBounds(73, 463, 79, 13);
		jpanle_sanpham.add(jlable_giaban);
		
		JLabel jlable_tonkho = new JLabel("Tồn Kho");
		jlable_tonkho.setFont(new Font("Tahoma", Font.BOLD, 12));
		jlable_tonkho.setBounds(73, 502, 71, 23);
		jpanle_sanpham.add(jlable_tonkho);
		
		textField_masp = new JTextField();
		textField_masp.setBounds(178, 229, 125, 19);
		jpanle_sanpham.add(textField_masp);
		textField_masp.setColumns(10);
		
		textField_tensp = new JTextField();
		textField_tensp.setBounds(177, 275, 126, 19);
		jpanle_sanpham.add(textField_tensp);
		textField_tensp.setColumns(10);
		
		textField_hangsx = new JTextField();
		textField_hangsx.setBounds(178, 374, 125, 19);
		jpanle_sanpham.add(textField_hangsx);
		textField_hangsx.setColumns(10);
		
		textField_loaisp = new JTextField();
		textField_loaisp.setBounds(178, 324, 125, 19);
		jpanle_sanpham.add(textField_loaisp);
		textField_loaisp.setColumns(10);
		
		textField_gianhap = new JTextField();
		textField_gianhap.setBounds(178, 414, 125, 19);
		jpanle_sanpham.add(textField_gianhap);
		textField_gianhap.setColumns(10);
		
		textField_giaban = new JTextField();
		textField_giaban.setBounds(178, 461, 125, 19);
		jpanle_sanpham.add(textField_giaban);
		textField_giaban.setColumns(10);
		
		textField_tonkho = new JTextField();
		textField_tonkho.setBounds(177, 505, 126, 19);
		jpanle_sanpham.add(textField_tonkho);
		textField_tonkho.setColumns(10);
		
		JButton jbutton_resertsp = new JButton("Ressert ");
		jbutton_resertsp.addActionListener(ac);
		jbutton_resertsp.setFont(new Font("Tahoma", Font.BOLD, 18));
		jbutton_resertsp.setBounds(119, 159, 125, 31);
		jpanle_sanpham.add(jbutton_resertsp);
		
		JButton jbutton_themsp = new JButton("Thêm ");
		jbutton_themsp.addActionListener(ac);
		jbutton_themsp.setFont(new Font("Tahoma", Font.BOLD, 16));
		jbutton_themsp.setBounds(390, 306, 85, 23);
		jpanle_sanpham.add(jbutton_themsp);
		
		JButton jbutton_suasp = new JButton("Sửa ");
		jbutton_suasp.addActionListener(ac);
		jbutton_suasp.setFont(new Font("Tahoma", Font.BOLD, 16));
		jbutton_suasp.setBounds(390, 353, 85, 21);
		jpanle_sanpham.add(jbutton_suasp);
		
		JButton jbutton_xoasp = new JButton("Xóa ");
		jbutton_xoasp.addActionListener(ac);
		jbutton_xoasp.setFont(new Font("Tahoma", Font.BOLD, 16));
		jbutton_xoasp.setBounds(390, 397, 85, 21);
		jpanle_sanpham.add(jbutton_xoasp);
		
		JButton jbutton_ktsp = new JButton("Kiểm Tra ");
		jbutton_ktsp.addActionListener(ac);
		jbutton_ktsp.setFont(new Font("Tahoma", Font.BOLD, 16));
		jbutton_ktsp.setBounds(374, 455, 114, 21);
		jpanle_sanpham.add(jbutton_ktsp);
		
		JButton jbutton_luusp = new JButton("Lưu ");
		jbutton_luusp.addActionListener(ac);
		jbutton_luusp.setFont(new Font("Tahoma", Font.BOLD, 16));
		jbutton_luusp.setBounds(390, 258, 85, 23);
		jpanle_sanpham.add(jbutton_luusp);
		
		JLabel jlable_timkiem = new JLabel("Tìm Kiếm");
		jlable_timkiem.setFont(new Font("Tahoma", Font.BOLD, 16));
		jlable_timkiem.setBounds(705, 478, 90, 19);
		jpanle_sanpham.add(jlable_timkiem);
		
		 jlable_minhoa = new JLabel("");
		jlable_minhoa.setBounds(645, 176, 212, 189);
		jpanle_sanpham.add(jlable_minhoa);
		
		JLabel jlable_hinhmh = new JLabel("Hình minh họa ");
		jlable_hinhmh.setFont(new Font("Tahoma", Font.BOLD, 12));
		jlable_hinhmh.setBounds(708, 376, 100, 13);
		jpanle_sanpham.add(jlable_hinhmh);
		
		textField_timkiemsp = new JTextField();
		textField_timkiemsp.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				danhsachsanpham dssp = new danhsachsanpham() ;
				List<sanpham> laydanhsachsp = dssp.laydanhsachsanpham() ;
				laydanhsachsp.clear();
				Connection con = JDBCtiul.getConnection() ;
				try {
					String sql = "select * from sanpham where tensanpham like N'" + textField_timkiemsp.getText() + "%'" ;
					Statement st = con.createStatement() ;
					ResultSet rs = st.executeQuery(sql);
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
					    laydanhsachsp.add(objSP);
					}
					con.close();
					} catch (Exception e2) {
				 e2.printStackTrace();
				}
				String colTieuDesp[] = new String[]{"Mã Sản Phẩm ", "Tên Sản phẩm", "Loại Sản Phẩm ", "Hàng Sản Xuất ","Giá Nhập ","Giá Bán ","Tồn Kho","Hình Ảnh"};
		        
				   DefaultTableModel model_1 = new DefaultTableModel(colTieuDesp,0) ;
			     	Object[] row ;
				for (sanpham sp : laydanhsachsp) {
					row = new 	Object[8] ;
					row[0] = sp.getMasanpham();
				    row[1] = sp.getTensanpham() ;
				    row[2] = sp.getLoaisanpham() ;
				    row[3] = sp.getHangsanxuat() ;
				    row[4] = sp.getGiaban() ;
				    row[5] = sp.getGianhap() ;
				    row[6] = sp.getTonkho() ;
				    row[7] = sp.getHinhanh();
				model_1.addRow(row);
					
				
		}
				table_1.setModel(model_1);
				
			}
		});
		textField_timkiemsp.setBounds(745, 530, 125, 19);
		jpanle_sanpham.add(textField_timkiemsp);
		textField_timkiemsp.setColumns(10);
		
		JLabel jlable_tensptim = new JLabel("Tên Sản Phẩm ");
		jlable_tensptim.setFont(new Font("Tahoma", Font.BOLD, 14));
		jlable_tensptim.setBounds(615, 529, 108, 16);
		jpanle_sanpham.add(jlable_tensptim);
		
	
		JButton jbutton_brose = new JButton("Browse");
		jbutton_brose.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				JFileChooser filechosel = new JFileChooser() ;
				filechosel.setFileSelectionMode(JFileChooser.FILES_ONLY);
				int returnvaluer = filechosel.showOpenDialog(jpanle_sanpham);
				if(returnvaluer == JFileChooser.APPROVE_OPTION) {
					File file = filechosel.getSelectedFile() ;
					pathfile = file.getAbsolutePath().replace("\\", "/");
				   try {
					  
						jlable_minhoa.setIcon(ResizeImage(String.valueOf(pathfile)) );
						jtextfile_anh.setText(pathfile);
						
					} catch (Exception e2) {
					e2.printStackTrace();
					}
				}		
			}
		});
		jbutton_brose.setFont(new Font("Tahoma", Font.BOLD, 14));
		jbutton_brose.setBounds(718, 411, 90, 21);
		jpanle_sanpham.add(jbutton_brose);
		
		jtextfile_anh = new JTextField();
		jtextfile_anh.setBounds(178, 553, 182, 19);
		jpanle_sanpham.add(jtextfile_anh);
		jtextfile_anh.setColumns(10);
		
		JLabel jlable_duongfile = new JLabel("File ảnh");
		jlable_duongfile.setFont(new Font("Tahoma", Font.BOLD, 13));
		jlable_duongfile.setBounds(73, 553, 71, 16);
		jpanle_sanpham.add(jlable_duongfile);
		
		JPanel jpanel_khachhang = new JPanel();
		jpanel_khachhang.setBackground(new Color(192, 192, 192));
		jtabbebpane_fom.addTab("Khách Hàng", null, jpanel_khachhang, null);
		jtabbebpane_fom.setBackgroundAt(2, new Color(128, 128, 255));
		jpanel_khachhang.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(93, 22, 757, 169);
		jpanel_khachhang.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table_2.getModel(); 
				int irow = table_2.getSelectedRow() ;
				String makhachhang = model.getValueAt(irow, 0)+"";
				String tenkhachhang = model.getValueAt(irow, 1)+"";
				String gioitinh = model.getValueAt(irow, 2)+"";
				String diachi = model.getValueAt(irow, 3)+"" ;
				int sodienthoai = Integer.valueOf(model.getValueAt(irow, 4)+"");
				String loaikhachhang = model.getValueAt(irow, 5)+"" ;
				khachhang kh = new khachhang(makhachhang, tenkhachhang, gioitinh, diachi, sodienthoai, loaikhachhang);
				
				textField_makh.setText(kh.getMakhachhang());
				textField_tenkh.setText(kh.getTenkhachhang());
			    textField_diachikh.setText(kh.getDiachi());
				textField_sdtkh.setText(kh.getSodienthoai()+"");
				if(kh.getGioitinh().equalsIgnoreCase("Nam")) {
					jradio_gioitinhnam.setSelected(true);
					jradio_gioitinhnu.setSelected(false);
				}else {
					jradio_gioitinhnu.setSelected(true);
					jradio_gioitinhnam.setSelected(false);
					
				}
				int i = 0 ;
				while (true) {
					String combo = jcombo_loaikh.getItemAt(i).toString() ;
					if(combo.equalsIgnoreCase(kh.getLoaikhachhang())) {
						jcombo_loaikh.setSelectedIndex(i);
						break ;
					}
				     i++ ;
				
				}
				
			}
		});
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
			},
			new String[] {
				"Mã Khách Hàng", "Tên Khách Hàng ", "Giới Tính", "Địa Chỉ ", "Số Điện Thoại", "Loại khách Hàng"
			}
		));
		scrollPane_2.setViewportView(table_2);
		
		JLabel jlable_makhachhang = new JLabel("Mã Khách Hàng");
		jlable_makhachhang.setFont(new Font("Tahoma", Font.BOLD, 12));
		jlable_makhachhang.setBounds(67, 248, 105, 21);
		jpanel_khachhang.add(jlable_makhachhang);
		
		JLabel jalble_tenkh = new JLabel("Tên Khách Hàng");
		jalble_tenkh.setFont(new Font("Tahoma", Font.BOLD, 12));
		jalble_tenkh.setBounds(67, 299, 105, 21);
		jpanel_khachhang.add(jalble_tenkh);
		
		JLabel jlable_gioittinh = new JLabel("Giới Tính ");
		jlable_gioittinh.setFont(new Font("Tahoma", Font.BOLD, 12));
		jlable_gioittinh.setBounds(67, 359, 67, 13);
		jpanel_khachhang.add(jlable_gioittinh);
		
		JLabel jlable_diachi = new JLabel("Địa Chỉ ");
		jlable_diachi.setFont(new Font("Tahoma", Font.BOLD, 12));
		jlable_diachi.setBounds(67, 423, 52, 15);
		jpanel_khachhang.add(jlable_diachi);
		
		JLabel Jlable_stdkh = new JLabel("Số Điện Thoại ");
		Jlable_stdkh.setFont(new Font("Tahoma", Font.BOLD, 12));
		Jlable_stdkh.setBounds(67, 483, 96, 13);
		jpanel_khachhang.add(Jlable_stdkh);
		
		textField_makh = new JTextField();
		textField_makh.setBounds(217, 250, 96, 19);
		jpanel_khachhang.add(textField_makh);
		textField_makh.setColumns(10);
		
		textField_tenkh = new JTextField();
		textField_tenkh.setBounds(217, 301, 96, 19);
		jpanel_khachhang.add(textField_tenkh);
		textField_tenkh.setColumns(10);
		
		 jradio_gioitinhnam = new JRadioButton("Nam");
		jradio_gioitinhnam.setFont(new Font("Tahoma", Font.BOLD, 12));
		jradio_gioitinhnam.setBounds(176, 355, 61, 21);
		jpanel_khachhang.add(jradio_gioitinhnam);
		
		 jradio_gioitinhnu = new JRadioButton("Nữ");
		jradio_gioitinhnu.setFont(new Font("Tahoma", Font.BOLD, 12));
		jradio_gioitinhnu.setBounds(261, 355, 52, 21);
		jpanel_khachhang.add(jradio_gioitinhnu);
		ButtonGroup buttonGroup = new ButtonGroup() ;
		buttonGroup.add(jradio_gioitinhnam);
		buttonGroup.add(jradio_gioitinhnu);
	
		textField_diachikh = new JTextField();
		textField_diachikh.setBounds(185, 422, 128, 19);
		jpanel_khachhang.add(textField_diachikh);
		textField_diachikh.setColumns(10);
		
		textField_sdtkh = new JTextField();
		textField_sdtkh.setBounds(199, 481, 114, 19);
		jpanel_khachhang.add(textField_sdtkh);
		textField_sdtkh.setColumns(10);
		
		JLabel jlable_loaikh = new JLabel("Loại Khách Hàng");
		jlable_loaikh.setFont(new Font("Tahoma", Font.BOLD, 12));
		jlable_loaikh.setBounds(70, 544, 105, 13);
		jpanel_khachhang.add(jlable_loaikh);
		
		String khachhang[] =  {"Vip","Thường"} ;
		 jcombo_loaikh = new JComboBox(khachhang);
		jcombo_loaikh.setBounds(208, 541, 105, 21);
		jpanel_khachhang.add(jcombo_loaikh);
		
		JButton btnResert = new JButton("Resert   ");
		btnResert.addActionListener(ac);
		btnResert.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnResert.setBounds(741, 217, 104, 21);
		jpanel_khachhang.add(btnResert);
		
		JButton jbutton_themkh = new JButton("Thêm   ");
		jbutton_themkh.addActionListener(ac);
		jbutton_themkh.setFont(new Font("Tahoma", Font.BOLD, 15));
		jbutton_themkh.setBounds(407, 247, 96, 21);
		jpanel_khachhang.add(jbutton_themkh);
		
		JButton jbutton_suakh = new JButton("Sửa  ");
		jbutton_suakh.addActionListener(ac);
		jbutton_suakh.setFont(new Font("Tahoma", Font.BOLD, 16));
		jbutton_suakh.setBounds(407, 298, 85, 21);
		jpanel_khachhang.add(jbutton_suakh);
		
		/*JButton jbuttonn_kiemtrakh = new JButton("Kiểm Tra  ");
		jbuttonn_kiemtrakh.addActionListener(ac);
		jbuttonn_kiemtrakh.setFont(new Font("Tahoma", Font.BOLD, 16));
		jbuttonn_kiemtrakh.setBounds(392, 354, 128, 21);
		jpanel_khachhang.add(jbuttonn_kiemtrakh);*/
		
		JButton jbutton_xoakh = new JButton("Xóa  ");
		jbutton_xoakh.addActionListener(ac);
		jbutton_xoakh.addActionListener(ac);
		jbutton_xoakh.setFont(new Font("Tahoma", Font.BOLD, 16));
		jbutton_xoakh.setBounds(407, 419, 85, 21);
		jpanel_khachhang.add(jbutton_xoakh);
		
		JButton jbutton_luukh = new JButton("Lưu  ");
		jbutton_luukh.addActionListener(ac);
		jbutton_luukh.setFont(new Font("Tahoma", Font.BOLD, 16));
		jbutton_luukh.setBounds(407, 478, 85, 21);
		jpanel_khachhang.add(jbutton_luukh);
		
		JLabel jlable_timkiemkh = new JLabel("Tìm Kiếm");
		jlable_timkiemkh.setFont(new Font("Tahoma", Font.BOLD, 14));
		jlable_timkiemkh.setBounds(687, 298, 114, 21);
		jpanel_khachhang.add(jlable_timkiemkh);
		
		textField_timkiemkh = new JTextField();
		textField_timkiemkh.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				danhsachkhachhang dskh = new danhsachkhachhang() ;
				List<khachhang> laydanhsachkh = dskh.laydanhsachkhachhang() ;
				laydanhsachkh.clear(); 
				Connection con = JDBCtiul.getConnection() ;
				try {
					String tktheo = "" ;
					if(jradio_tktenkh.isSelected()) {
						tktheo = "Theo Tên KH" ;
						String sql = "select * from khachhang where tenkhachhang like N'" + textField_timkiemkh.getText() + "%'" ; 
						Statement st = con.createStatement() ;
						ResultSet rs = st.executeQuery(sql);
						khachhang objKH = null ;
						while (rs.next()) {
							objKH = new khachhang() ; 
						    objKH.setMakhachhang(rs.getString("makhachhang"));
						    objKH.setTenkhachhang(rs.getString("tenkhachhang"));
						    objKH.setGioitinh(rs.getString("gioitinh"));
						    objKH.setDiachi(rs.getString("diachi"));
						    objKH.setSodienthoai(rs.getInt("sodienthoai"));
						    objKH.setLoaikhachhang(rs.getString("loaikhachhang"));
						  	// thêm vào danh sách 
						    laydanhsachkh.add(objKH);
						}
						con.close();
					} else if(jradio_tksdtkh.isSelected()) {
						tktheo = "Theo SĐT" ;
						String sql = "select * from khachhang where sodienthoai like N'" + textField_timkiemkh.getText() + "%'" ; 
						Statement st = con.createStatement() ;
						ResultSet rs = st.executeQuery(sql);
						khachhang objKH = null ;
						while (rs.next()) {
							objKH = new khachhang() ; 
						    objKH.setMakhachhang(rs.getString("makhachhang"));
						    objKH.setTenkhachhang(rs.getString("tenkhachhang"));
						    objKH.setGioitinh(rs.getString("gioitinh"));
						    objKH.setDiachi(rs.getString("diachi"));
						    objKH.setSodienthoai(rs.getInt("sodienthoai"));
						    objKH.setLoaikhachhang(rs.getString("loaikhachhang"));
						  	// thêm vào danh sách 
						    laydanhsachkh.add(objKH);
						}
						con.close();
				}
					 String colTieuDekh[] = new String[]{"Mã Khách Hàng", "Tên Khách Hàng", "Giới Tính ", "Địa Chỉ","Số Điện Thoại  ","Loại Khách Hàng "};
				        
					   DefaultTableModel model_2 = new DefaultTableModel(colTieuDekh,0) ;
				     	Object[] row ;
					for (khachhang kh : laydanhsachkh) {
						row = new 	Object[6] ;
						row[0] = kh.getMakhachhang();
					    row[1] = kh.getTenkhachhang();
					    row[2] = kh.getGioitinh();
					    row[3] = kh.getDiachi();
					    row[4] = kh.getSodienthoai();
					    row[5] = kh.getLoaikhachhang();
					
					model_2.addRow(row);
						
					
				}
					
					table_2.setModel(model_2);
				}
				catch (Exception e2) {
					e2.printStackTrace() ;
					}
						
					}
					
		});
		textField_timkiemkh.setBounds(675, 385, 126, 20);
		jpanel_khachhang.add(textField_timkiemkh);
		textField_timkiemkh.setColumns(10);
		
		 jradio_tktenkh = new JRadioButton("Theo Tên KH");
		jradio_tktenkh.setFont(new Font("Tahoma", Font.BOLD, 12));
		jradio_tktenkh.setBounds(617, 339, 103, 21);
		jpanel_khachhang.add(jradio_tktenkh);
		
		 jradio_tksdtkh = new JRadioButton("Theo SĐT");
		jradio_tksdtkh.setFont(new Font("Tahoma", Font.BOLD, 12));
		jradio_tksdtkh.setBounds(747, 339, 103, 21);
		jpanel_khachhang.add(jradio_tksdtkh);
		 
		ButtonGroup buttonGroup2 = new ButtonGroup() ;
		buttonGroup2.add(jradio_tktenkh);
		buttonGroup2.add(jradio_tksdtkh);
		
		 panle_hoadon = new JPanel();
		panle_hoadon.setBackground(new Color(192, 192, 192));
		jtabbebpane_fom.addTab("Hóa Đơn", null, panle_hoadon, null);
		panle_hoadon.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(30, 29, 481, 236);
		panle_hoadon.add(scrollPane_3);
		
		table_3 = new JTable();
		table_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = (DefaultTableModel) table_3.getModel(); 
				int irow = table_3.getSelectedRow() ;
				String mahoadon = model.getValueAt(irow, 0)+ "" ;
				String khachhang = model.getValueAt(irow, 1) +"" ;
				String nhanvien = model.getValueAt(irow, 2)+"" ; 
				String ngaylaphoadon  = model.getValueAt(irow, 3) +"" ;
				int tongtien = Integer.valueOf(model.getValueAt(irow, 4)+"") ;
				String chuthich = model.getValueAt(irow, 5) +"" ;
			   hoadon hd = new hoadon(mahoadon, khachhang, nhanvien, ngaylaphoadon, chuthich, tongtien);
				
				textField_mhd.setText(hd.getMahoadon());
				textField_ngaylaphd.setText(hd.getNgaylaphoadon());
				textField_tongtien.setText(hd.getTongtien()+"");
	    	   int a = 0 ;
	    	   int b = 0 ;
				while (true) {
					String combokh = comboBox_khachhanghd.getItemAt(a).toString() ;
					if(combokh.equalsIgnoreCase(hd.getKhachhang())) {
						comboBox_khachhanghd.setSelectedIndex(a);
						break ;
						
					}
					 a++ ;
				}
				
				while (true) {
					String combonv = comboBox_nhanvienhd.getItemAt(b).toString() ;
					if(combonv.equalsIgnoreCase(hd.getNhanvien())) {
						comboBox_nhanvienhd.setSelectedIndex(b);
						break ;
					}
					 b++ ;
				    }
			   	danhsachchitiethoadon dscthd = new danhsachchitiethoadon() ;
				List<chitiethoahon> laydanhsachcthd = dscthd.laydanhsachchitiethoadon() ;
				laydanhsachcthd.clear();
				Connection con = JDBCtiul.getConnection() ;
				try {
					Statement st = con.createStatement() ;
					String sql = "select * from chitiethoadon where mahoadon = '" + hd.getMahoadon() +"';" ;
					ResultSet rs = st.executeQuery(sql);
					chitiethoahon objCTHD = null ;
					while (rs.next()) {
						objCTHD = new chitiethoahon() ;
					 objCTHD.setMachitiethoadon(rs.getString("macthd"));
					 objCTHD.setMahoadon(rs.getString("mahoadon"));
					 objCTHD.setSanpham(rs.getString("sanpham"));
					 objCTHD.setSoluong(rs.getInt("soluong"));
					 objCTHD.setTongtien(rs.getInt("tongtien"));
					 objCTHD.setChuthich(rs.getString("chuthich"));
					 laydanhsachcthd.add(objCTHD);
					}
					
				} catch (Exception e2) {
				e2.printStackTrace();
				}
				 String colTieuDe[] = new String[]{"Mã CTHĐ", "Mã Hóa Đơn", "Sản Phẩm", "Số Lượng","Tổng Tiền","Chú Thích" };
			        
				   DefaultTableModel modelcthd = new DefaultTableModel(colTieuDe,0) ;
			     	Object[] row ;
				for (chitiethoahon cthd : laydanhsachcthd) {
					row = new 	Object[6] ;
					row[0] = cthd.getMachitiethoadon();
					row[1] = cthd.getMahoadon();
					row[2] = cthd.getSanpham();
					row[3] = cthd.getSoluong();
					row[4] = cthd.getTongtien();
					row[5] = cthd.getChuthich();
					
					modelcthd.addRow(row);
					
				
			}
				table_4.setModel(modelcthd);
			    
			}
		});
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 H\u00F3a \u0110\u01A1n", "Kh\u00E1ch H\u00E0ng ", "Nh\u00E2n Vi\u00EAn", "Ng\u00E0y L\u1EADp H\u00F3a \u0110\u01A1n ", "T\u1ED5ng Ti\u1EC1n ", "Ch\u00FA Th\u00EDch "
			}
		));
		scrollPane_3.setViewportView(table_3);
		
		JLabel jlable_mahoadon = new JLabel("Mã Hóa Đơn");
		jlable_mahoadon.setFont(new Font("Tahoma", Font.BOLD, 12));
		jlable_mahoadon.setBounds(550, 31, 89, 21);
		panle_hoadon.add(jlable_mahoadon);
		
		JLabel jlable_nhanvienhd = new JLabel("Nhân Viên ");
		jlable_nhanvienhd.setFont(new Font("Tahoma", Font.BOLD, 12));
		jlable_nhanvienhd.setBounds(550, 76, 69, 13);
		panle_hoadon.add(jlable_nhanvienhd);
		
		JLabel jlable_khachhanghd = new JLabel("Khách Hàng");
		jlable_khachhanghd.setFont(new Font("Tahoma", Font.BOLD, 12));
		jlable_khachhanghd.setBounds(550, 119, 80, 13);
		panle_hoadon.add(jlable_khachhanghd);
		
		JLabel jlable_ngaylap = new JLabel("Ngày Lập ");
		jlable_ngaylap.setFont(new Font("Tahoma", Font.BOLD, 12));
		jlable_ngaylap.setBounds(550, 159, 69, 13);
		panle_hoadon.add(jlable_ngaylap);
		
		JLabel jlable_tongtin = new JLabel("Tổng Tiền ");
		jlable_tongtin.setFont(new Font("Tahoma", Font.BOLD, 12));
		jlable_tongtin.setBounds(550, 201, 69, 13);
		panle_hoadon.add(jlable_tongtin);
		
		textField_mhd = new JTextField();
		textField_mhd.setBounds(649, 33, 110, 19);
		panle_hoadon.add(textField_mhd);
		textField_mhd.setColumns(10);
		
		textField_ngaylaphd = new JTextField();
		textField_ngaylaphd.setBounds(649, 157, 110, 19);
		panle_hoadon.add(textField_ngaylaphd);
		textField_ngaylaphd.setColumns(10);
		
		textField_tongtien = new JTextField();
		textField_tongtien.setBounds(649, 199, 110, 19);
		panle_hoadon.add(textField_tongtien);
		textField_tongtien.setColumns(10);
		
		JLabel lblNewLabel_chuthich = new JLabel("Chú Thích");
		lblNewLabel_chuthich.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_chuthich.setBounds(839, 31, 69, 20);
		panle_hoadon.add(lblNewLabel_chuthich);
		
		JTextArea textArea_chuthic1 = new JTextArea();
		textArea_chuthic1.setBounds(800, 61, 149, 153);
		panle_hoadon.add(textArea_chuthic1);
		
		 comboBox_nhanvienhd = new JComboBox();
		ArrayList< String> listnhv = new ArrayList<>() ;
				Connection con2 = JDBCtiul.getConnection() ;
				try {
					String sql2 = "select hoten from nhanvien ;" ;
					Statement st2 = con2.createStatement() ;
					ResultSet rs2 = st2.executeQuery(sql2);
					while(rs2.next()) {
						listnhv.add(rs2.getString("hoten"));
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				for (String item2 : listnhv) {
					comboBox_nhanvienhd.addItem(item2);
		 	}
		
		
		comboBox_nhanvienhd.setBounds(649, 73, 127, 21);
		panle_hoadon.add(comboBox_nhanvienhd);
		
		 comboBox_khachhanghd = new JComboBox();
			ArrayList<String> listkh = new ArrayList<>() ;
    		Connection con1 = JDBCtiul.getConnection() ;
			try {
				String sql = "select tenkhachhang from khachhang ;" ;
				Statement st1 = con1.createStatement() ;
				ResultSet rs1 = st1.executeQuery(sql);
				while(rs1.next()) {
					listkh.add(rs1.getString("tenkhachhang"));
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			for (String item1 : listkh) {
				comboBox_khachhanghd.addItem(item1);
			}
		comboBox_khachhanghd.setBounds(649, 116, 127, 21);
		panle_hoadon.add(comboBox_khachhanghd);
		
		JButton jbutton_themhd = new JButton("Thêm");
		jbutton_themhd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_mhd.setText("");
				textField_ngaylaphd.setText("");
				textField_tongtien.setText("");
				textArea_chuthic1.setText("");
			}
		});
		jbutton_themhd.setFont(new Font("Tahoma", Font.BOLD, 12));
		jbutton_themhd.setBounds(550, 244, 85, 21);
		panle_hoadon.add(jbutton_themhd);
		
		JButton jbutton_suahd = new JButton("Sửa ");
		jbutton_suahd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con = JDBCtiul.getConnection() ;
				try {
					Statement st = con.createStatement() ;
					String sql = "update hoadon set khachhang  = '" + comboBox_khachhanghd.getSelectedItem() +"', nhanvien = '" + comboBox_nhanvienhd.getSelectedItem()+"',ngaylaphoadon ='" + 
					textField_ngaylaphd.getText() + "', tongtien = " + textField_tongtien.getText() +",chuthich = '" + textArea_chuthic1.getText() +"' where mahoadon = '" + textField_mhd.getText() + "';" ; 
				   int check = st.executeUpdate(sql);
				   JOptionPane.showMessageDialog(panle_hoadon, "Bạn Đã Chỉnh Sửa Thành Công");
				} catch (Exception e2) {
				e2.printStackTrace();
				}
				
			}
		});
		jbutton_suahd.setFont(new Font("Tahoma", Font.BOLD, 12));
		jbutton_suahd.setBounds(649, 244, 85, 21);
		panle_hoadon.add(jbutton_suahd);
		
		JButton jbutton_xoahd = new JButton("Xóa ");
		jbutton_xoahd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con = JDBCtiul.getConnection() ;
				try {
					Statement st = con.createStatement() ;
					String sql = "delete from hoadon where mahoadon = '" + textField_mhd.getText() +"';" ;
					String sql1 = "delete from chitiethoadon where mahoadon = '" + textField_mhd.getText() + "'" ;
					if(JOptionPane.showConfirmDialog(panle_hoadon, "Bạn có chắc chắn xóa Hóa Đơn :" + textField_mhd.getText(),"Lựa Chọn",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION ){
		 				int check = st.executeUpdate(sql);
		 				int check1 = st.executeUpdate(sql1);
		 			}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		jbutton_xoahd.setFont(new Font("Tahoma", Font.BOLD, 12));
		jbutton_xoahd.setBounds(762, 244, 85, 21);
		panle_hoadon.add(jbutton_xoahd);
		
		JButton jbutton_luuhd = new JButton("Lưu");
		jbutton_luuhd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con = JDBCtiul.getConnection() ;
				try {
					Statement st = con.createStatement() ;
					String sql = "insert into hoadon values ('" + textField_mhd.getText() +"','" + comboBox_khachhanghd.getSelectedItem() +"','"+comboBox_nhanvienhd.getSelectedItem()+"','"+
					textField_ngaylaphd.getText() + "',"+textField_tongtien.getText() + ",'"+textArea_chuthic1.getText() +"');";
					int check = st.executeUpdate(sql);
					JOptionPane.showMessageDialog(panle_hoadon, "Bạn Đã Thêm Thành Công");
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		jbutton_luuhd.setFont(new Font("Tahoma", Font.BOLD, 12));
		jbutton_luuhd.setBounds(864, 244, 85, 21);
		panle_hoadon.add(jbutton_luuhd);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(30, 351, 481, 226);
		panle_hoadon.add(scrollPane_4);
		
		table_4 = new JTable();
		table_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = (DefaultTableModel) table_4.getModel(); 
				int irow = table_4.getSelectedRow() ;
				String macthd  = model.getValueAt(irow, 0)+ " " ;
				String mahoadon = model.getValueAt(irow, 1) +" " ;
				String sanpham = model.getValueAt(irow, 2)+"";
				int soluong = Integer.valueOf(model.getValueAt(irow, 3)+"") ;
				int tongtien = Integer.valueOf(model.getValueAt(irow, 4)+"") ;
				String chuthich  = model.getValueAt(irow, 5) +"" ;
				chitiethoahon cthd = new chitiethoahon(macthd, mahoadon, sanpham, soluong, tongtien, chuthich);
				
				textField_machthd.setText(cthd.getMachitiethoadon());
				textField_mahoad2.setText(cthd.getMahoadon());
				textField_soluongcthd.setText(cthd.getSoluong()+"");
				textField_tongtienhd2.setText(cthd.getTongtien()+"");
			
				int b = 0 ;
				while (true) {
					String combosp = comboBox_sanphamhd.getItemAt(b).toString() ;
					if(combosp.equalsIgnoreCase(cthd.getSanpham())) {
						comboBox_sanphamhd.setSelectedIndex(b);
						break ;
					}
					 b++ ;
				    }
				
			}
		});
		table_4.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 CTH\u0110", "M\u00E3 H\u00F3a \u0110\u01A1n ", "S\u1EA3n Ph\u1EA9m ", "S\u1ED1 L\u01B0\u1EE3ng ", "T\u1ED5ng Ti\u1EC1n ", "Ch\u00FA Th\u00EDch"
			}
		));
		scrollPane_4.setViewportView(table_4);
		
		JLabel jlable_chitiethd = new JLabel("Bảng Chi Tiết Hóa Đơn");
		jlable_chitiethd.setFont(new Font("Tahoma", Font.BOLD, 14));
		jlable_chitiethd.setBounds(170, 322, 184, 13);
		panle_hoadon.add(jlable_chitiethd);
		
		JLabel jlable_machithd = new JLabel("Mã CTHĐ");
		jlable_machithd.setFont(new Font("Tahoma", Font.BOLD, 12));
		jlable_machithd.setBounds(550, 358, 69, 13);
		panle_hoadon.add(jlable_machithd);
		
		JLabel jlable_mahd2 = new JLabel("Mã Hóa Đơn");
		jlable_mahd2.setFont(new Font("Tahoma", Font.BOLD, 12));
		jlable_mahd2.setBounds(550, 402, 89, 13);
		panle_hoadon.add(jlable_mahd2);
		
		JLabel jlable_sanphamhd = new JLabel("Sản Phẩm ");
		jlable_sanphamhd.setFont(new Font("Tahoma", Font.BOLD, 12));
		jlable_sanphamhd.setBounds(550, 449, 69, 13);
		panle_hoadon.add(jlable_sanphamhd);
		
		JLabel jlable_tongtienhd2 = new JLabel("Tổng Tiền ");
		jlable_tongtienhd2.setFont(new Font("Tahoma", Font.BOLD, 12));
		jlable_tongtienhd2.setBounds(550, 540, 69, 13);
		panle_hoadon.add(jlable_tongtienhd2);
		
		JLabel jlable_chuthich2 = new JLabel("Chú Thích");
		jlable_chuthich2.setFont(new Font("Tahoma", Font.BOLD, 12));
		jlable_chuthich2.setBounds(839, 336, 63, 13);
		panle_hoadon.add(jlable_chuthich2);
		
		textField_machthd = new JTextField();
		textField_machthd.setBounds(649, 355, 110, 19);
		panle_hoadon.add(textField_machthd);
		textField_machthd.setColumns(10);
		
		textField_mahoad2 = new JTextField();
		textField_mahoad2.setBounds(649, 400, 110, 19);
		panle_hoadon.add(textField_mahoad2);
		textField_mahoad2.setColumns(10);
	
		
		 comboBox_sanphamhd = new JComboBox();
		ArrayList<String > list = new ArrayList<>() ;
					Connection con = JDBCtiul.getConnection() ;
					try {
						String sql = "select tensanpham from sanpham ;" ;
						Statement st = con.createStatement() ;
						ResultSet rs = st.executeQuery(sql);
						while(rs.next()) {
							list.add(rs.getString("tensanpham"));
						}
					} catch (Exception e2) {
						e2.printStackTrace();
					}
					for (String item : list) {
						comboBox_sanphamhd.addItem(item);
					}
	    comboBox_sanphamhd.setBounds(649, 446, 127, 21);
		panle_hoadon.add(comboBox_sanphamhd);
		
		textField_tongtienhd2 = new JTextField();
		textField_tongtienhd2.setBounds(649, 538, 110, 19);
		panle_hoadon.add(textField_tongtienhd2);
		textField_tongtienhd2.setColumns(10);
		
		JTextArea textArea_chuthic2 = new JTextArea();
		textArea_chuthic2.setBounds(800, 358, 149, 149);
		panle_hoadon.add(textArea_chuthic2);
		
		JButton jbutton_resert = new JButton("Resert");
		jbutton_resert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				danhsachhoadon dshd = new danhsachhoadon() ;
				List<hoadon> laydanhsachhoadon = dshd.laydanhsachhoadon();
				   String colTieuDe[] = new String[]{"Mã Hóa Đơn", "Khách Hàng", "Nhân Viên", "Ngày Lập HĐ","Tổng Tiền","Chú Thích" };
				        
				   DefaultTableModel model = new DefaultTableModel(colTieuDe,0) ;
			     	Object[] row ;
				for (hoadon hd : laydanhsachhoadon) {
					row = new 	Object[6] ;
					row[0] = hd.getMahoadon();
					row[1] = hd.getKhachhang();
					row[2] = hd.getNhanvien();
					row[3] = hd.getNgaylaphoadon();
					row[4] = hd.getTongtien();
					row[5] = hd.getChuthich();
					
				model.addRow(row);
			}
				table_3.setModel(model);
				
				
			}
		});
		jbutton_resert.setFont(new Font("Tahoma", Font.BOLD, 13));
		jbutton_resert.setBounds(30, 285, 85, 21);
		panle_hoadon.add(jbutton_resert);
		
		JLabel lblNewLabel_4 = new JLabel("Số Lượng ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(550, 494, 69, 13);
		panle_hoadon.add(lblNewLabel_4);
		
		textField_soluongcthd = new JTextField();
		textField_soluongcthd.setBounds(649, 492, 96, 19);
		panle_hoadon.add(textField_soluongcthd);
		textField_soluongcthd.setColumns(10);
		
		JButton jbutton_themcthd = new JButton("Thêm");
		jbutton_themcthd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_machthd.setText("");
				textField_mahoad2.setText("");
				textField_soluongcthd.setText("");
				textField_tongtienhd2.setText("");
			}
		});
		jbutton_themcthd.setFont(new Font("Tahoma", Font.BOLD, 12));
		jbutton_themcthd.setBounds(550, 591, 85, 21);
		panle_hoadon.add(jbutton_themcthd);
		
		JButton jbutton_suacthd = new JButton("Sửa");
		jbutton_suacthd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con = JDBCtiul.getConnection() ;
				try {
					Statement st = con.createStatement() ;
					String sql = "update chitiethoadon set mahoadon = '" + textField_mahoad2.getText() +"', sanpham = '" + comboBox_sanphamhd.getSelectedItem() +"', soluong =" + 
				      textField_soluongcthd.getText() +", tongtien = " + textField_tongtienhd2.getText() +", chuthich = '" + textArea_chuthic2.getText() +"' where macthd = '" + textField_machthd.getText() +"';";
					
					int check = st.executeUpdate(sql);
				System.out.println(1);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		jbutton_suacthd.setFont(new Font("Tahoma", Font.BOLD, 12));
		jbutton_suacthd.setBounds(649, 591, 85, 21);
		panle_hoadon.add(jbutton_suacthd);
		
		JButton jbutton_xoacthd = new JButton("Xóa");
		jbutton_xoacthd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con = JDBCtiul.getConnection();
				try {
					Statement st = con.createStatement();
					String sql = "delete from chitiethoadon where macthd = '" + textField_machthd.getText() + "'" ;
					int check = st.executeUpdate(sql);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		jbutton_xoacthd.setFont(new Font("Tahoma", Font.BOLD, 12));
		jbutton_xoacthd.setBounds(762, 592, 85, 21);
		panle_hoadon.add(jbutton_xoacthd);
		
		JButton jbutton_luucthd = new JButton("Lưu");
		jbutton_luucthd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con = JDBCtiul.getConnection() ;
				try {
					Statement st = con.createStatement();
					String sql = "insert into chitiethoadon values ( '" + textField_machthd.getText() +"' ,'" + textField_mahoad2.getText() +"','" + comboBox_sanphamhd.getSelectedItem()+"'," +
					textField_soluongcthd.getText() +","+ textField_tongtienhd2.getText() + ",'" + textArea_chuthic2.getText() +"');";
					int check = st.executeUpdate(sql);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		jbutton_luucthd.setFont(new Font("Tahoma", Font.BOLD, 12));
		jbutton_luucthd.setBounds(864, 592, 85, 21);
		panle_hoadon.add(jbutton_luucthd);
		jtabbebpane_fom.setBackgroundAt(3, new Color(128, 128, 255));
		
		JButton jbutton_luu = new JButton("Lưu");
		jbutton_luu.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(fromview.class.getResource("luuicon.png"))));
		jbutton_luu.addActionListener(ac);
		jbutton_luu.setBounds(407, 296, 106, 32);
		jbutton_luu.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		 jbutton_xoa = new JButton("Xóa");
		jbutton_xoa.addActionListener(ac);
		jbutton_xoa.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(fromview.class.getResource("xoaicon.png"))));
		jbutton_xoa.setBounds(407, 357, 113, 36);
		jbutton_xoa.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_nhanvien.add(jbutton_xoa);
		panel_nhanvien.add(jbutton_luu);
		
		JButton button_tim = new JButton("Tìm Kiếm");
		button_tim.addActionListener(ac);
		button_tim.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(fromview.class.getResource("timkiemicon.png"))));
		button_tim.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_tim.setBounds(662, 235, 165, 40);
		panel_nhanvien.add(button_tim);
		
		JButton jbutton_chinhsua = new JButton("Chỉnh Sửa");
		jbutton_chinhsua.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(fromview.class.getResource("sua.png"))));
		jbutton_chinhsua.addActionListener(ac);
		jbutton_chinhsua.setFont(new Font("Tahoma", Font.BOLD, 16));
		jbutton_chinhsua.setBounds(407, 545, 171, 36);
		panel_nhanvien.add(jbutton_chinhsua);
		
		textField_timkiemnv = new JTextField();
		textField_timkiemnv.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				danhsachnhanvien dsnv = new danhsachnhanvien() ;
				List<nhanvien> laydanhsach = dsnv.laydanhsach() ;
				laydanhsach.clear();
				Connection con = JDBCtiul.getConnection() ;
				try {
					
					String sql = "select * from nhanvien where hoten like N'"+ textField_timkiemnv.getText() + "%'"  ;
					Statement st = con.createStatement() ;
					ResultSet rs = st.executeQuery(sql);
				
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
					} catch (Exception e2) {
					e2.printStackTrace();
				}
				
				  String colTieuDe[] = new String[]{"ID", "Họ Và Tên", "Lương", "Địa Chỉ","Số Điện Thoại","Chức Vụ" };
			        
				   DefaultTableModel model = new DefaultTableModel(colTieuDe,0) ;
			     	Object[] row ;
				for (nhanvien nv : laydanhsach) {
					row = new 	Object[6] ;
					row[0] = nv.getId();
					row[1] = nv.getHoten();
					row[2] = nv.getLuong();
					row[3] = nv.getDiachi();
					row[4] = nv.getSodienthoai();
					row[5] = nv.getChucvu() ;
				model.addRow(row);
					
				
		}
			table.setModel(model);
		
			}
		});
		textField_timkiemnv.setBounds(629, 390, 196, 27);
		panel_nhanvien.add(textField_timkiemnv);
		textField_timkiemnv.setColumns(10);
		
		String[] chucvu = new String[] {"Bảo Hành","Tiếp Tân","kế Toán","CSKH","Bảo Vệ"};
		 jcomboBox_chucvu = new JComboBox(chucvu);
		jcomboBox_chucvu.setBounds(161, 591, 174, 21);
		panel_nhanvien.add(jcomboBox_chucvu);
		
		JLabel jlable_chucvu = new JLabel("Chức Vụ ");
		jlable_chucvu.setFont(new Font("Tahoma", Font.BOLD, 14));
		jlable_chucvu.setBounds(42, 591, 87, 17);
		panel_nhanvien.add(jlable_chucvu);
		
		String[] chucvu1 = new String[] {"Bảo Hành","Tiếp Tân","kế Toán","CSKH","Bảo Vệ"} ;
		 jcomboBox_chucvu_1 = new JComboBox(chucvu1);
		 jcomboBox_chucvu_1.addItemListener(new ItemListener() {
		 	public void itemStateChanged(ItemEvent e) {
		 		  danhsachnhanvien dsnv = new danhsachnhanvien() ;
		 		  List<nhanvien> laydanhsach = dsnv.laydanhsach() ;
		 		    laydanhsach.clear();
		 				Connection con = JDBCtiul.getConnection() ;
		 				try {
		 					
		 					String sql = "select * from nhanvien where chucvu = '" + jcomboBox_chucvu_1.getSelectedItem() + "';" ; 
		 					Statement st = con.createStatement() ;
		 					ResultSet rs = st.executeQuery(sql);
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
		 				} catch (Exception e2) {
		 					e2.printStackTrace();
		 				}
		 			 String colTieuDe[] = new String[]{"ID", "Họ Và Tên", "Lương", "Địa Chỉ","Số Điện Thoại","Chức Vụ" };
		 			        
		 				   DefaultTableModel model = new DefaultTableModel(colTieuDe,0) ;
		 			     	Object[] row ;
		 				for (nhanvien nv : laydanhsach) {
		 					row = new 	Object[6] ;
		 					row[0] = nv.getId();
		 					row[1] = nv.getHoten();
		 					row[2] = nv.getLuong();
		 					row[3] = nv.getDiachi();
		 					row[4] = nv.getSodienthoai();
		 					row[5] = nv.getChucvu() ;
		 				model.addRow(row);
		 					
		 				
		 		}
		 			table.setModel(model);
		 	}
		 });
		
		jcomboBox_chucvu_1.setBounds(755, 353, 127, 21);
		panel_nhanvien.add(jcomboBox_chucvu_1);
		
		JLabel jlable_tknv = new JLabel("Tên Nhân Viên");
		jlable_tknv.setFont(new Font("Tahoma", Font.BOLD, 14));
		jlable_tknv.setBounds(629, 355, 106, 13);
		panel_nhanvien.add(jlable_tknv);
		
		 panel_donhang = new JPanel();
		panel_donhang.setBackground(new Color(192, 192, 192));
		jtabbebpane_fom.addTab("Đơn Hàng ", null, panel_donhang, null);
		jtabbebpane_fom.setBackgroundAt(4, new Color(128, 128, 255));
		panel_donhang.setLayout(null);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(138, 31, 687, 156);
		panel_donhang.add(scrollPane_5);
		
		table_5 = new JTable();
		table_5.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 S\u1EA3n Ph\u1EA9m ", "T\u00EAn S\u1EA3n Ph\u1EA9m ", "H\u00E3ng S\u1EA3n Xu\u1EA5t ", "Gi\u00E1 B\u00E1n ", "S\u1ED1 L\u01B0\u1EE3ng "
			}
		));
		table_5.getColumnModel().getColumn(0).setPreferredWidth(82);
		scrollPane_5.setViewportView(table_5);
		
		JButton jbutton_taodon = new JButton("Tạo Đơn ");
		jbutton_taodon.addActionListener(ac);
		jbutton_taodon.setFont(new Font("Tahoma", Font.BOLD, 16));
		jbutton_taodon.setBounds(307, 243, 138, 29);
		panel_donhang.add(jbutton_taodon);
		
		JButton jbutton_thanhtoan = new JButton("Thanh Toán ");
		jbutton_thanhtoan.addActionListener(ac);	
		jbutton_thanhtoan.setFont(new Font("Tahoma", Font.BOLD, 16));
		jbutton_thanhtoan.setBounds(508, 243, 138, 29);
		panel_donhang.add(jbutton_thanhtoan);
		
		 jlable_tongtien = new JLabel("0");
		jlable_tongtien.setFont(new Font("Tahoma", Font.BOLD, 13));
		jlable_tongtien.setBounds(128, 502, 75, 23);
		panel_donhang.add(jlable_tongtien);
		
		JLabel jlablemahoadonh = new JLabel("Mã HĐ");
		jlablemahoadonh.setFont(new Font("Tahoma", Font.BOLD, 12));
		jlablemahoadonh.setBounds(51, 311, 55, 23);
		panel_donhang.add(jlablemahoadonh);
		
		JLabel jlable_khdh = new JLabel("Khách Hàng ");
		jlable_khdh.setFont(new Font("Tahoma", Font.BOLD, 13));
		jlable_khdh.setBounds(33, 357, 96, 23);
		panel_donhang.add(jlable_khdh);
		
		JLabel jlable_nvdh = new JLabel("Nhân Viên ");
		jlable_nvdh.setFont(new Font("Tahoma", Font.BOLD, 13));
		jlable_nvdh.setBounds(33, 406, 86, 13);
		panel_donhang.add(jlable_nvdh);
		
		JLabel jlable_nlhddh = new JLabel("Ngày Lập ");
		jlable_nlhddh.setFont(new Font("Tahoma", Font.BOLD, 12));
		jlable_nlhddh.setBounds(33, 449, 75, 23);
		panel_donhang.add(jlable_nlhddh);
		
		JLabel jlable_tongtiendh = new JLabel("Thành Tiền ");
		jlable_tongtiendh.setFont(new Font("Tahoma", Font.BOLD, 12));
		jlable_tongtiendh.setForeground(new Color(0, 0, 0));
		jlable_tongtiendh.setBounds(33, 498, 75, 31);
		panel_donhang.add(jlable_tongtiendh);
		
		JLabel jlable_chuthichdh = new JLabel("Chú Thích ");
		jlable_chuthichdh.setFont(new Font("Tahoma", Font.BOLD, 12));
		jlable_chuthichdh.setBounds(33, 550, 70, 23);
		panel_donhang.add(jlable_chuthichdh);
		
		 comboBox_nvdh = new JComboBox();
		ArrayList< String> listnhv2 = new ArrayList<>() ;
		Connection con2nv = JDBCtiul.getConnection() ;
		try {
			String sql2nv = "select hoten from nhanvien ;" ;
			Statement st2nv = con2.createStatement() ;
			ResultSet rs2nv = st2nv.executeQuery(sql2nv);
			while(rs2nv.next()) {
				listnhv2.add(rs2nv.getString("hoten"));
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		for (String item2nv : listnhv2) {
			comboBox_nvdh.addItem(item2nv);
 	}
		comboBox_nvdh.setBounds(128, 403, 116, 21);
		panel_donhang.add(comboBox_nvdh);
		
		textField_khdh = new JTextField();
		textField_khdh.setBounds(128, 360, 116, 19);
		panel_donhang.add(textField_khdh);
		textField_khdh.setColumns(10);
		
		textField_mahddh = new JTextField();
		textField_mahddh.setBounds(127, 314, 117, 19);
		panel_donhang.add(textField_mahddh);
		textField_mahddh.setColumns(10);
		
		textField_ngaylapdh = new JTextField();
		textField_ngaylapdh.setBounds(127, 452, 117, 19);
		panel_donhang.add(textField_ngaylapdh);
		textField_ngaylapdh.setColumns(10);
		
		textField_ctdh = new JTextField();
		textField_ctdh.setBounds(128, 553, 118, 19);
		panel_donhang.add(textField_ctdh);
		textField_ctdh.setColumns(10);
		
		JButton jbutton_resertdh = new JButton("Resert");
		jbutton_resertdh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				danhsachsanpham dssp = new danhsachsanpham() ;
				List<sanpham> laydanhsachsp = dssp.laydanhsachsanpham() ;
				   String colTieuDesp[] = new String[]{"Mã Sản Phẩm ", "Tên Sản phẩm", "Loại Sản Phẩm ","Giá Bán ","Tồn Kho"};
				        
				   DefaultTableModel model_1 = new DefaultTableModel(colTieuDesp,0) ;
			     	Object[] row ;
				for (sanpham sp : laydanhsachsp) {
					row = new 	Object[8] ;
					row[0] = sp.getMasanpham();
				    row[1] = sp.getTensanpham() ;
				    row[2] = sp.getHangsanxuat() ;
				    row[3] = sp.getGiaban() ;
				    row[4] = sp.getTonkho() ;
				model_1.addRow(row);
					
				
		}
				table_5.setModel(model_1);
				
			}
		});
		jbutton_resertdh.setFont(new Font("Tahoma", Font.BOLD, 16));
		jbutton_resertdh.setBounds(707, 243, 112, 29);
		panel_donhang.add(jbutton_resertdh);
		
		JLabel lblNewLabel_5 = new JLabel("đ");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(229, 507, 14, 13);
		panel_donhang.add(lblNewLabel_5);
		
		JLabel jlable_macthddh = new JLabel("Mã CTHĐ");
		jlable_macthddh.setFont(new Font("Tahoma", Font.BOLD, 13));
		jlable_macthddh.setBounds(297, 317, 80, 17);
		panel_donhang.add(jlable_macthddh);
		
		textField_macthddh = new JTextField();
		textField_macthddh.setBounds(403, 314, 116, 19);
		panel_donhang.add(textField_macthddh);
		textField_macthddh.setColumns(10);
		
		JLabel jlable_soluonghd = new JLabel("Số Lượng ");
		jlable_soluonghd.setFont(new Font("Tahoma", Font.BOLD, 13));
		jlable_soluonghd.setBounds(297, 360, 77, 17);
		panel_donhang.add(jlable_soluonghd);
		
		 jlable_soluonghd2 = new JLabel("0");
		jlable_soluonghd2.setFont(new Font("Tahoma", Font.BOLD, 13));
		jlable_soluonghd2.setBounds(419, 363, 64, 17);
		panel_donhang.add(jlable_soluonghd2);
		
		JLabel jlable_sanphamdh = new JLabel("Sản Phẩm");
		jlable_sanphamdh.setFont(new Font("Tahoma", Font.BOLD, 13));
		jlable_sanphamdh.setBounds(297, 401, 70, 18);
		panel_donhang.add(jlable_sanphamdh);
		
		 jlable_sanphamdh2 = new JLabel("Chưa Chọn ");
		 jlable_sanphamdh2.setBackground(new Color(192, 192, 192));
		jlable_sanphamdh2.setFont(new Font("Tahoma", Font.BOLD, 13));
		jlable_sanphamdh2.setBounds(403, 401, 80, 18);
		panel_donhang.add(jlable_sanphamdh2);
		
		this.setVisible(true);
	}

	public void hienthidanhsachsinhvien() {
		danhsachnhanvien dsnv = new danhsachnhanvien() ;
		List<nhanvien> laydanhsach = dsnv.laydanhsach() ;
		   String colTieuDe[] = new String[]{"ID", "Họ Và Tên", "Lương", "Địa Chỉ","Số Điện Thoại","Chức Vụ" };
		        
		   DefaultTableModel model = new DefaultTableModel(colTieuDe,0) ;
	     	Object[] row ;
		for (nhanvien nv : laydanhsach) {
			row = new 	Object[6] ;
			row[0] = nv.getId();
			row[1] = nv.getHoten();
			row[2] = nv.getLuong();
			row[3] = nv.getDiachi();
			row[4] = nv.getSodienthoai();
			row[5] = nv.getChucvu();
			
		model.addRow(row);
			
		
}
		this.table.setModel(model);
	}

	public void xoanhungdanhmuc() {
	      this.textField_id.setText("");
	      this.textField_hoten.setText("");
	      this.textField_luong.setText("");
	      this.textField_dc.setText("");
	      this.textField_std.setText("");
	  }
	
	public void themnhanvienvaobang(nhanvien nv) {
		DefaultTableModel model = (DefaultTableModel) table.getModel() ;
		model.addRow(new Object[] {nv.getId() , nv.getHoten(),nv.getLuong()+"" , nv.getDiachi() , nv.getSodienthoai()+""});
	}
	public void themhoaluunhanvien (nhanvien nv) {
		DefaultTableModel model = (DefaultTableModel) table.getModel() ;
		if(!this.qlnVmodel.kiemtratontai(nv)) {
			this.qlnVmodel.insert(nv);
			this.themnhanvienvaobang(nv);
		} else  {
			this.qlnVmodel.update(nv);
			int soluong = model.getRowCount() ;
			for (int i = 0; i < soluong; i++) {
				String id = model.getValueAt(i, 0) + "" ;
				if(id.equals(nv.getId())) {
					model.setValueAt(nv.getHoten(), i, 1);
					model.setValueAt(nv.getLuong()+"", i, 2);
					model.setValueAt(nv.getDiachi(), i, 3);
					model.setValueAt(nv.getSodienthoai()+"", i, 4);
					model.setValueAt(nv.getChucvu(), i, 5);
					
				}
			}
			
		}
		
	}
	/*public nhanvien chonnhanvien() {
		DefaultTableModel model = (DefaultTableModel) table.getModel(); 
		int irow = table.getSelectedRow() ;
		String id = model.getValueAt(irow, 0)+ " " ;
		String hoten = model.getValueAt(irow, 1) +" " ;
		int luong = Integer.valueOf(model.getValueAt(irow, 2)+"") ;
		String diachi = model.getValueAt(irow, 3) +"" ;
		int sodienthoai = Integer.valueOf(model.getValueAt(irow, 4)+"") ;
		String chucvu = model.getValueAt(irow, 5) +"" ;
		nhanvien nv = new nhanvien(id, hoten, luong, diachi, sodienthoai, chucvu);
		return nv ;
	}*/

	public void luunhanvien() {
     Connection con = JDBCtiul.getConnection() ;
     try {
    	 Statement st = con.createStatement() ;
    	 String sql = "insert into nhanvien values ('" + textField_id.getText() + "', '" + textField_hoten.getText() +"'," + textField_luong.getText() + ",'"+
     textField_dc.getText() + "'," + textField_std.getText() +",'" + jcomboBox_chucvu.getSelectedItem() + "');" ; 
    	
    	 int check = st.executeUpdate(sql);
    	
	} catch (Exception e) {
		   
		e.printStackTrace();
	}
     JOptionPane.showMessageDialog(panel_nhanvien, "Bạn Lưu Thành Công");
    
    }

	public void xoanhanvien() {
		Connection con = JDBCtiul.getConnection() ;
 		try {
 			Statement st = con.createStatement() ;
 			String sql = "delete from nhanvien where id = '" + textField_id.getText() + "';" ;
 			
 			if(JOptionPane.showConfirmDialog(panel_nhanvien, "Bạn có chắc chắn xóa nhân viên :" + textField_id.getText(),"Lựa Chọn",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION ){
 				int check = st.executeUpdate(sql);
 			}
 			
 			} catch (Exception e2) {
			e2.printStackTrace();
		}
 		
		
	}

	public void kiemtra() {
		DefaultTableModel model = (DefaultTableModel) table.getModel(); 
		int irow = table.getSelectedRow() ;
		String id = model.getValueAt(irow, 0)+ " " ;
		String hoten = model.getValueAt(irow, 1) +" " ;
		int luong = Integer.valueOf(model.getValueAt(irow, 2)+"") ;
		String diachi = model.getValueAt(irow, 3) +"" ;
		int sodienthoai = Integer.valueOf(model.getValueAt(irow, 4)+"") ;
		String chucvu = model.getValueAt(irow, 5) +"" ;
		nhanvien nv = new nhanvien(id, hoten, luong, diachi, sodienthoai, chucvu);
		
		
	   this.textField_id.setText(nv.getId());
	   this.textField_hoten.setText(nv.getHoten());
	   this.textField_luong.setText(nv.getLuong() +"");
	   this.textField_dc.setText(nv.getDiachi());
	   this.textField_std.setText(nv.getSodienthoai()+"");
	   
	   int a = 0 ;
		while (true) {
			String combo1 = jcomboBox_chucvu.getItemAt(a).toString() ;
			if(combo1.equalsIgnoreCase(nv.getChucvu())) {
				jcomboBox_chucvu.setSelectedIndex(a);
				break ;
			}
			 a++ ;
		    
	   
		}
		
	}

	public void chinhsuanhanvien() {
	Connection con = JDBCtiul.getConnection() ;
	try {
		Statement st = con.createStatement() ;
		String sql = "update nhanvien set " + " hoten = '" + textField_hoten.getText() + "'," +
		"luong = "+ textField_luong.getText() + ", diachi = '" +textField_dc.getText() + "'," + "sodienthoai = " +
	  textField_std.getText() +",chucvu = '"+ jcomboBox_chucvu.getSelectedItem() +"'"+ " where id = '" + textField_id.getText() + "';";
		JOptionPane.showMessageDialog(panel_nhanvien, "Bạn đã chỉnh sửa thành công");
		int check = st.executeUpdate(sql);
	
	} catch (Exception e) {
		e.printStackTrace();
	}
	System.out.println(1);
	}

	public void hienthidanhsachsanpham() {
			danhsachsanpham dssp = new danhsachsanpham() ;
			List<sanpham> laydanhsachsp = dssp.laydanhsachsanpham() ;
			   String colTieuDesp[] = new String[]{"Mã Sản Phẩm ", "Tên Sản phẩm", "Loại Sản Phẩm ", "Hàng Sản Xuất ","Giá Nhập ","Giá Bán ","Tồn Kho","Hình Ảnh"};
			        
			   DefaultTableModel model_1 = new DefaultTableModel(colTieuDesp,0) ;
		     	Object[] row ;
			for (sanpham sp : laydanhsachsp) {
				row = new 	Object[8] ;
				row[0] = sp.getMasanpham();
			    row[1] = sp.getTensanpham() ;
			    row[2] = sp.getLoaisanpham() ;
			    row[3] = sp.getHangsanxuat() ;
			    row[4] = sp.getGianhap() ;
			    row[5] = sp.getGiaban() ;
			    row[6] = sp.getTonkho() ;
			    row[7] = sp.getHinhanh();
			model_1.addRow(row);
				
			
	}
			this.table_1.setModel(model_1);
		System.out.println(1);
	}

	public void Luusanpham() {
		Connection con = JDBCtiul.getConnection() ;
		try {
			Statement st = con.createStatement() ;
			String sql = "insert into sanpham values ( '"+ textField_masp.getText() + "','"+textField_tensp.getText() + "','"+textField_loaisp.getText() +"','"+textField_hangsx.getText() + "',"
					            + textField_gianhap.getText() + ","+ textField_giaban.getText() + ","+ textField_tonkho.getText() +",'" + jtextfile_anh.getText()+ "')";
			int check = st.executeUpdate(sql);
			JOptionPane.showMessageDialog(jpanle_sanpham, "Bạn lưu thành công");
			
		} catch (Exception e) {
			e.printStackTrace(); 
		}
		
	}

	public void themsanpham() {
		this.textField_masp.setText("");
		this.textField_tensp.setText("");
		this.textField_loaisp.setText("");
		this.textField_hangsx.setText("");
		this.textField_gianhap.setText("");
		this.textField_giaban.setText("");
		this.textField_tonkho.setText("");
		this.jtextfile_anh.setText("");
		
	}
	public sanpham chonsanpham() {
		DefaultTableModel model = (DefaultTableModel) table_1.getModel(); 
		int irow = table_1.getSelectedRow() ;
		String masanpham = model.getValueAt(irow, 0)+"";
		String tensanpham = model.getValueAt(irow, 1)+"";
		String loaisanpham = model.getValueAt(irow, 2)+"";
		String hangsanxuat = model.getValueAt(irow, 3)+"" ;
		int gianhap = Integer.valueOf(model.getValueAt(irow, 4)+"");
		int giaban = Integer.valueOf(model.getValueAt(irow, 5)+"");
		int tonkho = Integer.valueOf(model.getValueAt(irow, 6)+"");
		String hinhanh = model.getValueAt(irow, 7)+"";
		
		sanpham sp = new sanpham(masanpham, tensanpham, loaisanpham, hangsanxuat, gianhap, giaban, tonkho, hinhanh);
		return sp ; 
	}
	public void kiemtrasanpham() {
		sanpham sp =  chonsanpham() ;
		this.textField_masp.setText(sp.getMasanpham());
		this.textField_tensp.setText(sp.getTensanpham());
		this.textField_loaisp.setText(sp.getLoaisanpham());
		this.textField_hangsx.setText(sp.getHangsanxuat());
		this.textField_gianhap.setText(sp.getGianhap()+"");
		this.textField_giaban.setText(sp.getGiaban()+"");
		this.textField_tonkho.setText(sp.getTonkho()+"");
		this.jtextfile_anh.setText(sp.getHinhanh());
		jlable_minhoa.setIcon(ResizeImage(sp.getHinhanh()));
	
	
		System.out.println(1);
	}

	public void suasanpham() {
		Connection con  = JDBCtiul.getConnection() ;
		try {
			Statement st = con.createStatement() ;
			String sql = "update sanpham set " + "tensanpham = '" + textField_tensp.getText() + "',loaisanpham = '" + 
			textField_loaisp.getText() + "', hangsanxuat = '" + textField_hangsx.getText() + "', gianhap = " + textField_gianhap.getText() + ", giaban = " 
			 + textField_giaban.getText() + ", tonkho = " + textField_tonkho.getText() +", hinhanh ='"+ jtextfile_anh.getText()+"'" +" where masanpham = '" + textField_masp.getText() +"' ;" ;
			int check = st.executeUpdate(sql);
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void xoasanpham() {
		Connection con = JDBCtiul.getConnection() ; 
		try {
			Statement st = con.createStatement() ;
			String sql = "delete from sanpham where masanpham = '" + textField_masp.getText() + "';"; 
			if(JOptionPane.showConfirmDialog(jpanle_sanpham, "Bạn Có Chắc Chắn Xóa Sản Phẩm :" + textField_masp.getText(),"Lựa Chọn",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION ){
 				int check = st.executeUpdate(sql);
 			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}



public void hienthidanhsachkhachhang() {
	danhsachkhachhang dskh = new danhsachkhachhang() ;
	List<khachhang> laydanhsachkh = dskh.laydanhsachkhachhang() ;
	   String colTieuDekh[] = new String[]{"Mã Khách Hàng", "Tên Khách Hàng", "Giới Tính ", "Địa Chỉ","Số Điện Thoại  ","Loại Khách Hàng "};
	        
	   DefaultTableModel model_2 = new DefaultTableModel(colTieuDekh,0) ;
     	Object[] row ;
	for (khachhang kh : laydanhsachkh) {
		row = new 	Object[6] ;
		row[0] = kh.getMakhachhang();
	    row[1] = kh.getTenkhachhang();
	    row[2] = kh.getGioitinh();
	    row[3] = kh.getDiachi();
	    row[4] = kh.getSodienthoai();
	    row[5] = kh.getLoaikhachhang();
	
	model_2.addRow(row);
		
	
}
	this.table_2.setModel(model_2);
	
}

public void themkhachhang() {
	this.textField_makh.setText("");
	this.textField_tenkh.setText("");
	this.textField_diachikh.setText("");
	this.textField_sdtkh.setText("");
	
	
}

public void luukhachhang() {
String gioitinh = "" ;
if(jradio_gioitinhnam.isSelected()) {
	gioitinh = "Nam" ;
}else if(jradio_gioitinhnu.isSelected()) {
	gioitinh = "Nữ" ; 
}
Connection con = JDBCtiul.getConnection() ;
try {
	Statement st = con.createStatement() ;
	String sql = "insert into khachhang values ('" + textField_makh.getText() + "','"+textField_tenkh.getText()+"','"+ gioitinh + "','" + textField_diachikh.getText()+"'," 
	+ textField_sdtkh.getText()+",'" + jcombo_loaikh.getSelectedItem() + "');";
	int check = st.executeUpdate(sql);
			
} catch (Exception e) {
	e.printStackTrace();
}
	
}

public void xoakhachhang() {
	
	Connection con = JDBCtiul.getConnection() ;
	try {
		Statement st = con.createStatement() ;
		String sql = "delete from khachhang where makhachhang = '" + textField_makh.getText() + "';" ;
		int check = st.executeUpdate(sql);
	} catch (Exception e) {
		e.printStackTrace(); 
	}
	
}

public void suakhachhang() {
	String gioitinh = "" ;
	if(jradio_gioitinhnam.isSelected()) {
		gioitinh = "Nam" ;
	}else if(jradio_gioitinhnu.isSelected()) {
		gioitinh = "Nữ" ; 
	}
	Connection con = JDBCtiul.getConnection() ;
	try {
		Statement st = con.createStatement() ;
		String sql = "update khachhang set" + " tenkhachhang = '" + textField_tenkh.getText() +"', gioitinh = '" + gioitinh +"', diachi = '" + textField_diachikh.getText()+"',sodienthoai = "
				+ textField_sdtkh.getText() +", loaikhachhang = '"+ jcombo_loaikh.getSelectedItem()+ "' where makhachhang = '"+ textField_makh.getText() +"' ;" ;
		int check = st.executeUpdate(sql);
		con.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}

public ImageIcon ResizeImage (String ImmagePath) {
	ImageIcon myimage = new ImageIcon(ImmagePath) ;
	Image img = myimage.getImage() ;
	Image newImg = img.getScaledInstance(jlable_minhoa.getWidth(), jlable_minhoa.getHeight(), Image.SCALE_SMOOTH);
	ImageIcon  image = new ImageIcon(newImg) ;
	return image ;
}
public sanpham chonsanphamdh() {
	DefaultTableModel model = (DefaultTableModel) table_5.getModel(); 
	int irow = table_5.getSelectedRow() ;
	String masanpham = model.getValueAt(irow, 0)+"";
	String tensanpham = model.getValueAt(irow, 1)+"";
	String hangsanxuat = model.getValueAt(irow, 2)+"" ;
	int giaban = Integer.valueOf(model.getValueAt(irow, 3)+"");
	int tonkho = Integer.valueOf(model.getValueAt(irow, 4)+"");
	sanpham sp2 = new sanpham(masanpham, tensanpham, hangsanxuat, giaban, tonkho);
	
	return sp2 ; 
}



int a = 1 ; 
int so = 1 ;
public void taodondh() {
 
  sanpham sp2 =  chonsanphamdh() ;

  textField_mahddh.setText("HĐ"+ so++); 
   textField_macthddh.setText("CTHĐ" + a++);
   jlable_sanphamdh2.setText(sp2.getTensanpham());
	String m = JOptionPane.showInputDialog("chọn số lượng ") ; 
	if(Integer.valueOf(m) > sp2.getTonkho()) {
		JOptionPane.showMessageDialog(panel_donhang, "Số Lượng Hàng Không Đủ Đáp Ứng");
		jlable_soluonghd2.setText("0");
		jlable_tongtien.setText("0");
	}
	for (int i = Integer.valueOf(m); i <= sp2.getTonkho(); i++) {
		 
			 if(Integer.valueOf(m) == i ) {
				jlable_tongtien.setText((sp2.getGiaban()*i)+"");
				jlable_soluonghd2.setText(m);
			}
			 }
	
		}

public void thanhtoandonhang() {
	Connection con = JDBCtiul.getConnection() ;
	try {
		sanpham sp = chonsanphamdh();
		Statement st = con.createStatement() ;
		int c = Integer.valueOf(sp.getTonkho()+"") - Integer.valueOf(jlable_soluonghd2.getText()) ; 
		String sql = "insert into hoadon values ('" + textField_mahddh.getText() +"','"+textField_khdh.getText()+"','"+ comboBox_nvdh.getSelectedItem()+"','"+
		textField_ngaylapdh.getText() + "',"+ jlable_tongtien.getText() + ",'"+textField_ctdh.getText() +"');";
		String sql1 = "insert into chitiethoadon values ( '" + textField_macthddh.getText() +"' ,'" + textField_mahddh.getText() +"','" + jlable_sanphamdh2.getText()+"'," +
				jlable_soluonghd2.getText() +","+ jlable_tongtien.getText() + ",'" + textField_ctdh.getText() +"');";
		String sql2 = "update sanpham set " + " tonkho = " + c +" where masanpham = '" +sp.getMasanpham() +"';" ;
		int check = st.executeUpdate(sql);
		int check1 = st.executeUpdate(sql1);
		int check2 = st.executeUpdate(sql2);
	
		System.out.println(c);
		JOptionPane.showMessageDialog(panel_donhang, "Bạn Đã Thanh Toán Xong");
	} catch (Exception e2) {
		e2.printStackTrace();
	}
	
}
}
