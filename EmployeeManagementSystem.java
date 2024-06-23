package Projects;

public class EmployeeManagementSystem implements Comparable<EmployeeManagementSystem>{

	int eId;
	String eName;
	String job;
	String mgr;
	String hireDate;
	double sal;
	double comm;
	int deptNo;
	
	
	public EmployeeManagementSystem(int eId, String eName, String job, String mgr, String hireDate, double sal,
			double comm, int deptNo) {
		this.eId = eId;
		this.eName = eName;
		this.job = job;
		this.mgr = mgr;
		this.hireDate = hireDate;
		this.sal = sal;
		this.comm = comm;
		this.deptNo = deptNo;
	}

	public int geteId() {
		return eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(int eId, String eName) {
		if (this.eId==eId) {
			this.eName = eName;
			System.out.println("Name Updated Successfully");
		} else {
			System.out.println("Invalid Id");
		}
		
	}

	public String getJob() {
		return job;
	}

	public void setJob(int eid,String job) {
		if (this.eId==eId) {
			this.job = job;
			System.out.println("job Updated Successfully");
		} else {
			System.out.println("Invalid Id");
		}
		
	}

	public String getMgr() {
		return mgr;
	}

	public void setMgr(int eid,String mgr) {
		if (this.eId==eId) {
			this.mgr=mgr;
			System.out.println("job Updated Successfully");
		} else {
			System.out.println("Invalid Id");
		}
		
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(int eid,String hireDate) {
		if (this.eId==eId) {
			this.hireDate = hireDate;
			System.out.println("job Updated Successfully");
		} else {
			System.out.println("Invalid Id");
		}
		
	}

	public double getSal() {
		return sal;
	}

	public void setSal(int eid,double sal) {
		if (this.eId==eId) {
			this.sal = sal;
			System.out.println("job Updated Successfully");
		} else {
			System.out.println("Invalid Id");
		}

	}

	public double getComm() {
		return comm;
	}

	public void setComm(int eid,double comm) {
		if (this.eId==eId) {
			this.comm = comm;
			System.out.println("job Updated Successfully");
		} else {
			System.out.println("Invalid Id");
		}
		
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int eid,int deptNo) {
		if (this.eId==eId) {
			this.deptNo = deptNo;
			System.out.println("job Updated Successfully");
		} else {
			System.out.println("Invalid Id");
		}
	}

	@Override
	public String toString() {
		return " [eId=" + eId + ", eName=" + eName + ", deptNo=" + deptNo + "]";
	}

	@Override
	public int compareTo(EmployeeManagementSystem o) {
		// TODO Auto-generated method stub
		return this.eName.compareTo(o.eName);
	}

	

	
	
	
	
}
