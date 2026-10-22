public static void main(String[] args) {
    // 1 ცელსიუსი ფარენჰაიტში

//    double celsius = 60;
//    double farenheit = (celsius * 1.8) + 32;
//
//    System.out.println("Temperature in Farenheit: " + farenheit);


    // 2 ფარენჰაიტი ცელსიუსში

//    double farenheit = 54;
//    double celsius = (farenheit - 32) * 5 / 9;
//
//    System.out.println("Temperature in Celsius: " + celsius);


    // 3

//    int year = 2100;
//
//    if (year % 400 == 0) {
//        System.out.println("ნაკიანია");
//    } else if (year % 100 == 0) {
//        System.out.println("ნაკიანი არ არის");
//    } else if (year % 4 == 0) {
//        System.out.println("ნაკიანია");
//    } else {
//        System.out.println("ნაკიანი არ არის");
//    }


    // 4

//    int num1 = -71;
//    int num2 = 26;
//
//    if (num1 > 0 & num2 > 0) {
//        System.out.println("პირველ მეოთხედში");
//    } else if (num1 < 0 & num2 > 0) {
//        System.out.println("მეორე მეოთხედში");
//    } else if (num1 < 0 & num2 < 0) {
//        System.out.println("მესამე მეოთხედში");
//    } else if (num1 > 0 & num2 < 0) {
//        System.out.println("მეოთხე მეოთხედში");
//    }


    // 5

    char operator = '/';
    double a = 10;
    double b = 5;

    if (operator == '+') {
        System.out.println(a + b);
    } else if (operator == '-') {
        System.out.println(a - b);
    } else if (operator == '*') {
        System.out.println(a * b);
    } else if (operator == '/') {
        System.out.println(a / b);
    } else {
        System.out.println("არასწორი ოპერაცია");
    }
}
