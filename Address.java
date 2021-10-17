package com.company;

class Address{
    private int flatNo;
    private String bldg;
    private String street;
    private String city;
    private int pincode;

    public void setFlatNo(int flatNo){
        this.flatNo=flatNo;
    }
    public int getFlatNo(){
        return flatNo;
    }
    public void setBuildingName(String bldg ){
        this.bldg=bldg;
    }
    public String getBuildingName(){
        return bldg;
    }
    public void setStreetName(String street){
        this.street=street;
    }
    public String getStreetName(){
        return street;
    }
    public void setCity(String city){
        this.city=city;
    }
    public String getCity(){
        return city;
    }
    public void setPincode(int pincode)
    {
        this.pincode=pincode;
    }
    public int getPincode(){
        return pincode;
    }



}