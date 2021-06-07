/**
 * 1381. Design a Stack With Increment Operation
 * https://leetcode.com/problems/design-a-stack-with-increment-operation/
 */

class CustomStack {

  // Points to index of next element
  private int cur = -1;
  private int[] stack;

  public CustomStack(int maxSize) {
    this.cur = maxSize - 1;
    this.stack = new int[maxSize];
  }

  public void push(int x) {
    if (cur >= 0) {
      this.stack[cur--] = x;
    }
  }

  public int pop() {
    if (cur + 1 < this.stack.length) {
      return this.stack[++cur];
    }
    return -1;
  }

  public void increment(int k, int val) {
    int counter = this.stack.length - 1;
    while (counter >= 0 && k > 0) {
      this.stack[counter--] += val;
      k--;
    }
  }
}
/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
