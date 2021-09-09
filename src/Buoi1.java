public class Buoi1 {
    public static void main(String[] args) {
        /*
            1 :Kiểu dữ liệu
            comment code =>đoạn này không thực thi(ctrl + / )
            String(Kiểu chuỗi) ,
             int(kiểu số nguyên) ,
             long(giống số nguyên mà kích thước lớn hơn)ư
             float(kiểu số thực =>số có phần thập phân 1.2)
             double(kiểu số thực nhưng kích thước lớn hơn kiểu float)
             boolean(kiểu luận lý tại vì chỉ có 2 giá trị là true hoặc false)


            type variable = value
            String name = "Nguyễn Văn Tèo";
            int number = 5;
            long number2 = 10L;
            float number3 = 1.5f;
            double number4 = 1.5;
            boolean isChecked = true;

            Hàm - phương thức
            ctrl + shilt + f10
            System.out.println("Kiểu String " + name);
            System.out.println("Kiểu int " + number);
            System.out.println("Kiểu long " + number2);
            System.out.println("Kiểu float " + number3);
            System.out.println("Kiểu double " + number4);
            System.out.println("Kiểu boolean " + isChecked);

            2 :Toán tử
            int a = 5;
            int b = 5;

            int ketQua = (a++) - (--b) + (--a) - (a--) + (b--) - (b--);
            5 - (--b) + (--a) - (a--) + (b--) - (b--) =>a = 6, b = 5
            5 - 4 + (--a) - (a--) + (b--) - (b--) =>a = 6, b = 4
            5 - 4 + 5 - (a--) + (b--) - (b--) =>a = 5, b = 4
            5 - 4 + 5 - 5 + (b--) - (b--) =>a = 4, b = 4
            5 - 4 + 5 - 5 + 4 - (b--) =>a = 4, b = 3
            5 - 4 + 5 - 5 + 4 - 3 =>a = 4, b = 2
            2 =>a = 4, b = 2
            System.out.println("Giá trị của a " + a);
            System.out.println("Giá trị của b " + b);
            System.out.println("Kết quả biểu thức " + ketQua);

            3 : Câu điều kiện if else
            int a = 5;
            if (a > 0){
                System.out.println("A lớn hơn 0");
            }else{
                System.out.println("A bé hoặc bằng 0");
            }
            int age = 18;
            if (age >= 18){
                System.out.println("Lứa tuổi vị thành niên");
            }else{
                System.out.println("Lứa tuổi dưới vị thành niên");
            }
             >= 18 : "Lứa tuổi vị thành niên"
             < 18 : "Lứa tuổi dưới vị thành niên"

            int a = 4;
            int b = 5;

             a - b > 0 => 1
             a - b < 0 => -1
             a - b == 0 => 0

            if (a - b > 0){
                System.out.println("1");
            }else if (a - b < 0){
                System.out.println("-1");
            }else {
                System.out.println("0");
            }
            int number1 = 0;
            int number2 = 0;

             number1 lớn hơn 0 và number1 bằng number2
            if (number1 > 0 && number1 == number2){
                System.out.println("Number1 lớn hơn 0 và bằng number2");
            }else{
                System.out.println("Không thỏa");
            }

            Biểu thức 3 ngôi
            int a = 5;
            int b = 10;

            bieuthuc ? bieuthuc true :bieuthuc false

            String message = a > b ? "A lớn B" : "A bé hơn hoặc bằng B";
            System.out.println(message);

            int age = 20;

            age >= 18 :Vị thành niên
            age< 18 :Dưới vị thành niên

            String message = age >= 18 ? "Vị thành niên" : "Dưới vị thành niên";
            System.out.println(message);

            4 : Câu điều kiện switch case

            int month = 20;
            switch (month){
                case 1 :
                case 2 :
                case 3 :
                    System.out.println("Quý 1");
                    break;
                case 4:
                case 5:
                case 6:
                    System.out.println("Quý 2");
                    break;
                case 7:
                case 8:
                case 9:
                    System.out.println("Quý 3");
                    break;
                case 10:
                case 11:
                case 12:
                    System.out.println("Quý 4");
                    break;
                default:
                    System.out.println("Không thuộc quý");
                    break;
            }
            System.out.println("Tiếp tục xử lý");

            int idCard = 3;
            int total = 200000;
            // idcard
            // Nếu là 1 -> giảm 10%
            // Nếu là 2 -> giảm 15%
            // Nếu là 3 -> giẩm 20%
            // Không thỏa -> Không có giảm giá

            // Xuất
            // Giảm bao nhiêu phần trăm
            // Tổng tiền phải trả = 180000
            String message = "";
            float percentSale = 0.0f;

            switch (idCard) {
                case 1:
                    message = "Giảm 10%";
                    percentSale = 0.1f;
                    break;
                case 2:
                    message = "Giảm 15%";
                    percentSale = 0.15f;
                    break;
                case 3:
                    message = "Giảm 20%";
                    percentSale = 0.2f;
                    break;
                default:
                    message = "Không được giảm giá";
                    percentSale = 0f;
            }

            System.out.println(message);
            System.out.println("Tổng tiền " + (total - (total * percentSale)));

            5 :Mảng array không tăng hoặc giảm kích thước của mảng
            Vị trí bắt đầu từ 0
            trụy cập phần tử trong mảng
            mang[index]

            kieudulieu[] tenbien =

            Cách khai báo 1 :biết trước phần tử trong mảng
            String[] arrayNames = {"Tèo", "Tí", "Tủn"};


            System.out.println(arrayNames[0]);


            Cách khai báo 2 :chỉ biết kích thước nhưng chưa biết giá trị cụ thể của phần tử
            int[] arrayPercentSales = new int[10];
            arrayPercentSales[0] = 10;
            System.out.println(arrayPercentSales[0]);
         */
        // 6 : Vòng lặp for
//        String[] arrayNames = {"Tèo", "Tí", "Tủn" ,"Tuấn" , "Lan" ,"Điệp"};
//
//        for(int i = 0 ; i < arrayNames.length ; i++ ){
//            System.out.println(arrayNames[i]);
//        }

        // % chia lay dư
        // / chia lấy phần nguyên
//        int a = 5;
//        int b = 3;
//        int ketQua = a % b;
//
//        System.out.println(ketQua);

        // Sử dụng vòng lặp for duyệt từ 1 -> 100
        // in ra các số chẳn

        for (int i = 1 ; i <= 100 ; i++){
            if ( i % 2 == 0){
                System.out.println(i);
            }
        }




    }

}

