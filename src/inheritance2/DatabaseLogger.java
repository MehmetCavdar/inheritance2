package inheritance2;

public class DatabaseLogger extends Logger {
	
	
	public void MussBeDefined (){
	System.out.println(" this metod muss be defined. Now we are in Databaselogger"); 
	}

	@Override
	public void log () {
		System.out.println("Veritabanina Loglandi"); 
	}
}
