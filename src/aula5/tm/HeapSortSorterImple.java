package aula5.tm;

import java.util.Comparator;

public class HeapSortSorterImple<T> implements Sorter<T>{
    @Override
    public void sort(T[] arr, Comparator<T> c) {
        heapsort(arr, c);
    }

    public void heapsort( T arr[], Comparator<T> c) {
        for( int i = arr.length / 2; i >= 0; i-- )  /* buildHeap */
            percDown( arr, c, i, arr.length );
        for( int i = arr.length - 1; i > 0; i-- )
        {
            swapReferences( arr, 0, i );            /* deleteMax */
            percDown( arr, c, 0, i );
        }
    }
    
    private int leftChild( int i ) {
        return 2 * i + 1;
    }

    private void percDown( T arr[], Comparator<T> c, int i, int n ) {
        int child;
        T tmp;
        for( tmp = arr[ i ]; leftChild( i ) < n; i = child )
        {
            child = leftChild( i );
            if( child != n - 1 && c.compare(arr[child], arr[child + 1]) < 0 )
                child++;
            if( c.compare(tmp, arr[child]) < 0 )
                arr[ i ] = arr[ child ];
            else
                break;
        }
        arr[ i ] = tmp;
    }
    /**
     * Method para trocar elementos em um array.
     */
    public final void swapReferences( T a[], int index1, int index2 ) {
        T tmp = a[ index1 ];
        a[ index1 ] = a[ index2 ];
        a[ index2 ] = tmp;
    }
    
    public static void main(String[] args) {
        HeapSortSorterImple<Integer> hs = new HeapSortSorterImple<>();

        Integer[] arr={90,23,101,45,65,23,67,89,34,23};

        hs.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        for(int i : arr) {
            System.out.println(i);
        }
    }
}
