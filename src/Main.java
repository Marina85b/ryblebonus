public class Main {
    public static void main(String[] args) {
        int amount = 1100;
        int check = 100;
        boolean isRefill = true;

        int bonus;
        if (isRefill) {
            bonus = 11;
        } else {
            bonus = 1;

        }
        int finalBonus = amount / 100;
        if (finalBonus > 100) {
            finalBonus = 100;
        }
        int balans = amount + finalBonus + check;

        {

            System.out.println("Количество бонусов:" + finalBonus);
            System.out.println("Итоговый счет:" + balans);
        }

    }
}