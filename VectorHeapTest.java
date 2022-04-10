import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VectorHeapTest {

	@Test
	public void add() {
		VectorHeap<Paciente> vector = new VectorHeap<>();
		Paciente pac = new Paciente("Nicolle", "Escobar", "A");
		vector.add(pac);
		System.out.println(vector.getFirst().toString());
		assertEquals(pac, vector.getFirst());
	}
	
	@Test
	public void remove() {
		VectorHeap<Integer> vector = new VectorHeap<>();
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.remove();
		assertEquals(2, vector.getFirst());
	}

}
