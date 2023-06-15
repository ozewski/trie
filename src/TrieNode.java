import java.util.HashMap;

public class TrieNode {
    private char c;  // char associated with node
    private HashMap<Character, TrieNode> children = new HashMap<>();  // array of child nodes
    private boolean isLeaf;  // does this node represent the end of a word?

    public TrieNode() {}  // create empty node

    public TrieNode(char c) {
        // constructor - assign char to node
        this.c = c;
    }

    public HashMap<Character, TrieNode> getChildren() {
        // return node's children
        return children;
    }

    public void setChildren(HashMap<Character, TrieNode> children) {
        // set's node's children
        this.children = children;
    }

    public boolean isLeaf() {
        // returns whether the node is the end of a word
        return isLeaf;
    }

    public void setLeaf(boolean isLeaf) {
        // set node's leaf status
        this.isLeaf = isLeaf;
    }

    public String toString() {
        String prompt =  "<Node ";
        if (isLeaf)
            prompt += "leaf ";  // add leaf status to readout
        return prompt + this.children + ">";  // add children to readout
    }
}
