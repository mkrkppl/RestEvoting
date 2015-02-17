package com.endang.restEvoting.model;

// Generated 07-Nov-2014 10:39:09 by Hibernate Tools 3.4.0.CR1
public class Kandidat{

	private Integer idKandidat;
	private String namaKandidat;
	private String urlPhotoKandidat;
	private String visiKandidat;
	private String misiKandidat;
	private String periodeKandidat;
	private boolean statusKandidat;

	public Kandidat() {
		
	}

	public Kandidat(Integer idKandidat, String namaKandidat,
			String urlPhotoKandidat, String visiKandidat, String misiKandidat,
			String periodeKandidat,boolean status) {
		super();
		this.idKandidat = idKandidat;
		this.namaKandidat = namaKandidat;
		this.urlPhotoKandidat = urlPhotoKandidat;
		this.visiKandidat = visiKandidat;
		this.misiKandidat = misiKandidat;
		this.periodeKandidat = periodeKandidat;
		this.statusKandidat = status;
	}

	public Integer getIdKandidat() {
		return this.idKandidat;
	}

	public void setIdKandidat(Integer idKandidat) {
		this.idKandidat = idKandidat;
	}

	
	public String getNamaKandidat() {
		return this.namaKandidat;
	}

	public void setNamaKandidat(String namaKandidat) {
		this.namaKandidat = namaKandidat;
	}

	public String getUrlPhotoKandidat() {
		return this.urlPhotoKandidat;
	}

	public void setUrlPhotoKandidat(String urlPhotoKandidat) {
		this.urlPhotoKandidat = urlPhotoKandidat;
	}

	public String getVisiKandidat() {
		return this.visiKandidat;
	}

	public void setVisiKandidat(String visiKandidat) {
		this.visiKandidat = visiKandidat;
	}

	public String getMisiKandidat() {
		return this.misiKandidat;
	}

	public void setMisiKandidat(String misiKandidat) {
		this.misiKandidat = misiKandidat;
	}

	public String getPeriodeKandidat() {
		return this.periodeKandidat;
	}

	public void setPeriodeKandidat(String periodeKandidat) {
		this.periodeKandidat = periodeKandidat;
	}

	public boolean isStatusKandidat() {
		return this.statusKandidat;
	}

	public void setStatusKandidat(boolean statusKandidat) {
		this.statusKandidat = statusKandidat;
	}

	

}