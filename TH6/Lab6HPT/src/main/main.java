package main;

import resource.*;
import thread.*;

public class main {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("hello world");
		ResourcesExploiterWithLock resource = new ResourcesExploiterWithLock(0);
		ThreadedWorkerWithLock worker1 = new ThreadedWorkerWithLock(resource);
		ThreadedWorkerWithLock worker2 = new ThreadedWorkerWithLock(resource);
		ThreadedWorkerWithLock worker3 = new ThreadedWorkerWithLock(resource);
		worker1.start();
		worker2.start();
		worker3.start();
		worker1.join();
		worker2.join();
		worker3.join();
		System.out.println(resource.getRsc()); 
		return;
	}

}
