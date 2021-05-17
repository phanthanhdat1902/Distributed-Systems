package thread;

import resource.ResourcesExploiter;

public class ThreadedWorkerWithSync extends Thread {
	private ResourcesExploiter __rExp;

	public ThreadedWorkerWithSync(ResourcesExploiter rExp) {
		this.__rExp = rExp;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		synchronized (this.__rExp) {
			for (int i = 0; i < 1000; i++) {
				this.__rExp.exploit();
			}
		}
	}
}
