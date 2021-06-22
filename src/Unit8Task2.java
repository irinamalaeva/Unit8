public class Unit8Task2 {
    public static void main(String[] args) {
       String line = "Summer holidays are more longer then autumn holiday";
       char letter1 = line.charAt(0);
       char letter2 = line.charAt(3);
       System.out.println("letter1 :" +  letter1 + "; letter2: " + letter2);
       String line2 = line.replace(letter2, letter1);
       System.out.println(line2);


    }
}
