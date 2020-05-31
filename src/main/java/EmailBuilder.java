public class EmailBuilder {
    public static void main(String[] args) {

        /*Цикл для генерации email с случайным наборов букв*/
        for (int i = 1; i < 2000 ; i++) {
            char symbol = (char)(97 + (int)(Math.random()*26));
            System.out.println(symbol);
        }

    }
 
}
