package myPack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("companyBean")
public class Company {
	
	String companyNm;

	@Autowired
	public String getCompanyNm() {
		return companyNm;
	}

	@Autowired
	public void setCompanyNm(String companyNm) {
		this.companyNm = companyNm;
	}

	@Override
	public String toString() {
		return "Company [companyNm=" + companyNm + "]";
	}
}