package imprenta01;

public class Node {
	
	private PrintJob jobData; // Data de un nodo de la cola de impresion
	Node next; // Siguiente nodo de la lista enlazada
	
	public Node(PrintJob jobData) {
		this.jobData = jobData;
		this.next = null;
	}

	public PrintJob getJobData() {
		return jobData;
	}
	
	
}
