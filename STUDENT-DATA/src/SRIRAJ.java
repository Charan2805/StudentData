
public class SRIRAJ {
	String RollNo;
	String Branch;
	String Address;
	long Mobilenum;
	String Mailid;
	String Academicyear;
	String Fathername;
	String Mothername;
	String fatheroccupation;
	SRIRAJ () {
		RollNo = "20S45A0334";
		Branch = "mechanical";
		Address = "Peddapally";
		Mobilenum = 998928068;
		Mailid = "thoutasaicharan543@gmail.com";
		
		
		
	}
	public String getRollNo() {
		return RollNo;
	}
	public void setRollNo(String rollNo) {
		RollNo = rollNo;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getMobilenum() {
		return Mobilenum;
	}
	public void setMobilenum(long mobilenum) {
		Mobilenum = mobilenum;
	}
	public String getMailid() {
		return Mailid;
	}
	public void setMailid(String mailid) {
		Mailid = mailid;
	}
	public String getAcademicyear() {
		return Academicyear;
	}
	public void setAcademicyear(String academicyear) {
		Academicyear = academicyear;
	}
	public String getFathername() {
		return Fathername;
	}
	public void setFathername(String fathername) {
		Fathername = fathername;
	}
	public String getMothername() {
		return Mothername;
	}
	public void setMothername(String mothername) {
		Mothername = mothername;
	}
	public String getFatheroccupation() {
		return fatheroccupation;
	}
	public void setFatheroccupation(String fatheroccupation) {
		this.fatheroccupation = fatheroccupation;
	}
	void Display() {
		System.out.println("SRIRAJ DATA : ");
}
}