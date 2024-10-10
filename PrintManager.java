package imprenta01;

public class PrintManager {

	public static void main(String[] args) {
		
		PrintQueue printQueue = new PrintQueue(); // Se inicializa la cola de impresion
		
		// Se crean un par de trabajos de impresion de prueba
		PrintJob job01 = new PrintJob("Randy");
		job01.setPrority('H');
		printQueue.addJob(job01);
		PrintJob job02 = new PrintJob("Uziel");
		job02.setPrority('L');
		printQueue.addJob(job02);
		PrintJob job03 = new PrintJob("Starlyn");
		printQueue.addJob(job03);
		PrintJob job04 = new PrintJob("Isaac");
		printQueue.addJob(job04);
		PrintJob job05 = new PrintJob("Freddy");
		job05.setPrority('H');
		printQueue.addJob(job05);
		
		// Se comienzan a imprimir los trabajos
		// Se imprimio el trabajo de 1 trabajo mas para que se genere el exception de que la cola esta vacia!
		try {
			for(int i = 0; i < 6; i++) {
				PrintJob thisJob = printQueue.getNextJob();
				System.out.println("Se imprime el trabajo de: " + thisJob.getUser() + " | con prioridad: " + thisJob.getPriorityLabel());
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		
	}
}
