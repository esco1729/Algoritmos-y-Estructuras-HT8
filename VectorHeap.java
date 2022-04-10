import java.util.Vector;
/**
 * Clase para manejar una cola con prioridad (PriorityQueue) basada en un Heap
 * @author liter
 *
 * @param <E>
 */
public class VectorHeap<E extends Comparable<E>> implements PriorityQueue<E> {
	protected Vector<E> data;
	public VectorHeap() {
		data = new Vector<E>();
	}
	
	/**
	 * M�todo de construcci�n de un nuevo priority en un vector
	 * @param v
	 */
	public VectorHeap(Vector<E> v) {
		int i;
		data = new Vector<E>(v.size());
		for(i = 0; i<v.size(); i++) {
			add(v.get(i));
		}
	}
	/**
	 * M�todo para mover el nodo hacia una posici�n determinada 
	 * @param leaf
	 */
	private void percolateUp(int leaf) {
		int parent = parent(leaf);
		E value = data.get(leaf);
		while(leaf > 0 && value.compareTo(data.get(parent))<0) {
			data.set(leaf, data.get(parent));
			leaf = parent;
			parent = parent(leaf);
			
		}
		data.set(leaf, value);
	}
	/**
	 * Mueve el nodo hacia abajo en el subtree
	 * @param root
	 */
	protected void pushDownRoot(int root) {
		{
			int heapSize = data.size();
			E value = data.get(root);
			while(root<heapSize) {
				int childpos = left(root);
				if(childpos < heapSize) {
					if ((right(root) < heapSize) &&
							((data.get(childpos+1)).compareTo
							(data.get(childpos)) < 0))
					{
						childpos++;
					}
					//Assert: childpos indexes smaller of two children
					if ((data.get(childpos)).compareTo(value)<0)
					{ 
						data.set(root, data.get(childpos));
						root = childpos;
					}
					else {
						data.set(root, value);
						return;
					}
				}else {
					data.set(root,value);
					return;
				}
			}
		}
		
		
	}
	/**
	 * Regresa al padre de un node en una ubicaci�n i
	 * @param i
	 * @return
	 */
	protected static int parent(int i) {
		return (i-1)/2;
	}
	
	/**
	 * Regresa el �ndice del hijo izquierdo del nodo en la localizaci�n i
	 * @param i
	 * @return
	 */
	//�ndice desde 0
	protected static int left(int i) {
		return 2*i+1;
	}
	/**
	 * Regresa el �ndice del hijo derecho del nodo en la localizaci�n i
	 * @param i
	 * @return
	 */
	//�ndice desde 0
	protected static int right(int i) {
		return 2*(i+1);
	}

	@Override
	public E getFirst() {
		return data.firstElement();
				
	}
	/**
	 * Regresa y retira el m�nimo valor del queue 
	 */
	@Override
	public E remove() {
		E minVal = getFirst();
		data.set(0, data.get(data.size()-1));
		data.setSize(data.size()-1);
		if(data.size()>1) pushDownRoot(0);
		return minVal;
	}

	/**
	 * A�ade un valor al queue
	 */
	public void add(E value) {
		data.add(value);
		percolateUp(data.size()-1);
	}
	
	/**
	 * Regresa el m�nimo valor en el priority queue
	 */
	@Override
	public boolean isEmpty() {
		return data.isEmpty();
	}
	/**
	 * Regresa el n�mero de elementos
	 */
	@Override
	public int size() {
		return data.size();
	}
	/**
	 * Elimina los elementos del queue
	 */
	@Override
	public void clear() {
		data.clear();
		
	}
	
	
}
