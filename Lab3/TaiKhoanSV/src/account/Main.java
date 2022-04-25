package account;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Account adminAccount = new Account();
		adminAccount.setTenTaiKhoanString("Nguyen Le Tuan Anh");
		adminAccount.setSoDu(20194475);
		while(true) {
			String menuString;
			menuString = JOptionPane.showInputDialog(null, "1. Hien thi so du tai khoan\n" 
					+ "2. Rut tien tu tai khoan\n" + "3. Nhan them tien\n" + "4. Thoat\n" + "Lua chon: ",
					"----------" + adminAccount.getTenTaiKhoanString() + "----------" ,
					JOptionPane.INFORMATION_MESSAGE);
			int menu = Integer.parseInt(menuString);
			if (menu == 1) {
				JOptionPane.showMessageDialog(null,"So du tai khoan la: " + adminAccount.getSoDu(),
						"----------" + adminAccount.getTenTaiKhoanString() + "----------",
						JOptionPane.INFORMATION_MESSAGE);
			}
			else if(menu == 2) {
				String tienString;
				tienString = JOptionPane.showInputDialog(null, "Nhap so tien muon rut: ",
						"----------" + adminAccount.getTenTaiKhoanString() + "----------" ,
						JOptionPane.INFORMATION_MESSAGE);
				int tien = Integer.parseInt(tienString);
				adminAccount.CapNhatTaiKhoan(1, tien);
			}
			else if(menu == 3) {
				String tienString;
				tienString = JOptionPane.showInputDialog(null, "Nhap so tien nhan them: ",
						"----------" + adminAccount.getTenTaiKhoanString() + "----------" ,
						JOptionPane.INFORMATION_MESSAGE);
				int tien = Integer.parseInt(tienString);
				adminAccount.CapNhatTaiKhoan(2, tien);
			}
			else if(menu == 4) {
				System.exit(0);
			}
		}
	}
}
