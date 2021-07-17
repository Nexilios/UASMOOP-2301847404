
public class Multithreading_Implements implements Runnable{

	private String threadname;
	private Integer gold = 1;
	
	public Multithreading_Implements(String threadname) {
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

	public Multithreading_Implements() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(6000);
				System.out.println(threadname + " (by extends) has duplicated: " + gold + " gold");
				gold = gold*2;
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
