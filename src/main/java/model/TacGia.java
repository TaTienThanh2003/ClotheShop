package model;

import java.sql.Date;
import java.util.Objects;

public class TacGia {
	private String maTacGia,hoVaTen,tieuSu;
	private Date ngaySinh;
	
	public TacGia() {
		
	}

	public TacGia(String maTacGia, String hoVaTen, String tieuSu, Date ngaySinh) {
		super();
		this.maTacGia = maTacGia;
		this.hoVaTen = hoVaTen;
		this.tieuSu = tieuSu;
		this.ngaySinh = ngaySinh;
	}

	public String getMaTacGia() {
		return maTacGia;
	}

	public void setMaTacGia(String maTacGia) {
		this.maTacGia = maTacGia;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public String getTieuSu() {
		return tieuSu;
	}

	public void setTieuSu(String tieuSu) {
		this.tieuSu = tieuSu;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	@Override
	public int hashCode() {
		return Objects.hash(hoVaTen, maTacGia, ngaySinh, tieuSu);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TacGia other = (TacGia) obj;
		return  Objects.equals(maTacGia, other.maTacGia)
;
	}
	
}
