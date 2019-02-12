
public class TestIterator {
	
	public static void main(String[] args) {
		myAggregate test1 = new stringAggregate();
		
		myIterator ti1 = test1.createIterator();
		
		while(ti1.hasNext()) {
			System.out.println(ti1.next());
		}
	}
}
