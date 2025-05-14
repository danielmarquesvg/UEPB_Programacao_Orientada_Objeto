package aula15_TesteUnidade;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import junit.framework.Assert;

public class AlunoTeste {
	
	@Test
	public void testeNome() {
		//Fixture
		Aluno aluno1 = new Aluno("Daniel", 123);
		
		//Chamada do método e o Assert
		assertNotEquals("daniel", aluno1.getNome());
		assertEquals("DanielL", aluno1.getNome());
		assertNotEquals("DANIEL", aluno1.getNome());
		
		aluno1.setNome("Maria");
		assertNotEquals("maria", aluno1.getNome());
		assertEquals("Maria", aluno1.getNome());
		assertNotEquals("MARIA", aluno1.getNome());
		
		
	}
	
	@Test
	public void testeMatricula() {
		//Fixture
		Aluno aluno1 = new Aluno("Daniel", 123);
				
		//Chamada do método e o Assert
		assertNotEquals(122, aluno1.getMatricula());
		assertEquals(123, aluno1.getMatricula());
		assertNotEquals(124, aluno1.getMatricula());
	}

}
