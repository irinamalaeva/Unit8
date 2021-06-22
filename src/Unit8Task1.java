public class Unit8Task1 {
    public static void main(String[] args) {
        StringBuffer strBuffer = new StringBuffer("june is summer month! ");
        String letter1 = "j";
        String letter2 = "m";
        int  number1 = strBuffer.indexOf(letter1);
        int  number2 = strBuffer.lastIndexOf(letter2);
        System.out.println("number1 = "+  number1 + "; number2 = " +  number2 );
        strBuffer.delete(number1,number2 );
        System.out.println(strBuffer);
    }
}
