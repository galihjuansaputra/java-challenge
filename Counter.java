public class Counter {

    public static void main(String[] args) {
        counting("Contoh string untuk mencari huruf besar, kecil, angka 12345, dan simbol !@#$%^");
    }
    
    public static void counting(String str){
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int numberCount = 0;
        int symbolCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                upperCaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseCount++;
            } else if (Character.isDigit(ch)) {
                numberCount++;
            } else {
                symbolCount++;
            }
        }

        System.out.println("uppercase: " + upperCaseCount);
        System.out.println("lowercase: " + lowerCaseCount);
        System.out.println("angka: " + numberCount);
        System.out.println("simbol: " + symbolCount);
    }
}
