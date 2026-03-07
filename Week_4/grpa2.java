/*


Implement the code as instructed in the comments, such that it satisfies the given test cases.
*/

package Week_4;
import java.util.*;

interface Iterator{
    public boolean has_next();
    public Object get_next();
}

class Sequence{
    private final int maxLimit = 80;
    private SeqIterator _iter = null;
    int[] iArr; 
    int size;
//implement the parameterized constructor to initialize size
    public Sequence(int size){
        if(size > maxLimit)
            this.size = maxLimit;
        else
            this.size = size;
        iArr = new int[this.size];
    }
//implement addTo(elem) to add an int elem to the sequence
    int counter = 0;
    public void addTo(int elem){
        if(counter < size){
            iArr[counter] = elem;
            counter++;
        }
    }
//implement get_Iterator() to return Iterator object
    public Iterator get_Iterator(){
        if(_iter == null)
            _iter = new SeqIterator();
        return _iter;
    }
    private class SeqIterator implements Iterator{
        int indx;
        public SeqIterator(){
            indx = -1;
        }
        //implement has_next()
        public boolean has_next(){
            return(indx + 1) < counter;
        }
        //implement get_next()
        public Object get_next(){
            indx++ ;
            return iArr[indx];
        }
    }
}

class grpa2{
    public static void main(String[] args) {
        Sequence sObj = new Sequence(5);
        Scanner sc = new Scanner(System.in); 
        for(int i = 0; i < 5; i++) {
            sObj.addTo(sc.nextInt());
        }
        Iterator i = sObj.get_Iterator();
        while(i.has_next())
            System.out.print(i.get_next() + ", ");
    }
}