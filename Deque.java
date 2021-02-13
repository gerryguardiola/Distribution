@SuppressWarnings("unchecked")
public class Deque<Item> {
    private Item[] deque;

    /***
     *constructor: create an empty Deque with initial
     *capacity of 10
     */
    public Deque() {
	//TO BE IMPLEMENTED
    }

    /***
     *constructor: create an empty Deque with initial
     *capacity of n
     */
    public Deque(int n) {
	//TO BE IMPLEMENTED
    }
    
    /***
     *add an item to the front of the Deque
     *double the array capacity if Deque is full
     */
    public void addToFront(Item item) {
	//TO BE IMPLEMENTED
    }

    /***
     *add an item to the back of the Deque;
     *double the array capacity if the Deque is full
     ***/
    public void addToBack(Item item) {
	//TO BE IMPLEMENTED
    }

    /***
     *remove and return the front item from the Deque;
     *throw EmptyDequeException if the Deque is empty;
     *reduce the array capacity by half if the size 
     *of the Deque size falls below floor(N/4) where
     *N is the array capacity, but do not resize it 
     *to be below the default capacity, which is 10
     ***/
    public Item getFirst() throws EmptyDequeException {
	//TO BE IMPLEMENTED
    }

     /***
     *remove and return the back item from the Deque;
     *throw EmptyDequeException if the Deque is empty;
     *reduce the array capacity by half if the size 
     *of the Deque size falls below floor(N/4) where
     *N is the array capacity, but do not resize it 
     *to be below the default capacity, which is 10
     ***/
    public Item getLast() throws EmptyDequeException {
	//TO BE IMPLEMENTED
    }
    
    /***
     *return true if the Deque is empty;
     *return false if the Deque is not empty
     ***/
    public boolean isEmpty() {
	//TO BE IMPLEMENTED
    }

    /***
     *return the size of the Deque (i.e. the 
     *number of elements currently in the Deque)
     ***/
    public int size() {
	//TO BE IMPLEMENTED
    }

    /***
     *return but do not remove the front item in the Deque;
     *throw an EmptyDequeException if the Deque is empty
     */
    public Item peekFirst() throws EmptyDequeException {
	//TO BE IMPLEMENTED
    }

    /***
     *return but do not remove the back item in the Deque;
     *throw an EmptyDequeException if the Deque is empty
     */
    public Item peekLast() throws EmptyDequeException {
	//TO BE IMPLEMENTED
    }
    
    /***
     *return the underlying array
     ***/
    public Item[] getArray() {
	//TO BE IMPLEMENTED
    }

    /***
     *return the array accesses count
     ***/
    public int getAccessCount() {
	//TO BE IMPLEMENTED
    }
    
    /***
     *reset the array access count to 0
     ***/
    public void resetAccessCount() {
	//TO BE IMPLEMENTED
    }
    
    public static void main(String[] args) {
	//TO BE IMPLEMENTED
    }	
}
