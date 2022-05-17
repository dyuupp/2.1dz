public class BonusMilesService {
    public int calculate(int price) {
        int bonus = 20;
        int total = price / bonus;
        return total;
    }
}