/**
  Implement an insertion sort, in the Sorters structure
 */
import java.util.ArrayList;

public class InsertionSorter extends Sorter {


  public InsertionSorter(ArrayList<String> usersData){
	super(usersData);
	mySort();
	}

  public void mySort(){
        for(int index = 1; index < elements.size(); index ++){
            insert(elements, index);
        }
    }

    private boolean insert(ArrayList<String> list, int alreadyInserted){
        String valueToBeInsert = list.get(alreadyInserted);
        for(int indexOfValueToBeCompared = alreadyInserted - 1; indexOfValueToBeCompared > -1; indexOfValueToBeCompared --){
            System.out.println(list);
            System.out.println("Comparing " + valueToBeInsert + "  at index " + indexOfValueToBeCompared +  " with " + list.get(indexOfValueToBeCompared));
            if(indexOfValueToBeCompared == 0 && valueToBeInsert.compareTo(list.get(indexOfValueToBeCompared)) < 0){
                System.out.println("Replacing " + list.get(indexOfValueToBeCompared)
                                    + " with " + valueToBeInsert);
                shiftToRight(list, indexOfValueToBeCompared);
                list.set(0, valueToBeInsert);
                return true;
            }
            if(valueToBeInsert.compareTo(list.get(indexOfValueToBeCompared)) < 0){
                shiftToRight(list, indexOfValueToBeCompared);
            }
            else{
                //dropValue()
                list.set(indexOfValueToBeCompared + 1, valueToBeInsert);
                return true;
            }
        }
        return true;
    }

    private void shiftToRight(ArrayList<String> list, int index){
        list.set(index + 1, list.get(index));
        list.set(index, null);
    }

}
