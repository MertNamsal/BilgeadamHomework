package com.mertnamsal;

public class Basketbol extends SporDallari implements ITop {
	private String potaTipi;
	private int basketSayisi;
	private int faulSayisi;

	
	
	
	public Basketbol(String takim1, String takim2, String potaTipi) {
		super(takim1, takim2);
		this.potaTipi = potaTipi;
		this.basketSayisi=0;
		this.faulSayisi=0;
	}

	@Override
	public void skorDurumu() {
		System.out.println("Basket sayısı : "+this.basketSayisi);
	}
	public void basketAt() {
		System.out.println("Mükemmel bir sayı");
		basketSayisi++;
	}
	public void faulYap() {
		if(this.faulSayisi<5) {
			this.faulSayisi++;
			System.out.println("Faul yaptın. Güncel faul sayın : "+this.faulSayisi);
		}else {
			System.out.println("Daha fazla faul yapamazsın oyun dışı !!!");
		}
	}

	public String getPotaTipi() {
		return potaTipi;
	}

	public void setPotaTipi(String potaTipi) {
		this.potaTipi = potaTipi;
	}

	public int getBasketSayisi() {
		return basketSayisi;
	}

	public void setBasketSayisi(int basketSayisi) {
		this.basketSayisi = basketSayisi;
	}

	public int getFaulSayisi() {
		return faulSayisi;
	}

	public void setFaulSayisi(int faulSayisi) {
		this.faulSayisi = faulSayisi;
	}

	@Override
	public void takimDegistir(String takim) {
		boolean check =true;
		while(check) {
			System.out.println("Güncel takımlar : "+getTakim1()+" , "+getTakim2());
			System.out.println("Hangi takimi değiştirmek istersiniz 1 mi 2 mi ?");
			int cevap = scan.nextInt();
			if(cevap == 1) {
				setTakim1(takim);
				System.out.println("Güncel takımlar : "+getTakim1()+" , "+getTakim2());
				check=false;
			}else if(cevap == 2) {
				setTakim2(takim);
				System.out.println("Güncel takımlar : "+getTakim1()+" , "+getTakim2());
				check=false;
			}else {
				System.out.println("Hatalı tuşlama");
			}
		
	}
	
	
	}

	@Override
	public void topuPatlat() {
		System.out.println("Top patladı.");
		
	}
}
