package priority;

public class PriorityMain {

	public static void main(String[] args) {
		ThreadPriority run1 = new ThreadPriority("스레드 1");
		ThreadPriority run2 = new ThreadPriority("스레드 2");
		ThreadPriority run3 = new ThreadPriority("스레드 3");
		ThreadPriority run4 = new ThreadPriority("스레드 4");
		
		//우선 순위 1~10, 10 - 우선순위 제일 높음, 1 - 우선 순위 제일 낮음, 5 - 기본값 
		run1.setPriority(Thread.MIN_PRIORITY);
		//run1.setPriority(6);
		run2.setPriority(Thread.MIN_PRIORITY);
		run3.setPriority(Thread.MIN_PRIORITY);
		run4.setPriority(Thread.MAX_PRIORITY);
		
		run1.start();run2.start();run3.start();run4.start();
		System.out.println("main thread exit");
	}

}

