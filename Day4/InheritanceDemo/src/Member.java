
public class Member extends Person {
	
	private String typeOfMembership;
	private int memAmount;
	
	public Member() {
		super();
	}

	public Member(int pid, String pname, String mobile, String email,String typeOfMembership, int memAmount) {
		super(pid,pname,mobile,email);
		this.typeOfMembership = typeOfMembership;
		this.memAmount = memAmount;
	}
	

	
	
	
	

}
