package concorrente_distribuida.Threads4;


public class Main {

	public static void main(String[] args) {
		int num_threads = 4;
		SomaPrimos[] threads = new SomaPrimos[num_threads];
		int quant = 99;
		
		int intervalo = quant/num_threads;
		
		for (int i = 0; i < threads.length; i++) {
			int starts = i * intervalo + 1;
			int ends = (i + 1 != num_threads) ? (i + 1) * intervalo : quant;
			System.out.println("starts: " + starts + " ends: " + ends);
			threads[i] = new SomaPrimos(starts, ends);
			threads[i].start();
		}
		
		try {
            for (SomaPrimos thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		int soma = 0;
		
		for (SomaPrimos thread : threads) {
            soma += thread.getSoma();
        }
		
		System.out.println("A soma total é: " + soma);
		
	}
}


//public class Main {
//
//	public static void main(String[] args) throws InterruptedException {
//        int startInterval = 1;
//        int endInterval = 100;
//
//        int numThreads = 4;
//
//        int intervalSize = (endInterval - startInterval + 1) / numThreads;
//        int currentStart = startInterval;
//        int currentEnd = startInterval + intervalSize - 1;
//        int finalSum = 0;
//
//        SomaPrimos[] calculators = new SomaPrimos[numThreads];
//        for (int i = 0; i < numThreads; i++) {
//            if (i == numThreads - 1) {
//                currentEnd = endInterval;
//            }
//            calculators[i] = new SomaPrimos(currentStart, currentEnd);
//            calculators[i].start();
//            currentStart = currentEnd + 1;
//            currentEnd = currentStart + intervalSize - 1;
//        }
//
//        for (SomaPrimos calculator : calculators) {
//            calculator.join();
//            finalSum += calculator.getSoma();
//        }
//        System.out.println("Soma dos primos no intervalo [" + startInterval + ", " + endInterval + "]: " + finalSum);
//
//        
//	}
//
//}