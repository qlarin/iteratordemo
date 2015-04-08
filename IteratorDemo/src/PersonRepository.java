
public class PersonRepository implements Container {

	public String names[] = {"Adam", "Margaret", "Elizabeth", "Ann", "Julie", "Mark"};

	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}
	
	public class NameIterator implements Iterator{

		int id;

		@Override
		public boolean hasNext() {
			if(id < names.length){
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext()){
				return names[id++];
			}
			return null;
		}
	}
}
