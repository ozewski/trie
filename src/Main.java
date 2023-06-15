import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> names = new HashMap<>();
        names.put("Michael", "Douglas");
        names.put("Steven", "Samuels");
        names.put("Robert", "Scott");
        System.out.println(names);
        Trie trie = new Trie();
        trie.insert("cat");
        trie.insert("cab");
        trie.insert("city");
        System.out.println(trie.search("car"));
        System.out.println(trie.search("city"));
    }
}