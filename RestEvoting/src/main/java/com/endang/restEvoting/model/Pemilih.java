package com.endang.restEvoting.model;


/**
 * Pemilih generated by hbm2java
 */
public class Pemilih {

	private String idPemilih;
	private String namaPemilih;
	private String noHpPemilih;
	private String emailPemilih;
	private String statusVotePemilih;
	private boolean statusPemilih;

	public Pemilih() {
	}

	public Pemilih(String idPemilih, String namaPemilih,
			String noHpPemilih, String emailPemilih, String statusVotePemilih,
			boolean statusPemilih) {
		this.idPemilih = idPemilih;
		this.namaPemilih = namaPemilih;
		this.noHpPemilih = noHpPemilih;
		this.emailPemilih = emailPemilih;
		this.statusVotePemilih = statusVotePemilih;
		this.statusPemilih = statusPemilih;
	}

	public String getIdPemilih() {
		return this.idPemilih;
	}

	public void setIdPemilih(String idPemilih) {
		this.idPemilih = idPemilih;
	}

	public String getNamaPemilih() {
		return this.namaPemilih;
	}

	public void setNamaPemilih(String namaPemilih) {
		this.namaPemilih = namaPemilih;
	}

	public String getNoHpPemilih() {
		return this.noHpPemilih;
	}

	public void setNoHpPemilih(String noHpPemilih) {
		this.noHpPemilih = noHpPemilih;
	}

	public String getEmailPemilih() {
		return this.emailPemilih;
	}

	public void setEmailPemilih(String emailPemilih) {
		this.emailPemilih = emailPemilih;
	}

	public String getStatusVotePemilih() {
		return this.statusVotePemilih;
	}

	public void setStatusVotePemilih(String statusVotePemilih) {
		this.statusVotePemilih = statusVotePemilih;
	}

	public boolean isStatusPemilih() {
		return this.statusPemilih;
	}

	public void setStatusPemilih(boolean statusPemilih) {
		this.statusPemilih = statusPemilih;
	}

}