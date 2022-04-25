package account;

public class Account {
	private String tenTaiKhoanString;
	private int SoDu;
	
	public String getTenTaiKhoanString() {
		return tenTaiKhoanString;
	}
	public void setTenTaiKhoanString(String tenTaiKhoanString) {
		this.tenTaiKhoanString = tenTaiKhoanString;
	}
	public int getSoDu() {
		return SoDu;
	}
	public void setSoDu(int soDu) {
		SoDu = soDu;
	}

	public void CapNhatTaiKhoan(int n, int soTien) {
		if(n == 1) {
			SoDu = SoDu - soTien;
		}
		else if(n == 2) {
			SoDu = SoDu + soTien;
		}
	}
	
	
}
