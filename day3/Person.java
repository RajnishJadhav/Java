package day3;

public class Person {
	  
	private int pid;
	private String pName;
	private String mobile;
	
	Person(){
		
//		pid=0;
//		pName=null;
//		mobile=null;
		
		this(0, null, null);
		
	}
	  Person(int pid,String pName,String mobile){
		  this.pid=pid;
		  this.pName=pName;
		  this.mobile=mobile;
		  
	  }
	  
	  public void setPid(int pid) {
		  this.pid=pid;
	  }
	  
	  public int getPid() {
		  return this.pid;
	  }
	  
	  public void setPname(String pName) {
		  this.pName=pName;
	  }
	  
	  public String getPname() {
		  return this.pName;
	  }
	  public void setMobile(String mobile) {
		  this.mobile=mobile;
	  }
	  
	  public String getMobile() {
		  return this.mobile;
	  }
	
	  public String toString() {
		return pid+" "+pName+" "+mobile;
		  
	  }

	public static void main(String[] args) {
		
		Person p=new Person(1,"Raj","555");
		p.setPid(5);
		//p.getPid();
		
		System.out.println(p);
	}

}
