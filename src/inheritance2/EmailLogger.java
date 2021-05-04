package inheritance2;

public class EmailLogger extends Logger {
	
	public void MussBeDefined (){
	System.out.println(" this metod muss be defined.Now we are in Emaillogger"); 
	}
	
	@Override
	public void log () {
		System.out.println("log kayitlari tanimli Emaile gönderildi");
	}
}
