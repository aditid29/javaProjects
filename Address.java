package com.company;

class Address{
    private String area;
    private String city;
    private int pincode;

     Address(String area,String city,int pincode){
         this.area=area;
         this.city=city;
         this.pincode=pincode;
     }


    public void setArea(String area){
        this.area=area;
    }
    public String getArea(){
        return area;
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
