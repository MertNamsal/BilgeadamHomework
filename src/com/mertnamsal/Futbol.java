package com.mertnamsal;

public class Futbol extends SporDallari {
	private String oyunTarzi;
	private int golSayisi;

	public Futbol(String takim1, String takim2, String oyunTarzi) {
		super(takim1, takim2);
		this.oyunTarzi = oyunTarzi;
		this.golSayisi=0;
	}

	@Override
	public void skorDurumu() {
		System.out.println("Maçtaki gol sayısı : "+golSayisi);
	}
	
	public void golAt() {
		golSayisi++;
		System.out.println("GOOOLLLLL");
	}
	public void ayaginaKay() {
		int sakatlanmaDurumu = (int)(Math.random()*3);
		if(sakatlanmaDurumu == 0) {
			System.out.println("BOŞA KAYDIN");
		}else if(sakatlanmaDurumu==1) {
			System.out.println("TOPA GÜZEL MÜDAHALE");
		}else {
			System.out.println("ADAM TAKLA ATTI YAVAŞŞŞŞŞ");
		}
	}

	public String getOyunTarzi() {
		return oyunTarzi;
	}

	public void setOyunTarzi(String oyunTarzi) {
		this.oyunTarzi = oyunTarzi;
	}

	public int getGolSayisi() {
		return golSayisi;
	}

	public void setGolSayisi(int golSayisi) {
		this.golSayisi = golSayisi;
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
