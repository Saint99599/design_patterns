import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
public class ThreadPool {
	
	private final BlockingQueue<Job> jobQueue;
	private final Thread[] jobThreads;
	private volatile boolean shutdown;
	private int jobCount;

	public ThreadPool(int n)
	{
		jobQueue = new LinkedBlockingQueue<>();
		jobThreads = new Thread[n];
		jobCount = 0;

		for (int i = 0; i < n; i++) {
			jobThreads[i] = new Worker("Pool Thread " + i);
			jobThreads[i].start();
		}
	}

	public class CommandObject implements Job {
		private final String command;
	
		public CommandObject(String command) {
			this.command = command;
		}
	
		@Override
		public void run() {
			System.out.println(command);
		}
	}

	public void addJob(Job r)
	{
		try {
			if (jobCount < 6) {
				jobQueue.put(r);
				jobCount++;
			} else {
				jobQueue.put(new CommandObject("On button No command is assigned to this slot"));
				jobQueue.put(new CommandObject("Off button No command is assigned to this slot"));
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	public void shutdownPool()
	{
		while (!jobQueue.isEmpty()) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		shutdown = true;
		for (Thread workerThread : jobThreads) {
			workerThread.interrupt();
		}
	}
	//invoker 
	private class Worker extends Thread
	{
		public Worker(String name)
		{
			super(name);
		}

		public void run()
		{
			while (!shutdown) {
				try {
					Job r = jobQueue.take();
					r.run();
				} catch (InterruptedException e) {
				}
			}
		}
	}

	public int getJobCount()
	{
		return jobCount;
	}

}
