package people.model;

public class People {
	private Integer PEOPLE_ID;
	private String FIRST_NAME;
	private String LAST_NAME;
	private String COMPANY_NAME;
	private String ADDRESS;
	private String CITY;
	private String COUNTRY;
	private String PEOPLE_STATE;
	private Float ZIP;
	private String PHONE;
	private String EMAIL;
	
	public Integer getPEOPLE_ID() {
		return PEOPLE_ID;
	}
	public void setPEOPLE_ID(Integer pEOPLE_ID) {
		PEOPLE_ID = pEOPLE_ID;
	}
	public String getFIRST_NAME() {
		return FIRST_NAME;
	}
	public void setFIRST_NAME(String fIRST_NAME) {
		FIRST_NAME = fIRST_NAME;
	}
	public String getLAST_NAME() {
		return LAST_NAME;
	}
	public void setLAST_NAME(String lAST_NAME) {
		LAST_NAME = lAST_NAME;
	}
	public String getCOMPANY_NAME() {
		return COMPANY_NAME;
	}
	public void setCOMPANY_NAME(String cOMPANY_NAME) {
		COMPANY_NAME = cOMPANY_NAME;
	}
	public String getADDRESS() {
		return ADDRESS;
	}
	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}
	public String getCITY() {
		return CITY;
	}
	public void setCITY(String cITY) {
		CITY = cITY;
	}
	public String getCOUNTRY() {
		return COUNTRY;
	}
	public void setCOUNTRY(String cOUNTRY) {
		COUNTRY = cOUNTRY;
	}
	public String getPEOPLE_STATE() {
		return PEOPLE_STATE;
	}
	public void setPEOPLE_STATE(String pEOPLE_STATE) {
		PEOPLE_STATE = pEOPLE_STATE;
	}
	public Float getZIP() {
		return ZIP;
	}
	public void setZIP(Float zIP) {
		ZIP = zIP;
	}
	public String getPHONE() {
		return PHONE;
	}
	public void setPHONE(String pHONE) {
		PHONE = pHONE;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof People) {
			People other = (People) obj;
			boolean samepId = (this.id == other.getId());
			boolean sameEmail = this.email.equals(other.getEmail());
			boolean sameFName = this.fName.equals(other.getfName());
			boolean sameLName = this.lName.equals(other.getlName());
			
			if(sameId && sameEmail && sameFName && sameLName)
				return true;
			else
				return false;
		} else {
			return false;
		}
	}
	
//	private Integer PEOPLE_ID;
//	private String FIRST_NAME;
//	private String LAST_NAME;
//	private String COMPANY_NAME;
//	private String ADDRESS;
//	private String CITY;
//	private String COUNTRY;
//	private String PEOPLE_STATE;
//	private Float ZIP;
//	private String PHONE;
//	private String EMAIL;
	
}
