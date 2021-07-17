
public class Multithreading_Extends extends Thread{

	private String threadname;
	private Integer gold = 0;
	
	
	public Multithreading_Extends() {
	}

	
	
	public Multithreading_Extends(String threadname) {
		super();
		this.threadname = threadname;
	}


	public String getThreadname() {
		return threadname;
	}



	public void setThreadname(String threadname) {
		this.threadname = threadname;
	}



	public Integer getGold() {
		return gold;
	}



	public void setGold(Integer gold) {
		this.gold = gold;
	}



	public void run() {
		while(true) {
			try {
				Thread.sleep(3000);
				System.out.println(threadname + " (by extends) is mining: " + gold + " gold");
				gold++;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
