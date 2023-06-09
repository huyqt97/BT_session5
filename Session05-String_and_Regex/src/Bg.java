public class Bg {
    public static void main(String[] args) {
        //string
        String string = "Rikkei Academy";
        //khởi tạo đối tượng
        String str = new String("Hello");
        System.out.println(string);
        System.out.println(str);
        //gọ phuwog thức changeString
        String newString = changeString(string);
        System.out.println("chuỗi cũ : " + string);
        System.out.println("chuỗi mới : " + newString);
        // phương thức lấy độ dài chuỗi
        System.out.println(string.length());
        //phương thức charAt
        System.out.println(string.charAt(2));
        //phương thức nối chuỗi
        String str1 = string.concat(str);
        System.out.println(str1);
        // phương thức xóa koangr trắng 2 đầu
        System.out.println(string.trim()




        );
    }

    public static String changeString(String oldStr) {
        oldStr = "new" + oldStr;
        return oldStr;
    }

}
