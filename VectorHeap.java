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
	
	public VectorHeap(Vector<E> v) {
		int i;
		data = new Vector<E>(v.size());
		for(i = 0; i<v.size(); i++) {
			add(v.get(i));
		}
	}

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

	protected void pushDownRoot(int root) {
		//pre: 0 <= root < size
		//post: moves node at index root down
		// to appropriate position in subtree
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
	
	protected static int parent(int i) {
		return (i-1)/2;
	}
	
	//índice desde 0
	protected static int left(int i) {
		return 2*i+1;
	}
	
	//índice desde 0
	protected static int right(int i) {
		return 2*(i+1);
	}

	@Override
	public E getFirst() {
		return data.firstElement();
				
	}

	@Override
	public E remove() {
		E minVal = getFirst();
		data.set(0, data.get(data.size()-1));
		data.setSize(data.size()-1);
		if(data.size()>1) pushDownRoot(0);
		return minVal;
	}


	public void add(E value) {
		data.add(value);
		percolateUp(data.size()-1);
	}
	
	
	@Override
	public boolean isEmpty() {
		return data.isEmpty();
	}

	@Override
	public int size() {
		return data.size();
	}

	@Override
	public void clear() {
		data.clear();
		
	}
	
	
}
