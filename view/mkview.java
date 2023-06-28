package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.xdevapi.Result;

import controller.mkcontroller;
import viewf.fromview;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class mkview extends JFrame {
   
	public JPanel contentPane;
	public JTextField jtextfil_user;
	public JPasswordField passwordField;
	public JButton jbutton_login;
	private JCheckBox jchcekbok_showmk;
	private JComboBox<String> comboBox;


	public mkview() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 648, 455);
		this.setLocationRelativeTo(null);
		this.setTitle("Đăng Nhập");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Action ac = new mkcontroller(this);
		
		JLabel jlable_user = new JLabel("user");
		jlable_user.setFont(new Font("Tahoma", Font.BOLD, 18));
		jlable_user.setBounds(246, 129, 76, 39);
		contentPane.add(jlable_user);
		
		jtextfil_user = new JTextField();
		jtextfil_user.setFont(new Font("Tahoma", Font.BOLD, 14));
		jtextfil_user.setBounds(353, 135, 178, 29);
		contentPane.add(jtextfil_user);
		jtextfil_user.setColumns(10);
		
		JLabel jlable_pass = new JLabel("Passwork");
		jlable_pass.setFont(new Font("Tahoma", Font.BOLD, 18));
		jlable_pass.setBounds(246, 205, 90, 29);
		contentPane.add(jlable_pass);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 14));
		passwordField.setBounds(353, 205, 178, 31);
		contentPane.add(passwordField);
		
		 jbutton_login = new JButton("Login");
		jbutton_login.setFont(new Font("Tahoma", Font.BOLD, 18));
		jbutton_login.setBounds(246, 295, 85, 43);
		contentPane.add(jbutton_login);
		jbutton_login.addActionListener(ac);
		
		JButton jbutton_canced = new JButton("Canced");
		jbutton_canced.addActionListener(ac);
		jbutton_canced.setFont(new Font("Tahoma", Font.BOLD, 18));
		jbutton_canced.setBounds(423, 295, 108, 43);
		contentPane.add(jbutton_canced);
		
		 jchcekbok_showmk = new JCheckBox("Show password");
		 jchcekbok_showmk.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			if(jchcekbok_showmk.isSelected()) {
				passwordField.setEchoChar((char)0) ;
				
				
			}else {
				passwordField.setEchoChar('*');
			}
				
			
				
			}
			
		 });
		jchcekbok_showmk.setFont(new Font("Tahoma", Font.BOLD, 10));
		jchcekbok_showmk.setBounds(246, 255, 120, 21);
		contentPane.add(jchcekbok_showmk);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(mkview.class.getResource("computericon.png"))));
		lblNewLabel.setBounds(41, 99, 139, 187);
		contentPane.add(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel("Đăng Nhập");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(267, 61, 162, 39);
		contentPane.add(lblNewLabel_1);
		this.setVisible(true);
	}
	
	public void dangnhaptk() {
		
		String user = jtextfil_user.getText();
		String pass = passwordField.getText();
		try {
		
		Connection con = (Connection) DriverManager.getConnection("jdbc:mySQL://localhost:3306/taikhoan", "root", "");
		PreparedStatement st = (PreparedStatement) con.prepareStatement("Select name, passwork from sinhvien where name=? and passwork=?");
                
		
		st.setString(1, user);
		st.setString(2, pass);
		ResultSet rs = st.executeQuery();
		if(rs.next()) {
		disable() ;
		
		JOptionPane.showMessageDialog(jbutton_login, "Bạn đăng nhập thành công");
		
	     fromview fr = new fromview() ;
		
		}else {
			JOptionPane.showMessageDialog(jbutton_login, "Sai mật khẩu hoặc Tài Khoản ");
		
			
			}
		
		} catch (Exception e) {
	     e.printStackTrace();
		}
	
	}
}
