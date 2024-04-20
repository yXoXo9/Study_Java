package lang.immutable.address;

public class MemberV_2 {

    private String name;
    private ImmutableAddress address; // 불변 클래스 사용

    public MemberV_2(String name, ImmutableAddress address) {
        this.name = name;
        this.address = address;
    }

    public void setAddress(ImmutableAddress address) {
        this.address = address;
    }

    public ImmutableAddress getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "MemberV_2{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
