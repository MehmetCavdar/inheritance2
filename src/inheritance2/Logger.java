package inheritance2;

//Dikkat  Class Abstract isaretli
public abstract class Logger {
	
	
	// This method muss be defined (overrided) in derived Class
	public abstract void  MussBeDefined();

	//This method can not be changed (overrided) in derived Class
	public final void CanNotBeChanged () {
		System.out.println("Can not be Changed");
	}
	
	public void log () {
		
	}
	
	

}
