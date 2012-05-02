package com.veriqual.rs;



import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name ="Account")
public class Account {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACCOUNT.userid
     *
     * @mbggenerated Fri Mar 30 09:52:48 PKT 2012
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACCOUNT.email
     *
     * @mbggenerated Fri Mar 30 09:52:48 PKT 2012
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACCOUNT.firstname
     *
     * @mbggenerated Fri Mar 30 09:52:48 PKT 2012
     */
    private String firstname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACCOUNT.lastname
     *
     * @mbggenerated Fri Mar 30 09:52:48 PKT 2012
     */
    private String lastname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACCOUNT.status
     *
     * @mbggenerated Fri Mar 30 09:52:48 PKT 2012
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACCOUNT.addr1     
     */
    private String addr1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACCOUNT.addr2     
     */
    private String addr2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACCOUNT.city    
     */
    private String city;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACCOUNT.state    
     */
    private String state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACCOUNT.zip   
     */
    private String zip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACCOUNT.country     
     */
    private String country;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACCOUNT.phone
     */
    private String phone;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCOUNT.userid
     *
     * @return the value of ACCOUNT.userid    
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCOUNT.userid
     *
     * @param userid the value for ACCOUNT.userid     
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCOUNT.email
     *
     * @return the value of ACCOUNT.email     
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCOUNT.email
     *
     * @param email the value for ACCOUNT.email     
     */
    public void setEmail(String email) {
        this.email = email == null ? "" : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCOUNT.firstname
     *
     * @return the value of ACCOUNT.firstname     
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCOUNT.firstname
     *
     * @param firstname the value for ACCOUNT.firstname     
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname == null ? "" : firstname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCOUNT.lastname
     *
     * @return the value of ACCOUNT.lastname    
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCOUNT.lastname
     *
     * @param lastname the value for ACCOUNT.lastname    
     */
    public void setLastname(String lastname) {
        this.lastname = lastname == null ? "" : lastname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCOUNT.status
     *
     * @return the value of ACCOUNT.status    
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCOUNT.status
     *
     * @param status the value for ACCOUNT.status    
     */
    public void setStatus(String status) {
        this.status = status == null ? "" : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCOUNT.addr1
     *
     * @return the value of ACCOUNT.addr1    
     */
    public String getAddr1() {
        return addr1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCOUNT.addr1
     *
     * @param addr1 the value for ACCOUNT.addr1     
     */
    public void setAddr1(String addr1) {
        this.addr1 = addr1 == null ? "" : addr1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCOUNT.addr2
     *
     * @return the value of ACCOUNT.addr2     
     */
    public String getAddr2() {
        return addr2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCOUNT.addr2
     *
     * @param addr2 the value for ACCOUNT.addr2     
     */
    public void setAddr2(String addr2) {
        this.addr2 = addr2 == null ? "" : addr2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCOUNT.city
     *
     * @return the value of ACCOUNT.city     
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCOUNT.city
     *
     * @param city the value for ACCOUNT.city    
     */
    public void setCity(String city) {
        this.city = city == null ? "" : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCOUNT.state
     *
     * @return the value of ACCOUNT.state     
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCOUNT.state
     *
     * @param state the value for ACCOUNT.state     
     */
    public void setState(String state) {
        this.state = state == null ? "" : state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCOUNT.zip
     *
     * @return the value of ACCOUNT.zip     
     */
    public String getZip() {
        return zip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCOUNT.zip
     *
     * @param zip the value for ACCOUNT.zip    
     */
    public void setZip(String zip) {
        this.zip = zip == null ? "" : zip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCOUNT.country
     *
     * @return the value of ACCOUNT.country    
     */
    public String getCountry() {
        return country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCOUNT.country
     *
     * @param country the value for ACCOUNT.country 
     */
    public void setCountry(String country) {
        this.country = country == null ? "" : country.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCOUNT.phone
     *
     * @return the value of ACCOUNT.phone  
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCOUNT.phone
     *
     * @param phone the value for ACCOUNT.phone      
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? "" : phone.trim();
    }
}
