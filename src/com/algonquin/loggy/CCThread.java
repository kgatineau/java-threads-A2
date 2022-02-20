package com.algonquin.loggy;

public class CCThread implements Runnable {
	
	public CCThread(Recording r) {
	}
	
	public void run() {
		System.out.printf("Recording has been uploaded..\n%s has begun "
				+ "closed-captioning..\nThread is in %s state.. \n\n", 
				Thread.currentThread().getName(),
				Thread.currentThread().getState());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e){
			e.printStackTrace();
		}
		
	};
	
}


