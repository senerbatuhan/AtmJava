
public class Main {
	
	public static void main(String[] args) {
		ATM atm = new ATM();
		
		Hesap hesap = new Hesap("Batuhan Sener", "12345", 2000);

		
		atm.calis(hesap);
		System.out.println("Programdan ��k�l�yor...");
	}
	
}
