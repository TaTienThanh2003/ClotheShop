package database;

import java.util.ArrayList;
import java.util.Iterator;

import model.TacGia;

public class TacGiaDAO{
	private ArrayList<TacGia> data = new ArrayList<TacGia>();
	
	private ArrayList<TacGia> selectAll(){
		
		return data;
	}
	private TacGia selectbyid(String id) {
		TacGia tim = new TacGia();
		tim.setMaTacGia(id);
		for(TacGia tacgia:data) {
			if(tacgia.equals(tim)) {
				return tacgia;
			}
		}
		return null;
	}
	
	private int insert(TacGia tg) {
		TacGia kiemtratontai = this.selectbyid(tg.getMaTacGia());
		if(kiemtratontai == null) {
			data.add(tg);
			return 1;
		}else {
			return 0;
		}
	}
	
	private int insertAll(ArrayList<TacGia> list) {
		int dem = 0;
		for(TacGia tacgia: list) {
			dem+=this.insert(tacgia);
		}
		return dem;
	}
	
	private int delete(TacGia tg) {
		TacGia kiemtratontai = this.selectbyid(tg.getMaTacGia());
		if(kiemtratontai != null) {
			data.remove(tg);
			return 1;
		}else {
			return 0;
		}
	}
	private int deleteAll(ArrayList<TacGia> list) {
		int dem = 0;
		for(TacGia tacgia: list) {
			dem -=this.delete(tacgia);
		}
		return dem;
	}
	private int update(TacGia tg) {
		TacGia kiemtratontai = this.selectbyid(tg.getMaTacGia());
		if(kiemtratontai != null) {
			data.remove(kiemtratontai);
			data.add(tg);
			return 1;
		}else {
			return 0;
		}
	}
}
