import java.util.Scanner;

public class GiaTriLonTrongMang {
    public static void main(String[] args) {
        System.out.println("phần mềm tìm số lớn nhất và vị trí :");

        int size;            //kích thước độ dài
        int[] array;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter a size");       // nhập chiều dài của chuỗi
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println(" số thứ " + (i + 1));
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.println("danh sách tài sản: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        int max = array[0];
        int index = 1;
        for (int j = 1; j < array.length; j++) {
            if (max < array[j]) {
                max = array[j];
                index = j + 1;
            }
        }System.out.printf("The largest property value in the list is " + max + " at position "+ index );
    }
}





