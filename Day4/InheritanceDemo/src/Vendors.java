import java.time.LocalDate;
import java.util.Arrays;

public class Vendors extends Employee {
	
	private String[] emp;
	private int amt;
	
	
	public Vendors() {
		super();
	}

	public Vendors(int pid, String pname, String mobile, String email,String dept, String desg,LocalDate doj,String[] emp, int amt) {
		super(pid,pname,mobile,email,dept,desg,doj);
		this.emp = emp;
		this.amt = amt;
	}


	public String[] getEmp() {
		return emp;
	}


	public void setEmp(String[] emp) {
		this.emp = emp;
	}


	public int getAmt() {
		return amt;
	}


	public void setAmt(int amt) {
		this.amt = amt;
	}


	@Override
	public String toString() {
		return super.toString()+"Vendors [emp=" + Arrays.toString(emp) + ", amt=" + amt + ", getEmp()=" + Arrays.toString(getEmp())
				+ ", getAmt()=" + getAmt() + "]";
	}
}
