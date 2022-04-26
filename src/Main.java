public class Main {
    public static void main(String[] args) {
        int ticketCost = 1000; //Стоимость билета
        int bonus = 20; //Количество рублей для одной бонусной милли

        int miles = (ticketCost / bonus);

        System.out.println("Вам начислены мили:" + (miles));

    }
}
