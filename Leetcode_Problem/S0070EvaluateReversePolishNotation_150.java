// Date:23-02-2025
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String num:tokens){
            if(num.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }else if(num.equals("-")){
                stack.push(-(stack.pop()-stack.pop()));
            }else if(num.equals("*")){
                stack.push(stack.pop()*stack.pop());
            }else if(num.equals("/")){
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first/second);
            }else{
                stack.push(Integer.parseInt(num));
            }
        }
        return stack.peek();
    }
}