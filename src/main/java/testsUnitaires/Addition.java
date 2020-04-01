package testsUnitaires;

public class Addition {

	public int additionner(Integer i, Integer j) {
		
		
		if (i == null && j == null) return 0;
		if (i == null) return j;
		if (j == null) return i;
		return i + j;
	}
	
	
}
