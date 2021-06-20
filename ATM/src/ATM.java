import java.util.Scanner;

public class ATM {
	public void calis(Hesap hesap) {
	Login login = new Login();
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Bankam�za Ho�geldiniz....");
	System.out.println("****************************");
	System.out.println("Kullan�c� Giri�i");
	System.out.println("****************************");
	int giris_hakki=3;
	while(true) {
		if(login.login(hesap)){
			System.out.println("Giri� Ba�ar�l�....");
			break;
		}
		else {
			System.out.println("Giri� Ba�ar�s�z");
			giris_hakki-=1;
			System.out.println("Kalan giri� hakk�n�z:"+giris_hakki);
		}
		if (giris_hakki==0) {
			System.out.println("Giri� hakk�n�z kalmad�. ");
			return;
		}
	}
	System.out.println("************************");
	String islemler = "1. Bakiye G�r�nt�le\n"
			+"2. Para Yat�rma\n"
			+"3. Para �ekme\n"
			+"��k�� i�in q'ya bas�n";
	System.out.println(islemler);
	System.out.println("************************");
	
	
	
	while(true) {
		System.out.println("��lemi Se�iniz: ");
		String islem=scanner.nextLine();
		
		if (islem.equals("q")) {
			System.out.println("��k�� Ba�ar�l�...");
			break;
		}
		else if (islem.equals("1")) {
			System.out.println("Bakiyeniz: "+hesap.getBakiye());
		}
		else if (islem.equals("2")) {
			System.out.println("Yat�rmak istenilen tutar� giriniz:");
			int tutar = scanner.nextInt();
			scanner.nextLine();
			hesap.paraYatir(tutar);
		}
		else if (islem.equals("3")) {
			System.out.println("�ekilmek istenilen tutar� giriniz:");
			int tutar = scanner.nextInt();
			scanner.nextLine();
			hesap.paraCek(tutar);
		}
		else {
			System.out.println("Ge�ersiz i�lem giri�i yapt�n�z.....");
		}
	}
	
	}
}
