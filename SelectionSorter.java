import java.util.ArrayList;

public class SelectionSorter extends Sorter{


	public SelectionSorter(ArrayList<String> usersData){
	super(usersData);
	mySort();
	}

	public void mySort(){
		ArrayList<String> sortedList = new ArrayList<String>();
		while (sortedList.size() < elements.size()) { 
			int nextLargerAt = champIndex( elements);
			String min = elements.get(nextLargerAt);
			sortedList.add(min);
			elements.set(nextLargerAt, null);
	}
		elements = sortedList;
}

	private int champIndex( ArrayList<String> challengers) {
		int smallestIndex = 0;
		while(challengers.get(smallestIndex) == null) {
			smallestIndex++;
		}
		String min = challengers.get(smallestIndex);
		int minIndex = 0;
		for(int index = 0; index < challengers.size(); index++) {
			if (challengers.get(index) != null) {
			if(challengers.get(index).compareTo(min) <= 0) minIndex = index;
			}
		}
		return minIndex;
				
		}


}
