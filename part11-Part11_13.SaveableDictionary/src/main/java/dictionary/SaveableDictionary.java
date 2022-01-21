package dictionary;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SaveableDictionary {

    private HashMap<String, String> finnish;
    private HashMap<String, String> english;
    private final String file;

    public SaveableDictionary(String file) {
        this.finnish = new HashMap<>();
        this.english = new HashMap<>();
        this.file = file;
    }

    public SaveableDictionary() {
        this.finnish = new HashMap<>();
        this.english = new HashMap<>();
        this.file = "";
    }
    
    public void printFinnish() {
        System.out.println(this.finnish.keySet());
    }

    public String translate(String word) {
        if (this.finnish.containsKey(word)) {
            return this.finnish.get(word);
        }
        return this.english.get(word);

    }

    public void add(String word, String translation) {
        this.finnish.putIfAbsent(word, translation);
        this.english.putIfAbsent(translation, word);
    }

    public void delete(String word) {
        String tr = this.translate(word);
        if (this.english.containsKey(tr)) {
            this.english.remove(tr);
            this.finnish.remove(word);
        } else {
            this.english.remove(word);
            this.finnish.remove(tr);
        }
    }

    public boolean load() {
        try {
            Files.lines(Paths.get(this.file)).map(l -> l.split(":"))
                    .forEach(l -> this.add(l[0], l[1]));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean save() {
        try {
            FileWriter fw = new FileWriter(this.file);
            for (Map.Entry<String, String> entry : this.finnish.entrySet()) {
               fw.append(entry.getKey() + ":" + entry.getValue() + "\n");
            }
            fw.close();
            return true;
        } catch (Exception e) {
           return false;
        }
    }
}
