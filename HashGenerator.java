package merkletree;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashGenerator {
  public static String getEncryptedDataBlock(String dataBlock) {
    return encryptDataBlock(dataBlock);
  }

  private static String encryptDataBlock(String dataBlock) {
    try {
      MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
      messageDigest.update(dataBlock.getBytes());
      
      byte[] hashBytes = messageDigest.digest();

      StringBuilder stringBuilder = new StringBuilder();
      for (int i = 0; i < hashBytes.length; i++) {
        stringBuilder.append(Integer.toString((hashBytes[i] & 0xff) + 0x100, 16).substring(1));
      }

      return stringBuilder.toString();
    } catch (NoSuchAlgorithmException ae) {
      return ae.toString();
    }
  }
}