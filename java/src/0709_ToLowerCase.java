class Solution {
  public String toLowerCase(String str) {
    StringBuilder builder = new StringBuilder();
    for(char c : str.toCharArray()) {
      if (c >= 'A' && c <= 'Z') {
        builder.append((char) (c + 0x20));
      } else {
        builder.append(c);
      }
    }

    return builder.toString();
  }
}
