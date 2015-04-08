
public class IteratorTest {

	public static void main(String[] args){
		PersonRepository p = new PersonRepository();
		
		for(Iterator i = p.getIterator(); i.hasNext();){
			String name = (String)i.next();
			System.out.println(name);
		}
	}
}
