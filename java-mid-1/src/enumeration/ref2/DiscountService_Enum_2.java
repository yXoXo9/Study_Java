package enumeration.ref2;

public class DiscountService_Enum_2 {
    public int discount(Grade grade, int price) {
        return price * grade.getDiscountPercent() / 100;
    }
}
