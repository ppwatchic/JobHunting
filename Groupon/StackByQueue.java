class MyQueue<E> {
  private LinkedList<E> list = new LinkedList<E>();
  
  // Time complexity: O(1)
  public void enqueue(E item) {
    list.addLast(item);
  }
  // Time complexity: O(1)
  public E dequeue() {
    return list.poll();
  }
  
  public E peek() {
    return list.get(0);
  }
  
  public int size() {
    return list.size();
  }
}

public class MyStack<E> {
  private MyQueue<E> inqueue = new MyQueue<E>();
  private MyQueue<E> bkpqueue = new MyQueue<E>();
  
  // Time complexity: O(n)
  public void push(E item) {
    if(inqueue.size()==0) {
      inqueue.enqueue(item);
    } else {
      while(inqueue.size()>0) {
        bkpqueue.enqueue(inqueue.dequeue());
      }
      inqueue.enqueue(item);
      while(bkpqueue.size()>0) {
        inqueue.inqueue(bkpqueque.dequeue());
      }
    }
  }
  
  // Time complexity: O(1)
  public E pop() {
    return inqueue.dequeque();
  }
  
  public E peek(){
    return inqueue.peek();
  }
  public boolean empty(){
    return inqueue.size()==0;
  }

}
