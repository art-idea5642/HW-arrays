
public class Main {
    public static void main(String[] args) {
        //task1
        int[] expenses = {18000, 23000, 5000, 105000, 32500};
        int sum = 0;
        for (int exp1 : expenses) {
            sum += exp1;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }
}