import java.util.Scanner;

public class Bt2 {
    public static void main(String[] args) {
//   Viết một chương trình Java để kiểm tra xem một chuỗi có phải là một
//   địa chỉ email hợp lệ hay không, sử dụng regex. Một địa chỉ email hợp
//   lệ có thể có dạng "username@OrganizationName.
//   area symbol". Vd: rikeiacademy@rikkeisoft.com
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập Email : ");
        String email = sc.nextLine();
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        if(email.matches(regex)) {
            System.out.println(email + " Email đúng!");
        }else{
            System.out.println(email + " Email không hợp lệ!");
        }
    }
}
