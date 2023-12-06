package basic;
public class Student {
    private int sId;
    private String sName;
    
    private Address address;
    
    
    public void setsId(int sId) {
        this.sId = sId;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" + "sId=" + sId + ", sName=" + sName + ", adress=" + address + '}';
    }
    
}
