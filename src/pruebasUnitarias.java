/**
 * @author Boggdan Barrientos, Diego De Leon, Jasmin Valdez
 * @15 de agosto de 2015
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class pruebasUnitarias {

	@Test
	public void test() throws Exception {
		fail("Not yet implemented");
		
		StackVector vector = new StackVector();
		StackArrayList arrayList = new StackArrayList();
		StackSE Senlazada = new StackSE();
		StackDE Denlazada = new StackDE();
		StackC circular = new StackC();
		
		assertEquals(vector.isEmpty(), arrayList.isEmpty());
		
		assertEquals(arrayList.isEmpty(), Senlazada.isEmpty());
		
		assertEquals(Senlazada.isEmpty(), Denlazada.isEmpty());
		
		assertEquals(Denlazada.isEmpty(), circular.isEmpty());
		
		assertEquals(circular.isEmpty(), vector.isEmpty());
		
		assertNotNull(circular.size());
		
		assertNotNull(vector.size());
		
		assertNotNull(arrayList.size());
		
		assertNotNull(Senlazada.size());
		
		assertNotNull(Denlazada.size());
		
		assertEquals(vector, vector);
		
		vector.push(1);
		assertEquals(1,vector.pop());
		
		circular.push(5);
		assertEquals(5,circular.pop());
		
	}

}
