package merkletree;

public class Node {
  private Node left;
  private Node right;
  private String hash;

  public Node(Node left, Node right, String hash) {
    this.left = left;
    this.right = right;
    this.hash = hash;
  }

  public Node getLeft() {
    return this.left;
  }

  public Node getRight() {
    return this.right;
  }

  public void setLeft(Node left) {
    this.left = left;
  }

  public void setRight(Node right) {
    this.right = right;
  }

  public String getHash() {
    return this.hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }
}
