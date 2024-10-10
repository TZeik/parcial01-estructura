package imprenta01;

public class PrintQueue {

	public Node head; // Cabeza de la lista enlazada simple
	
	

	public PrintQueue() {
		this.head = null;
	}

// Implementacion de ingreso de un nuevo "trabajo a la cola" donde se comprueba la prioridad del elemento
// y lo compara hasta encontrar un nodo con una prioridad menor, vease la clase "Node.java".
	public void addJob(PrintJob pj) {
	
		Node newNode = new Node(pj);
		if(head == null || head.getJobData().getPrority() > pj.getPrority()) {
			newNode.next = head;
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null && temp.next.getJobData().getPrority() <= pj.getPrority()) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
		}
		
	}
	
//	Este metodo saca el "trabajo de mayor prioridad de la cola" y lo elimina.
	public PrintJob getNextJob() {
		if (head == null) {
            throw new IllegalStateException("La cola esta vacia");
        }
        PrintJob job = head.getJobData();
        head = head.next;
        return job;
	}
	
}
