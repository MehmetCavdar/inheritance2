package inheritance2;

public class FileLogger extends Logger {
	
	
	public void MussBeDefined (){
	System.out.println(" this metod muss be defined.Now we are in Filelogger"); 
	}

	@Override
	public void log () {
		System.out.println("Dosyaya Loglandi");
	}
}
