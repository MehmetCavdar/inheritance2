package inheritance2;

public class LogManager {
	
	//Bu Manager'a kullanmiyoruz. 
	//C�nk�  Logger s�per class ve diger logger y�ntemlerine alt class tanimlayarak  loglama yaptik

	public void log(int logType) {
		
		
		if (logType==1) {
			System.out.println("Veritabanina Loglandi"); // burada log komutalari var varsayiyoruz
		} else if (logType==2) {
			System.out.println("Dosyaya Loglandi"); // burada log komutalari var varsayiyoruz
		} else {
			System.out.println("log kayitlari tanimli Emaile g�nderildi");// burada log komutalari var varsayiyoruz
		}
	}
}

//1-DataBase
//2-File
//3-Email
