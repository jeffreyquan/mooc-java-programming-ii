/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author jeffreyquan
 */
public class SaveableDictionary {

    private Map<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }

    public boolean load() {
        try {
            File newFile = new File(this.file);
            Scanner fileReader = new Scanner(newFile);
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");

                this.add(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void add(String word, String translation) {
        if (this.dictionary.containsKey(word) || this.dictionary.containsValue(word)) {
            return;
        }

        this.dictionary.put(word, translation);
    }

    public String translate(String word) {
        String translation = null;
        
        for (Map.Entry<String, String> entry : this.dictionary.entrySet()) {
            if (entry.getKey().equals(word)) {
                translation = entry.getValue();
            } else if (entry.getValue().equals(word)) {
                translation = entry.getKey();
            }
        }
        
        return translation;
    }

    public void delete(String word) {
        String translation = this.dictionary.get(word);
        if (this.dictionary.containsKey(word)) {
            this.dictionary.remove(word);
        } else if (this.dictionary.containsValue(word)) {
            this.dictionary.remove(this.translate(word));
        }
    }

    public boolean save() {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(this.file);
            for (Map.Entry<String, String> entry : this.dictionary.entrySet()) {
                String word = entry.getKey();
                String translation = entry.getValue();
                writer.println(word + ":" + translation);
            }              
        } catch (Exception e) {
            return false;
        } finally {
            writer.close();
            return true;
        }
    }
}
