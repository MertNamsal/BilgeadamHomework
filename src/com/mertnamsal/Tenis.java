package com.mertnamsal;


public class Tenis extends SporDallari{
	private String sahaTipi;
	private int servisSayisi;
	

	
	
	
	public Tenis(String takim1, String takim2, String sahaTipi) {
		super(takim1, takim2);
		this.sahaTipi = sahaTipi;
		this.servisSayisi=0;
	}



	@Override
	public void skorDurumu() {
		System.out.println("Servis sayısı : "+servisSayisi);
	}
	public void servisAt() {
		System.out.println("Mükemmel bir servis..");
		servisSayisi++;
	}
	public void dalgaGec() {
		System.out.println("Hahaha öyle servis mi atılır");
	}



	public String getSahaTipi() {
		return sahaTipi;
	}



	public void setSahaTipi(String sahaTipi) {
		this.sahaTipi = sahaTipi;
	}



	public int getServisSayisi() {
		return servisSayisi;
	}



	public void setServisSayisi(int servisSayisi) {
		this.servisSayisi = servisSayisi;
	}



	@Override
	public void takimDegistir(String takim) {
		boolean check =true;
		while(check) {
			System.out.println("Hangi takimi değiştirmek istersiniz 1 mi 2 mi ?");
			int cevap = scan.nextInt();
			if(cevap == 1) {
				setTakim1(takim);
				check=false;
			}else if(cevap == 2) {
				setTakim2(takim);
				check=false;
			}else {
				System.out.println("Böyle bi takım yok");
			}
		}
		
		
		
	}
	
	
}
