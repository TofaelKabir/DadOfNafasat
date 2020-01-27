package collectionFrameWork;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class UseOfArrayList {

	public static void main(String[] args) {
		
	
		//getting new ArrayList -by default contractor-->initial capacity 10 
		ArrayList ar= new ArrayList();
        ar.add("Sohag"); // in [0]
        ar.add("Tofayel");
        ar.add(5); //different data type is allowed
        ar.add(""); //null is allowed
        ar.add("Farhana");
        ar.add("Orfat");
        ar.add("Rahman");
        ar.add("Imran");
        ar.add(5.5); //duplicate value is allowed
        ar.add('M');
        ar.add(5,"Nafasat"); //replacing value: adding in index [5]
        ar.add(5.5);//------------it is [10]--now capacity will be increased (ic*(3/2)+1=16
        /* now ar[] indext is 16 capacity  when we need to add for 10th index it jvm will create new array with capacity 16
        elements of the prev. array will be shifted to new array & old array will be ready for garbage collection*/
              
        //to see the size
        System.out.println(ar.size());
        //remove()
        ar.remove(1);
        //print by using get()//for single element
        System.out.println(ar.get(0));
        
        //to print all elements (for loop, for each loop, iterator()
        for(int i=0;i<ar.size();i++) {
        	System.out.println(ar.get(i));
        }
        
        //generic comes in java 1.5 -> by defining the type
        UseOfArrayList<String> ar1= new UseOfArrayList();
        ar1.add("Monir");
        
        //user-defined class obj--see the StudyGroup Class
        //Creating obj of the StudyGroup Class by parameterized constructor and passing value:
        StudyGroup s1=new StudyGroup("Muhammad",50,"Tofayel");
        StudyGroup s2=new StudyGroup("Muhammad",40,"Sharif");
        StudyGroup s3=new StudyGroup("Muhammad",30,"Sohag");
        StudyGroup s4=new StudyGroup("Muhammad",30,"Sohag");
        //now we can put the obj of the StudyGroup type obj (s1,s2,s3,s4))
        UseOfArrayList<StudyGroup> ar3=new UseOfArrayList<StudyGroup>();
        ar3.add(s1);
        ar3.add(s2);
        ar3.add(s3);
 
        //print by using for each loop/enhanced for loop/advanced for loop
        for(StudyGroup s 	:ar3) {
        	System.out.println(s.fname+ " "+s.lname+" "+s.age); }
        
        //using->addAll()
        UseOfArrayList ar5=new UseOfArrayList(); //creaing new ArrayList
        ar5.add("A");
        ar5.add("B");
        ar5.add("C");
        
        //applied addAll() in ar[]-->now in ar[] we have also ar5[] value too
        ar.addAll(ar5);
        System.out.println("After using addAll method: ");
        Iterator ar7= ar.iterator();
        while(ar7.hasNext()) {
        	System.out.println(ar7.next());
        }
        
        
        
/*    //removeAll():
          ar.removeAll(ar5);
          Iterator ar8= ar.iterator();
          while(ar7.hasNext()) {
          System.out.println(ar7.next());*/
        
        
        //retainAll()--only keeps common value between two ArrayList obj
        
        	UseOfArrayList<String> ar9=new UseOfArrayList(); //creating new ArrayList
        	ar9.add("Sohag"); //-------this is common
        	ar9.add("Rahman");
        	ar9.add("salma");
        	//apply retainAll():
        	ar.retainAll(ar9);
        	//ar9.retainAll(ar); //we can also do 
        	for(int i=0;i<ar.size();i++) {
        		System.out.println("After using retainAll: "+ar.get(i));
        	}
        	}
	}
