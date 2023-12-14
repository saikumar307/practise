package org.EducationInformation;

import org.College.CollegeDetails;
import org.Company.CompanyInfo;

public class Medicine {
	private void physiyo() {
		System.out.println("Bachelor of Physiotherapy");
		
	}
	private void dental() {
		System.out.println("dentist");
}
	private void mbbs() {
		System.out.println("doctor");
	}
	public static void main(String[] args) {
		Medicine m = new Medicine();
		m.dental();
		m.mbbs();
		Engineering e = new Engineering();
		e.bE();
		e.bTech();
		CollegeDetails cd = new CollegeDetails();
		cd.collegeName();
		cd.collegeCode();
		cd.collegeRank();
		CompanyInfo ci = new CompanyInfo();
		ci.compName();
		ci.compId();
	
	}
}