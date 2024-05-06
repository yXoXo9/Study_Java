package enumeration.ref3;

public class DiscountService_Enum_2 {
    public int discount(Grade grade, int price) {
        // return price * grade.getDiscountPercent() / 100;
        return grade.discount(price);
    }
}
