public class StringsBuilders {
    public static void main(String[] args) {
        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder("Samyam");
        System.out.println(sb);
        // To set some character in it
        sb.setCharAt(0, 'A');;
        System.out.println(sb);
        //To add or insert some leter to it
        sb.insert(6, "Rimal");
        System.out.println(sb);
        //To delete some character from it
        sb.delete(5, 6);
        System.out.println(sb);
        //to add some character at the end of it
        sb.append("g");
        System.out.println(sb);
    }
}
