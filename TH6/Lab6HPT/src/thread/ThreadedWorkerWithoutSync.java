

package thread;

import resource.ResourcesExploiter;

public class ThreadedWorkerWithoutSync extends Thread {

	private ResourcesExploiter __rExp;
	public ThreadedWorkerWithoutSync(ResourcesExploiter rExp) {
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
