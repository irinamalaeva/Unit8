public class Unit8Task3v2 {
    public static void main(String[] args) {
        String words1 = "слово\nоко\nтрава\nказак\nпотоп\nнебо\nшалаш\nптица\nсолнце";

        String array[] = words1.split("\n");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            StringBuilder stringBuilder = new StringBuilder(array[i]);
            if (array[i].equals(stringBuilder.reverse().toString())) {
                System.out.println(array[i]);
            }
        }
    }
}
