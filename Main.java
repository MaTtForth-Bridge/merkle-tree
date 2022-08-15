package main;

import java.util.ArrayList;

import merkletree.MerkleTree;
import merkletree.Node;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<String> dataBlocks = new ArrayList<>();

        dataBlocks.add("abc");
        dataBlocks.add("xyz");
        dataBlocks.add("123");
        //dataBlocks.add("456");

        MerkleTree merkleTree = new MerkleTree();
        Node root = merkleTree.generate(dataBlocks);
        merkleTree.print(root);
    }
}
