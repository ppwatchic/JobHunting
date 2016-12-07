// Reference: http://stackoverflow.com/questions/69192/how-to-implement-a-queue-using-two-stacks
public class Queue<E> {
  private Stack<E> inbox = new Stack<E>();
  private Stack<E> outbox = new Stack<E>();

  public void queue(E e) {
    inbox.push(E);
  }
  
  public E dequeue( ) {
    if(outbox.empty()) {
      while(!inbox.empty()) {
        outbox.push(inbox.pop());
      }
    }
    outbox.pop();
  }
}
  
