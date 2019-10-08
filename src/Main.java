
class Hewan{
	String makanan = "Daging";
	
	void minum() {
		System.out.println("Saya minum Air");
	}
	
	void makan() {
		String makanan = "Daging";
		System.out.println("Saya Memakan "+ makanan);
		System.out.println("Saya Memakan "+ this.makanan);
		this.minum();
	}
}

class Kucing extends Hewan{
	
	
	void minum() {
		System.out.println("Saya minum susu");
		super.minum();
	}
	
	void jalan() {
		System.out.println("Saya Jalan");
	}
}

class SonCat extends Kucing{
	
}

class Elang extends Hewan{
	
	void terbang() {
		System.out.println("Saya Terbang");
	}
	
}

public class Main {

	public static void main(String[] args) {
		
		Hewan Kucing = new Hewan();
		Kucing.makan();
		//Kucing.minum();
		Kucing kity = new Kucing();
		System.out.println();
		
		kity.minum();
		kity.jalan();
		System.out.println();
		
		Elang kwakkwak = new Elang();
		System.out.println("Makanan = " + kwakkwak.makanan);
		kwakkwak.terbang();
		
		SonCat anakKucing = new SonCat();
		anakKucing.makan();

	}

}
