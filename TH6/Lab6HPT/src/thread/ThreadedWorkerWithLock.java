package thread;

import resource.ResourcesExploiterWithLock;

public class ThreadedWorkerWithLock extends Thread {
	private ResourcesExploiterWithLock __rExp;
	public ThreadedWorkerWithLock(ResourcesExploiterWithLock rExp) {
		this.__rExp=rExp;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int i=0;i<1000;i++) {
			this.__rExp.exploit();
		}
	}
}
