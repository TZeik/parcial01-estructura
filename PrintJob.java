package imprenta01;

import java.util.Date;

public class PrintJob {
	
	private String user; // Atributo de usario
	private Date shippingTime; // Atributo de la hora de envio
	private char priority; // Atributo de prioridad
	
	public PrintJob(String user) {
		super();
		this.user = user;
		this.shippingTime = new Date(); // Fecha por defecto actual
		this.priority = 'M'; // Prioridad por defecto 'M' (Media)
	}

	public String getUser() {
		return user;
	}

	public Date getShippingTime() {
		return shippingTime;
	}

	// Para establecer una prioridad acorde se convierten los codigos de char a int en orden de "prioridad"
	public int getPrority() {
		int priorityCode = 1;
		switch(priority) {
			case 'L': priorityCode = 2; break;
			case 'M': priorityCode = 1; break;
			case 'H': priorityCode = 0; break;
		}
		return priorityCode;
	}
	
	public char getPriorityLabel() {
		return priority;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setShippingTime(Date shippingTime) {
		this.shippingTime = shippingTime;
	}

	public void setPrority(char priority) {
		this.priority = priority;
	}
	
	
	
}
