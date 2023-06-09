import java.util.Scanner;

public class Bt1 {
    public static void main(String[] args) {
        //Viết một chương trình Java nhận một chuỗi từ người
        // dùng và tách các từ trong chuỗi đó. Sau đó, in ra
        // từng từ trên một dòng.

        Scanner sc = new Scanner(System.in);
        System.out.println("nhập một chuỗi bất kỳ: ");
        String str = sc.nextLine();
        String []arrs = str.split("");
        for (String arr:arrs){
            System.out.println(arr);
        }

    }
}
