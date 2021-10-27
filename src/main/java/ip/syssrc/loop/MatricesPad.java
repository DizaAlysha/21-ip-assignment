package ip.syssrc.loop;

/**
 * MatricesPad
 *
 * Assignment 2.1
 *
 * @author H071211086 - Diza Alysha Zahra <dizalysha@gmail.com>
 *
 */

public class MatricesPad {

    public static void main(String[] args) {
        Scanner Dz = new Scanner(System.in);

        int start = Dz.nextInt();
        int end = Dz.nextInt();
        int size = Dz.nextInt();

        int range = end - start;
        int temp = start;

        if (start <= 9 && end <= 9) {
            if (range >= 0) {
                for (int i = 1; i <= range / size; i++) {
                    for (int j = 1; j <= size; j++) {
                        System.out.printf("%01d ", temp);
                        temp++;
                    }
                    System.out.println("");
                }
                for (int k = 0; k <= range % size; k++) {
                    System.out.printf("%01d ", temp);
                    temp++;
                }
            } else if (range <= 0) {
                for (int i = 1; i <= -range / size; i++) {
                    for (int j = 1; j <= size; j++) {
                        System.out.printf("%01d ", temp);
                        temp--;
                    }
                    System.out.println("");
                }
                for (int k = 0; k <= -range % size; k++) {
                    System.out.printf("%01d ", temp);
                    temp--;
                }
            }
        } else if (start <= 99 && end <= 99) {
            if (range >= 0) {
                for (int i = 1; i <= range / size; i++) {
                    for (int j = 1; j <= size; j++) {
                        System.out.printf("%02d ", temp);
                        temp++;
                    }
                    System.out.println("");
                }
                for (int k = 0; k <= range % size; k++) {
                    System.out.printf("%02d ", temp);
                    temp++;
                }
            } else if (range <= 0) {
                for (int i = 1; i <= -range / size; i++) {
                    for (int j = 1; j <= size; j++) {
                        System.out.printf("%02d ", temp);
                        temp--;
                    }
                    System.out.println("");
                }
                for (int k = 0; k <= -range % size; k++) {
                    System.out.printf("%02d ", temp);
                    temp--;
                }
            }
        } else if (start <= 999 && end <= 999) {
            if (range >= 0) {
                for (int i = 1; i <= range / size; i++) {
                    for (int j = 1; j <= size; j++) {
                        System.out.printf("%03d ", temp);
                        temp++;
                    }
                    System.out.println("");
                }
                for (int k = 0; k <= range % size; k++) {
                    System.out.printf("%03d ", temp);
                    temp++;
                }
            } else if (range <= 0) {
                for (int i = 1; i <= -range / size; i++) {
                    for (int j = 1; j <= size; j++) {
                        System.out.printf("%03d ", temp);
                        temp--;
                    }
                    System.out.println("");
                }
                for (int k = 0; k <= -range % size; k++) {
                    System.out.printf("%03d ", temp);
                    temp--;
                }
            }
        }

        Dz.close();
    }
}