import java.util.Scanner;

public class SortsMain {
    public static void main(String[] args) {

        int time;
        int choice;
        int[] array = new int[20];

        Scanner in = new Scanner(System.in);
        Sorts sorts = new Sorts(array);

        System.out.print("\n<<< Массив до сортировки: ");
        for (int i = 0; i < 20; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + ", ");
        }

        System.out.println("\n\n<<< Сортировка массива >>>");
        System.out.println("1. Сортировка \"Пузырьком\"\n" +
                "2. Сортировка \"Выбором\"\n" +
                "3. Сортировка \"Вставками\"\n" +
                "4. Сортировка \"Расчёска\"\n" +
                "5. Сортировка \"Шелла\"\n" +
                "6. Сортировка \"Stooge\"\n" +
                "7. Сортировка \"Quick\"\n" +
                "8. Сортировка \"Shaker\"\n" +
                "9. Сортировка \"Gnome\"\n" +
                "10. Выход\n");


        System.out.print(">>> Выберите пункт: ");
        choice = in.nextInt();

        switch (choice) {

            case 1: {
                System.out.println("Выбрали – сортировку \"Пузырьком\"!");
                time = (int) System.currentTimeMillis();
                sorts.bubble();
                time = (int) (System.currentTimeMillis() - time);
                System.out.println("\n<<< Время выполнения: " + time + " millisec.");
                break;
            }

            case 2: {
                System.out.println("Выбрали – сортировку \"Выбором\"!");
                time = (int) System.currentTimeMillis();
                sorts.selection();
                time = (int) (System.currentTimeMillis() - time);
                System.out.println("\n<<< Время выполнения: " + time + " millisec.");
                break;
            }

            case 3: {
                System.out.println("Выбрали – сортировку \"Вставками\"!");
                time = (int) System.currentTimeMillis();
                sorts.insertion();
                time = (int) (System.currentTimeMillis() - time);
                System.out.println("\n<<< Время выполнения: " + time + " millisec.");
                break;
            }

            case 4: {
                System.out.println("Выбрали – сортировку \"Расчёска\"!");
                time = (int) System.currentTimeMillis();
                sorts.comb();
                time = (int) (System.currentTimeMillis() - time);
                System.out.println("\n<<< Время выполнения: " + time + " millisec.");
                break;
            }

            case 5: {
                System.out.println("Выбрали – сортировку \"Шелла\"!");
                time = (int) System.currentTimeMillis();
                sorts.shell();
                time = (int) (System.currentTimeMillis() - time);
                System.out.println("\n<<< Время выполнения: " + time + " millisec.");
                break;
            }

            case 6: {
                System.out.println("Выбрали – сортировку \"Stooge\"!");
                time = (int) System.currentTimeMillis();
                sorts.stooge(0, array.length - 1);
                time = (int) (System.currentTimeMillis() - time);
                System.out.println("\n<<< Время выполнения: " + time + " millisec.");
                break;
            }

            case 7: {
                System.out.println("Выбрали – сортировку \"Quick\"!");
                time = (int) System.currentTimeMillis();
                sorts.quick(0, array.length - 1);
                time = (int) (System.currentTimeMillis() - time);
                System.out.println("\n<<< Время выполнения: " + time + " millisec.");
                break;
            }

            case 8: {
                System.out.println("Выбрали – сортировку \"Shaker\"!");
                time = (int) System.currentTimeMillis();
                sorts.shaker();
                time = (int) (System.currentTimeMillis() - time);
                System.out.println("\n<<< Время выполнения: " + time + " millisec.");
                break;
            }

            case 9: {
                System.out.println("Выбрали – сортировку \"Gnome\"!");
                time = (int) System.currentTimeMillis();
                sorts.gnome();
                time = (int) (System.currentTimeMillis() - time);
                System.out.println("\n<<< Время выполнения: " + time + " millisec.");
                break;
            }

            case 10:
                break;

            default:
                System.out.println("Неверный ввод!");
        }

        array = sorts.getArray();
        System.out.print("<<< Массив после сортировки: ");
        for (int i = 0; i < 20; i++)
            System.out.print(array[i] + ", ");
    }
}
