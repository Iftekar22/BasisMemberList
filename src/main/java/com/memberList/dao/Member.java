package com.memberList.dao;

public class Member {
	private String companyName;//
	private String basisMembershipNo;//
	private String YearOfEstablishment;
	private String address;//
	private String city;
	private String postcode;
	private String contactNo;//
	private String emai;//
	private String companyWebsite;//
	private String otherWebsitesThatBelongsToTheCompany;
	private String organizationsHeadInBangladesh;//
	private String designation;//
	private String mobile;//
	private String legalStructureOfTheCompany;
	
	
	public Member() {
		super();
	}

	public Member(String companyName, String basisMembershipNo, String yearOfEstablishment, String address, String city,
			String postcode, String contactNo, String emai, String companyWebsite,
			String otherWebsitesThatBelongsToTheCompany, String organizationsHeadInBangladesh, String designation,
			String mobile, String legalStructureOfTheCompany) {
		super();
		this.companyName = companyName;
		this.basisMembershipNo = basisMembershipNo;
		YearOfEstablishment = yearOfEstablishment;
		this.address = address;
		this.city = city;
		this.postcode = postcode;
		this.contactNo = contactNo;
		this.emai = emai;
		this.companyWebsite = companyWebsite;
		this.otherWebsitesThatBelongsToTheCompany = otherWebsitesThatBelongsToTheCompany;
		this.organizationsHeadInBangladesh = organizationsHeadInBangladesh;
		this.designation = designation;
		this.mobile = mobile;
		this.legalStructureOfTheCompany = legalStructureOfTheCompany;
	}
	
	
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getBasisMembershipNo() {
		return basisMembershipNo;
	}
	public void setBasisMembershipNo(String basisMembershipNo) {
		this.basisMembershipNo = basisMembershipNo;
	}
	public String getYearOfEstablishment() {
		return YearOfEstablishment;
	}
	public void setYearOfEstablishment(String yearOfEstablishment) {
		YearOfEstablishment = yearOfEstablishment;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmai() {
		return emai;
	}
	public void setEmai(String emai) {
		this.emai = emai;
	}
	public String getCompanyWebsite() {
		return companyWebsite;
	}
	public void setCompanyWebsite(String companyWebsite) {
		this.companyWebsite = companyWebsite;
	}
	public String getOtherWebsitesThatBelongsToTheCompany() {
		return otherWebsitesThatBelongsToTheCompany;
	}
	public void setOtherWebsitesThatBelongsToTheCompany(String otherWebsitesThatBelongsToTheCompany) {
		this.otherWebsitesThatBelongsToTheCompany = otherWebsitesThatBelongsToTheCompany;
	}
	public String getOrganizationsHeadInBangladesh() {
		return organizationsHeadInBangladesh;
	}
	public void setOrganizationsHeadInBangladesh(String organizationsHeadInBangladesh) {
		this.organizationsHeadInBangladesh = organizationsHeadInBangladesh;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getLegalStructureOfTheCompany() {
		return legalStructureOfTheCompany;
	}
	public void setLegalStructureOfTheCompany(String legalStructureOfTheCompany) {
		this.legalStructureOfTheCompany = legalStructureOfTheCompany;
	}
	
	
}
