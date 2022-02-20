package com.algonquin.loggy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CCSpooler {
	private Recording recording; 
	ExecutorService executor;
	
	public CCSpooler() {
	this.executor = Executors.newFixedThreadPool(5);
	}
	
	public void enqueue(Recording r) {
		Runnable thread = new CCThread(recording);
		executor.execute(thread);
	}
	
	public void shutdown() {
		executor.shutdown();
		while (!executor.isTerminated()) {}
		System.out.println("Threads have finished");
	}


}
