
public class Main {
    public static void main(String[] args) {
        //task1
        int[] expenses = {18000, 23000, 5000, 105000, 32500};
        int sum = 0;
        for (int exp1 : expenses) {
            sum += exp1;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        //task2
        int[] expenses2 = {43000, 98000, 35000, 187983, 14283};
        int maxExpense = -1;
        for (final int current : expenses2) {
            if (current > maxExpense) {
                maxExpense = current;
            }
        }
        int minExpense = maxExpense;
        for (final int current2 : expenses2) {
            if (current2 < minExpense) {
                minExpense = current2;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpense + " рублей. " +
                "Максимальная сумма трат за неделю составила " + maxExpense + " рублей ");
        //task3
        int[] expenses3 = {950500, 443000, 450000, 936852, 1832500};
        int sum3 = 0;
        for (int exp3 : expenses3) {
            sum3 += exp3;
        }
        double averageExpenses = (double) sum3 / expenses3.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpenses + " рублей");
        //task4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}