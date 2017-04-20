/*
Team INSERT NAME HERE- Arif Rotkim, Tim Wang, Allan Wang
APCS2 PD4
HW #32 Getting Past the Velvet Rope
2017-4-19
*/

/* Implementation details:
 *  
 */
import java.util.ArrayList;
public class ArrayPriorityQueue implements PriorityQueue{

    private ArrayList<Integer> _queue;

    public ArrayPriorityQueue(){
        _queue = new ArrayList<Integer>();
    }

    // Add item to end of ArrayList
    public void add(Integer newInt){
        _queue.add(newInt);
	int walk = _queue.size()-1;
	while (walk != 0 && _queue.get(walk) > _queue.get(walk-1)){
	    _queue.set(walk,_queue.set(walk-1,_queue.get(walk)));
	    walk--;
	}
    }

    public boolean isEmpty(){ return _queue.size() == 0; }

    //
    public Integer peekMin(){
        return _queue.get(_queue.size()-1);
    }

    public Integer removeMin(){
        return _queue.remove( _queue.size()-1 );
    }

    public String toString(){
        String retStr = "";
        for( int i: _queue ){
            retStr += i + " ";
        }
        return retStr;
    }

    public static void main( String[] args){
        ArrayPriorityQueue bob = new ArrayPriorityQueue();
        System.out.println( "Enqueueing people..." );
        bob.add( 0 );
        bob.add( 1 );
        bob.add( 0 );
        bob.add( 2 );
        bob.add( 0 );
        bob.add( 1 );
        bob.add( 0 );
        bob.add( 3 );
        bob.add( 1 );
        System.out.println( bob );
        while( ! bob.isEmpty() ){
            System.out.println( "Queue: " + bob );
            System.out.println( "Minimum value: " + bob.peekMin() );
            System.out.println( "Removed: " + bob.removeMin() );
            System.out.println();
        }
    }//end main

}//end class ArrayPriorityQueue
