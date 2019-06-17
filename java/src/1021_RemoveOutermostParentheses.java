class Solution {
  public String removeOuterParentheses(String S) {
    int indent = 0;
    StringBuilder builder = new StringBuilder();
    for(char c : S.toCharArray()) {
      indent += c == '(' ? 1 : -1;

      if (!((c == '(' && indent == 1) || (c == ')' && indent == 0))) {
        builder.append(c);
      }
    }

    return builder.toString();
  }
}
