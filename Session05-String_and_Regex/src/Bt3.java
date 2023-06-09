import java.util.Arrays;
import java.util.Scanner;

public class Bt3 {
    static Scanner scanner = new Scanner(System.in);
    static int[] arr1 = {1, 2, 3, 4, 5, 6};
    static int[] arr2 = {3, 35, 2, 3, 53};
    static int[] arr3 = {2, 34, 21, 46, 2};

    public static void main(String[] args) {
        int choice = 0;
        while (choice != 5) {
            System.out.println("1. Hiển thị các mảng số nguyên");
            System.out.println("2. Gộp 2 mảng số nguyên");
            System.out.println("3. Gộp 3 mảng số nguyên");
            System.out.println("4. Hiển thị và thao tác với mảng");
            System.out.println("5. Dừng chương trình");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayArrays();
                    break;
                case 2:
                    int[] mergedArray = mergeArrays();
                    System.out.println("Mảng sau khi gộp: " + Arrays.toString(mergedArray));
                    break;
                case 3:
                    int[] mergedArray3 = mergeAllArrays();
                    System.out.println("Mảng sau khi gộp 3 mảng: " + Arrays.toString(mergedArray3));
                    break;
                case 4:
                    displaySingleArray();
                    break;
                case 5:
                    System.out.println("Đã dừng chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        }
    }

    private static void displayArrays() {
        System.out.println("Mảng 1: " + Arrays.toString(arr1));
        System.out.println("Mảng 2: " + Arrays.toString(arr2));
        System.out.println("Mảng 3: " + Arrays.toString(arr3));
    }

    private static int[] mergeArrays() {
        System.out.print("Nhập số mảng thứ nhất (1-3): ");
        int array1Choice = scanner.nextInt();
        int[] array1 = selectArray(array1Choice);

        System.out.print("Nhập số mảng thứ hai (1-3): ");
        int array2Choice = scanner.nextInt();
        int[] array2 = selectArray(array2Choice);

        int[] mergedArray = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

        return mergedArray;
    }

    private static int[] mergeAllArrays() {
        int[] mergedArray = new int[arr1.length + arr2.length + arr3.length];
        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);
        System.arraycopy(arr3, 0, mergedArray, arr1.length + arr2.length, arr3.length);

        return mergedArray;
    }

    private static void displaySingleArray() {
        System.out.print("Nhập số mảng bạn muốn hiển thị (1-3): ");
        int arrayChoice = scanner.nextInt();
        int[] selectedArray = selectArray(arrayChoice);
        System.out.println("Mảng " + arrayChoice + ": " + Arrays.toString(selectedArray));

        System.out.println("1. Thêm một phần tử vào cuối");
        System.out.println("2. Thêm một phần tử vào đầu");
        System.out.println("3. Xóa một phần tử ở vị trí được chọn");
        System.out.println("4. Quay lại");

        System.out.print("Nhập lựa chọn của bạn: ");
        int actionChoice = scanner.nextInt();

        switch (actionChoice) {
            case 1:
                int[] newArray1 = addElementToEnd(selectedArray);
                updateArray(arrayChoice, newArray1);
                break;
            case 2:
                int[] newArray2 = addElementToStart(selectedArray);
                updateArray(arrayChoice, newArray2);
                break;
            case 3:
                int[] newArray3 = removeElement(selectedArray);
                updateArray(arrayChoice, newArray3);
                break;
            case 4:
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
                break;
        }
    }

    private static int[] addElementToEnd(int[] array) {
        System.out.print("Nhập phần tử muốn thêm: ");
        int element = scanner.nextInt();

        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;

        System.out.println("Mảng sau khi thêm phần tử: " + Arrays.toString(newArray));

        return newArray;
    }

    private static int[] addElementToStart(int[] array) {
        System.out.print("Nhập phần tử muốn thêm: ");
        int element = scanner.nextInt();

        int[] newArray = new int[array.length + 1];
        newArray[0] = element;
        System.arraycopy(array, 0, newArray, 1, array.length);

        System.out.println("Mảng sau khi thêm phần tử: " + Arrays.toString(newArray));

        return newArray;
    }

    private static int[] removeElement(int[] array) {
        System.out.print("Nhập vị trí phần tử muốn xóa: ");
        int position = scanner.nextInt();

        if (position < 0 || position >= array.length) {
            System.out.println("Vị trí không hợp lệ.");
            return array;
        }

        int[] newArray = new int[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, position);
        System.arraycopy(array, position + 1, newArray, position, newArray.length - position);

        System.out.println("Mảng sau khi xóa phần tử: " + Arrays.toString(newArray));

        return newArray;
    }

    private static int[] selectArray(int arrayChoice) {
        switch (arrayChoice) {
            case 1:
                return arr1;
            case 2:
                return arr2;
            case 3:
                return arr3;
            default:
                System.out.println("Số mảng không hợp lệ.");
                return null;
        }
    }

    private static void updateArray(int arrayChoice, int[] newArray) {
        switch (arrayChoice) {
            case 1:
                arr1 = newArray;
                break;
            case 2:
                arr2 = newArray;
                break;
            case 3:
                arr3 = newArray;
                break;
            default:
                System.out.println("Số mảng không hợp lệ.");
                break;
        }
    }
}

