package application;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;

public class Dictionary {
    private ArrayList<String> words;
    private HashMap<String, String> translations;
    
    public Dictionary() {
        this.words = new ArrayList<>();
        this.translations = new HashMap<>();
        
        this.add("salam", "hello");
    }
    
    public void add(String word, String translation) {
        if (!this.words.contains(word)) {
            this.words.add(word);
        }
        this.translations.put(word, translation);
    }
    
    public String get(String word) {
        return this.translations.get(word);
    }
    
    public String getRandomWord() {
        Random rand = new Random();
        return this.words.get(rand.nextInt(this.words.size()));
    }
}
