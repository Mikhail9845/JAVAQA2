public class Main {
    public static void main(String[] args) {

        int account = 100;// Объявляете переменные для входных данных и
        int amount = 1159;// параметров программы: начального счёта,
        int bonus = amount / 100;
        int sum = account + amount;
        if (amount >= 1000){
            System.out.println("Вас счет =  " + sum);
            System.out.println("Ваш бонус = " + bonus );
        }
        else {System.out.println("Вас счет = " + sum );
        System.out.println("Ваш бонус = 0");}
    }
}