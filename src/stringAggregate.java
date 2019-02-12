import java.util.ArrayList;

public class stringAggregate implements myAggregate {
	
	private ArrayList<String> myStrList = new ArrayList<String>();
	
	public stringAggregate() {
		this.myStrList.add("default");
	}
	
	@Override
	public myIterator createIterator() {
		return new concreteIterator();
	}
	
	public class concreteIterator implements myIterator {
		private int index;
		
		public concreteIterator() {
			this.index = 0;
		}
		@Override
		public boolean hasNext() {
			if (index < myStrList.size()) {
				return true;
			} else {
				return false;
			}
		}

		@Override
		public Object next() {
			if (hasNext() == true) {
				return myStrList.get(index++);
			} else {
				return null;
			}
		}
	}
}
