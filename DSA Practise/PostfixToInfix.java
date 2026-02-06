// Date:06-02-2026
static String convert(String s) {
    Stack<String> stack = new Stack<>();
    for (char c : s.toCharArray()) {

        if (Character.isLetterOrDigit(c)) {
            stack.push(String.valueOf(c));
        } else {
            String b = stack.pop();
            String a = stack.pop();
            stack.push("(" + a + c + b + ")");
        }
    }
    return stack.pop();
}