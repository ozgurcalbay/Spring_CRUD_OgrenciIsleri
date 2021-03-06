package com.Entity.Dao;

import java.util.List;

import com.Entity.E.Ogrenci;

public interface OgrenciDAO {
	public List<Ogrenci> getOgrenciler();

	public void saveOgrenci(Ogrenci ogr);

	public Ogrenci getOgrenci(int ogrid);

	public void deleteOgrenci(int ogrid);

	public Ogrenci OgrNoKayitlimi(Integer ogrNo);

	public List<Ogrenci> SearchOgrenci(Integer id, String isim, String soyisim, Integer ogrenci_no);
}
