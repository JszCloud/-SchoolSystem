package com.titular.model;

import java.util.Date;

public class Student {
    
    private Integer studentno;

   
    private String loginpwd;

    
    private String studentname;

    
    private Boolean sex;

    private Integer gradeid;

    
    private String phone;

    
    private String address;

    
    private Date borndate;

    private String email;

    
    private String identitycard;

   
    public Integer getStudentno() {
        return studentno;
    }

    
    public void setStudentno(Integer studentno) {
        this.studentno = studentno;
    }

    
    public String getLoginpwd() {
        return loginpwd;
    }

    
    public void setLoginpwd(String loginpwd) {
        this.loginpwd = loginpwd == null ? null : loginpwd.trim();
    }

    public String getStudentname() {
        return studentname;
    }

    
    public void setStudentname(String studentname) {
        this.studentname = studentname == null ? null : studentname.trim();
    }

   
    public Boolean getSex() {
        return sex;
    }

    
    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Integer getGradeid() {
        return gradeid;
    }

   
    public void setGradeid(Integer gradeid) {
        this.gradeid = gradeid;
    }

   
    public String getPhone() {
        return phone;
    }

    
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    
    public Date getBorndate() {
        return borndate;
    }

    public void setBorndate(Date borndate) {
        this.borndate = borndate;
    }

    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    
    public String getIdentitycard() {
        return identitycard;
    }

    
    public void setIdentitycard(String identitycard) {
        this.identitycard = identitycard == null ? null : identitycard.trim();
    }


	public Student() {
		super();
	}


	public Student(Integer studentno) {
		super();
		this.studentno = studentno;
	}


	public Student(String loginpwd, String studentname, Boolean sex, Integer gradeid, String phone, String address,
			Date borndate, String email, String identitycard) {
		super();
		this.loginpwd = loginpwd;
		this.studentname = studentname;
		this.sex = sex;
		this.gradeid = gradeid;
		this.phone = phone;
		this.address = address;
		this.borndate = borndate;
		this.email = email;
		this.identitycard = identitycard;
	}


	public Student(Integer studentno, String loginpwd, String studentname, Boolean sex, Integer gradeid, String phone,
			String address, Date borndate, String email, String identitycard) {
		super();
		this.studentno = studentno;
		this.loginpwd = loginpwd;
		this.studentname = studentname;
		this.sex = sex;
		this.gradeid = gradeid;
		this.phone = phone;
		this.address = address;
		this.borndate = borndate;
		this.email = email;
		this.identitycard = identitycard;
	}


	@Override
	public String toString() {
		return "Student [studentno=" + studentno + ", loginpwd=" + loginpwd + ", studentname=" + studentname + ", sex="
				+ sex + ", gradeid=" + gradeid + ", phone=" + phone + ", address=" + address + ", borndate=" + borndate
				+ ", email=" + email + ", identitycard=" + identitycard + "]";
	}
}