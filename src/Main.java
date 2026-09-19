//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Task 1");
        int firstFriday = 2;
        int currentDay = 1;
        for (; currentDay <= 31; currentDay++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            if ((currentDay - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + currentDay + "-е число. Необходимо подготовить отчет.");
            }
        }
        System.out.println();
        //Задача 2.1
        System.out.println("Task 2.1");
        int totalDistance = 42195;
        int fixedDistance = 500;
        int passedDistance = 0;
        do {
            System.out.println("Держитесь! Осталось " + totalDistance + " метров.");
            totalDistance = totalDistance - fixedDistance;
            passedDistance = passedDistance + fixedDistance;
        } while (totalDistance > 0);
        System.out.println();
//Задача 2.2
        System.out.println("Task 2.2");
        int myDistance = 0;
        int fullDistance = 42195;
        for (; myDistance < fullDistance; myDistance += 500) {
            System.out.println("Держитесь! Осталось " + (fullDistance - myDistance) + " метров.");
        }
        System.out.println();

        //Задача 3.1
        System.out.println("Task 3.1");
        int budget = 2500;
        int parkingDays = 0;
        int costOfParking = 100;
        while (budget >= 100) {
            parkingDays ++;
            if (parkingDays % 5 != 0) {
                budget -= costOfParking;
            }
        }
        if (budget < 100) {
            System.out.println("Вам хватит на " + parkingDays + " день парковки.");
        }
        System.out.println();
        //Задача 3.2
        System.out.println("Task 3.2");
        int daysOfParking = 0;
        int priceOfParking = 100;
        int parkingBudget = 3000;
        for (; parkingBudget > 0; daysOfParking++) {
            if ((daysOfParking + 1) % 5 == 0) {
                continue;
            }
            parkingBudget = parkingBudget - priceOfParking;
        }
        System.out.println("Количество дней на парковке: " + daysOfParking);
    }
}