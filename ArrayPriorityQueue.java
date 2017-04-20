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
        _queue.add( newInt );
    }

    public boolean isEmpty(){ return _queue.size() == 0; }

    //
    public Integer peekMin(){
        int min = _queue.get( 0 );
        for( int i: _queue ){
            if( i < min ){
                min = i;
            }
        }
        return min;
    }

    public Integer removeMin(){
        int minPos = 0;
        for( int i = 0; i < _queue.size(); i++ ){
            if( _queue.get( i ) < _queue.get( minPos ) ){
                minPos = i;
            }
            if( _queue.get( minPos ) == 0 ){ break; }
        }
        return _queue.remove( minPos );
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
