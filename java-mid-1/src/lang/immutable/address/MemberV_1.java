package lang.immutable.address;

public class MemberV_1 {

    private String name;
    private Address address; // 변경 가능한 클래스

    public MemberV_1(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "MemberV_1{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
