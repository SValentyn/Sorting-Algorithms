import java.util.Scanner;

/**
 * The main class of the application. Contains a menu with a choice of the necessary sorting.
 * Sorting will be performed on an array of integers.
 *
 * @author Syniuk Valentyn
 */
public class SortsMain {
    
    public static void main(String[] args) {

        int time;
        int choice;
        int[] array = new int[20];

        Scanner in = new Scanner(System.in);
        Sorts sorts = new Sorts(array);

        System.out.print("\n<<< Array before sorting: ");
        for (int i = 0; i < 20; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + ", ");
        }

        System.out.println("\n\n<<< Selection menu of the sorting >>>");
        System.out.println("1. Sorting \"Bubble\"\n" +
                "2. Sorting \"Selection\"\n" +
                "3. Sorting \"Insertion\"\n" +
                "4. Sorting \"Comb\"\n" +
                "5. Sorting \"Shell\"\n" +
                "6. Sorting \"Stooge\"\n" +
                "7. Sorting \"Quick\"\n" +
                "8. Sorting \"Shaker\"\n" +
                "9. Sorting \"Gnome\"\n" +
                "10. Exit\n");

        System.out.print(">>> Select item: ");
        switch (in.nextInt()) {

            case 1: {
                time = (int) System.currentTimeMillis();
                sorts.bubble();
                time = (int) (System.currentTimeMillis() - time);
                System.out.println("\n<<< Lead time: " + time + " millisec.");
                break;
            }

            case 2: {
                time = (int) System.currentTimeMillis();
                sorts.selection();
                time = (int) (System.currentTimeMillis() - time);
                System.out.println("\n<<< Lead time: " + time + " millisec.");
                break;
            }

            case 3: {
                time = (int) System.currentTimeMillis();
                sorts.insertion();
                time = (int) (System.currentTimeMillis() - time);
                System.out.println("\n<<< Lead time: " + time + " millisec.");
                break;
            }

            case 4: {
                time = (int) System.currentTimeMillis();
                sorts.comb();
                time = (int) (System.currentTimeMillis() - time);
                System.out.println("\n<<< Lead time: " + time + " millisec.");
                break;
            }

            case 5: {
                time = (int) System.currentTimeMillis();
                sorts.shell();
                time = (int) (System.currentTimeMillis() - time);
                System.out.println("\n<<< Lead time: " + time + " millisec.");
                break;
            }

            case 6: {
                time = (int) System.currentTimeMillis();
                sorts.stooge(0, array.length - 1);
                time = (int) (System.currentTimeMillis() - time);
                System.out.println("\n<<< Lead time: " + time + " millisec.");
                break;
            }

            case 7: {
                time = (int) System.currentTimeMillis();
                sorts.quick(0, array.length - 1);
                time = (int) (System.currentTimeMillis() - time);
                System.out.println("\n<<< Lead time: " + time + " millisec.");
                break;
            }

            case 8: {
                time = (int) System.currentTimeMillis();
                sorts.shaker();
                time = (int) (System.currentTimeMillis() - time);
                System.out.println("\n<<< Lead time: " + time + " millisec.");
                break;
            }

            case 9: {
                time = (int) System.currentTimeMillis();
                sorts.gnome();
                time = (int) (System.currentTimeMillis() - time);
                System.out.println("\n<<< Lead time: " + time + " millisec.");
                break;
            }

            case 10: {
                System.exit(0);
                break;
            }

            default:
                System.out.println("Invalid input!");
        }

        array = sorts.getArray();
        System.out.print("<<< Array after sorting: ");
        for (int i = 0; i < 20; i++)
            System.out.print(array[i] + ", ");
    }
}
