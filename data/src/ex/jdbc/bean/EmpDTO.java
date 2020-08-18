package ex.jdbc.bean;

import oracle.sql.DATE;

public class EmpDTO {
	
	private int empno;
	private int mgr;
	private int sal;
	private int comm;
	private String ename;
	private String job;
	private DATE hiredate;
	
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	
	public int getEmpno() {
		return empno;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getComm() {
		return comm;
	}

	public void setComm(int comm) {
		this.comm = comm;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public DATE getHiredate() {
		return hiredate;
	}

	public void setHiredate(DATE hiredate) {
		this.hiredate = hiredate;
	}

}
