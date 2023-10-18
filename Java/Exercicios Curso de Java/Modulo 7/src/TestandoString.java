public class TestandoString {
    public static void main(String[] args) {
        String frase = "Conhecimento pode te libertar do cativero";

        String[] array = frase.split(" ");

        for(int i = 0; i<=array.length ; i++){
            System.out.println("["+i+"] "+array[i]);
        }




    }



}
