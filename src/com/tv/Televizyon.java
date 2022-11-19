package com.tv;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Televizyon {
	private String marka;
	private String boyut;
	private ArrayList<Kanal>kanallar;
	private ArrayList<String>turler;
	private int tvSes;
	private boolean tvAcikMi;
	private boolean tvKuruluMu;
	private int aktifKanal;
	static Scanner scan = new Scanner(System.in);
	
	
	public Televizyon() {
		super();
		this.tvSes = 10;
		this.aktifKanal=1;
		this.tvAcikMi=false;
		this.tvKuruluMu= false;
		kanallar = new ArrayList<Kanal>();
		turler = new ArrayList<String>();
	}
	public void tvKur() {
		if(tvKuruluMu==false) {
			System.out.println("Televizyonun markası :");
			this.marka = scan.nextLine();
			
			System.out.println("Televizyonun boyutu :");
			this.boyut=scan.nextLine();
			
			System.out.println("Markası : "+this.marka + "\nBoyutu : "+this.boyut+" olan bir tv oluşturuldu.");
			this.tvKuruluMu=true;
			
			kanallariOlustur();
			tvKuruluMu=true;
		}else {
			System.out.println("Tv zaten kurulu usta");
		}
		
	}

	public void kanallariOlustur() {
		MuzikKanali kanal1 = new MuzikKanali("BuseMuzik", 1, "Rap");
		HaberKanali kanal2 = new HaberKanali("MelihMuzik",2,"Spor");
		MuzikKanali kanal3 = new MuzikKanali("RadyoAli",3,"Türk Sanat müsikisi");
		HaberKanali kanal4 = new HaberKanali("MertMuzik",4,"Magazin");
		
		this.kanallar.add(kanal1);
		this.kanallar.add(kanal2);
		this.kanallar.add(kanal3);
		this.kanallar.add(kanal4);
		
		this.turler.add(kanal1.getMuzikTuru());
		this.turler.add(kanal2.getHaberTuru());
		this.turler.add(kanal3.getMuzikTuru());
		this.turler.add(kanal4.getHaberTuru());

	}
	
	
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getBoyut() {
		return boyut;
	}
	public void setBoyut(String boyut) {
		this.boyut = boyut;
	}
	public ArrayList<Kanal> getKanallar() {
		return kanallar;
	}
	public void setKanallar(ArrayList<Kanal> kanallar) {
		this.kanallar = kanallar;
	}
	public void tvAc() {
		if(this.tvKuruluMu==true) {
			if(this.tvAcikMi==false ) {
				this.tvAcikMi=true;
				System.out.println("TV açıldı.Güncel kanal : "+aktifKanal+" : "+kanallar.get(aktifKanal-1).getKanalAdi()+" Kanal Türü : "+turler.get(aktifKanal-1));
			}else {
				System.out.println("TV zaten açık");
			}
		}else {
			System.out.println("TVYİ KUR LAN");
		}
		
		
	}
	public void sesAc() {
		if(tvKuruluMu) {
			if(tvAcikMi) {
				if(this.tvSes<20 && this.tvSes>=0) {
					this.tvSes++;
					System.out.println("Ses arttı güncel ses : "+this.tvSes);
				}else {
					System.out.println("USTA SESI DAHA AÇAMAM");
				}
			}else {
				System.out.println("Usta TV Yİ AÇ");
			}
		}else {
			System.out.println("USTA TVYİ KUR");
		}
		
		
	}
	public void sesAzalt() {
		if(tvKuruluMu) {
			if(tvAcikMi) {
				if(this.tvSes<=20 && this.tvSes>0) {
					this.tvSes--;
					System.out.println("Ses azldı güncel ses : "+this.tvSes);
				}else {
					System.out.println("USTA SESI DAHA KISAMAM");
				}
			}else {
				System.out.println("Usta TV Yİ AÇ");
			}
		}else {
			System.out.println("USTA TVYİ KUR");
		}
		
	
	}
	public void tvKapat() {
		if(this.tvAcikMi==true) {
			this.tvAcikMi=false;
			System.out.println("TV Kapanıyor");
		}else {
			System.out.println("TV KAPALI USTA");
		}
		
	}
	public void kanalDegister() {
		
		if(tvKuruluMu==true) {
			if(tvAcikMi==true) {
				System.out.println("Hangi kanala geçmek istersiniz ?");
				int kanal = scan.nextInt();
				if(kanal !=aktifKanal) {
					if(kanallar.size() >=kanal && kanal>=0) {
						aktifKanal = kanal;
						System.out.println("Kanal : "+kanal+" Kanal adı :"+kanallar.get(kanal-1).getKanalAdi()+" Kanal Türü : "+turler.get(aktifKanal-1));
					}else {
						System.out.println("Geçerli bir kanal numarası giriniz");
					}
					
				}else {
					System.out.println("Zaten bu kanaldasınız.");
				}
			}else {
				System.out.println("Önce televizyonu AÇ");
			}
		}else {
			System.out.println("Önce tvyi KUR");
		}
		
	}
	
	public void aktifKanaliGoster() {
		if(tvKuruluMu==true) {
			if(tvAcikMi==true) {
				System.out.println("Kanal : "+this.aktifKanal+" Kanal adı :"+kanallar.get(this.aktifKanal-1).getKanalAdi());
			}else {
				System.out.println("Önce televizyonu AÇ");
			}
		}else {
			System.out.println("Önce tvyi KUR");
		}
	}
	
}
