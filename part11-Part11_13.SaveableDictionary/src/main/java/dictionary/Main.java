package dictionary;

public class Main {

    public static void main(String[] args) {
        System.out.println("salam");
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        boolean wasSuccessful = dictionary.load();

        if (wasSuccessful) {
            System.out.println("Successfully loaded the dictionary from file");
        }
        dictionary.printFinnish();
        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("ohjelmointi"));
        System.out.println(dictionary.translate("alla oleva"));
    }
}
