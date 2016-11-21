package main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import config.ThreadParams;
import config.ThreadParamsList;

public class ThreadExample {

	final static String configFileName = "config.xml";
	final static String envExternalConfigFilePath = "EA_HTML_CFG";

	public static void main(String[] args) {

		ThreadParamsList threadList = new ThreadParamsReader(configFileName).readParams();

		for (ThreadParams tp : threadList) {
			System.out.println(tp);
		}

		try {
			Thread.sleep(4000L);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}

		ExecutorService executor = Executors.newFixedThreadPool(threadList.getMaxNumberOfThreads());
		for (ThreadParams tp : threadList) {
			executor.execute(new RunnableDemo(tp));
		}
		executor.shutdown();
		System.out.println("Shutdown all threads");
		while (!executor.isTerminated()) {
		}
		System.out.println("Finished all threads");
	}

}
