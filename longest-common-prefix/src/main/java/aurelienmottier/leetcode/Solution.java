package aurelienmottier.leetcode;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public String longestCommonPrefix(final String[] words) {
        final Trie trie = new Trie(words);
        return trie.longestCommonPrefix(trie.root);
    }

    private static class Trie {

        private final TrieNode root = new TrieNode();

        private Trie(final String[] words) {

            for (final String word : words) {
                TrieNode currentNode = this.root;
                if (word.isEmpty()) currentNode.add("");
                else {
                    for (final char character : word.toCharArray()) {
                        final String letter = String.valueOf(character);
                        final TrieNode childNode = currentNode.children.get(letter);
                        if (childNode != null) currentNode = childNode;
                        else currentNode = currentNode.add(letter);
                    }
                    currentNode.willEndHere();
                }
            }

        }

        private String longestCommonPrefix(final TrieNode node) {

            if (node.hasNoChild() || node.hasChildren()) return "";

            if (node.isWordEnd && node.hasOneSingleChild()) return "";

            final String onlyChildKey = node.children.keySet().iterator().next();
            final TrieNode onlyChildNode = node.children.get(onlyChildKey);

            if(node.isWordEnd && onlyChildNode.hasNoChild()) return "";

            return onlyChildKey + this.longestCommonPrefix(onlyChildNode);

        }

    }

    private static class TrieNode {

        private boolean isWordEnd;
        private final Map<String, TrieNode> children = new HashMap<>();

        public TrieNode add(final String letter) {
            final TrieNode newNode = new TrieNode();
            this.children.put(letter, newNode);
            return newNode;
        }

        public void willEndHere() {
            this.isWordEnd = true;
        }

        public boolean hasNoChild() {
            return this.children.isEmpty();
        }

        public boolean hasChildren() {
            return this.children.size() > 1;
        }

        public boolean hasOneSingleChild() {
            return this.children.size() == 1;
        }
        
    }

}