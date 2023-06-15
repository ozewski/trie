import java.util.HashMap;

public class Trie {
    private TrieNode root;  // the root node of the tree - all other nodes are children of this

    public Trie() {
        // initialize tree with empty root
        root = new TrieNode();
    }

    public TrieNode getRoot() {
        // return root of tree
        return root;
    }

    public void insert(String word) {
        TrieNode node = root;  // store the node we are currently processing
        for (int i = 0; i < word.length(); i++) {
            // iterate for every letter in the word
            char c = word.charAt(i);  // get character at that point in the word
            HashMap<Character, TrieNode> children = node.getChildren();  // get current node's children
            if (children.containsKey(c)) {
                // if the node already contains the key, no need to make a new node
                node = children.get(c);  // fetch existing node
            } else {
                // if the node does not contain the needed key,
                TrieNode newNode = new TrieNode(c);  // create a new node associated with the character
                children.put(c, newNode);  // add new node to the target's children
                node = newNode;  // reassign top-level node to be the new child
            }
        }
        node.setLeaf(true);  // final node - set it as a leaf
    }

    public boolean search(String word) {
        TrieNode node = root;  // store the top level node
        for (int i = 0; i < word.length(); i++) {
            HashMap<Character, TrieNode> children = node.getChildren();  // store node's children
            char c = word.charAt(i);  // get current character in word
            if (children.containsKey(c))  // if character found,
                node = children.get(c);  // store current node as that character
            else  // otherwise, no match
                return false;  // we know it is not a match at this point
        }
        return node.isLeaf();  // ensure that our final node is a word terminus
    }
}
