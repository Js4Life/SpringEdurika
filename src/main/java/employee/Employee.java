package employee;

import Address.Address;

public class Employee {
    int eid;
    String ename;
    Address address;

    public Address getAddress() {
        return address;
    }

    // setter injection
    public void setAddress(Address address) {
        this.address = address;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", address=" + address +
                '}';
    }

    public Employee(){
        System.out.println("--Employee Object Constructed");
    }

    // Constructor injection
    public Employee(Address address) {
        this.address = address;
    }



    public void myInit() {
        System.out.println("--Object Initialized");
    }

    public void myDestroy() {
        System.out.println("--Object Destroyed");
    }
}
