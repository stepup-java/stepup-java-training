package classroom_trainings.Collection;

import java.util.ArrayList;

public class Collection_Training {
    public static void main(String[] args) {
        //read-retrive
        //create a collection
        ArrayList<Integer> numbers = new ArrayList<>();
        //insert the elements        create
        numbers.add(11);
        numbers.add(64);     //we can give n number of elemnt
        numbers.add(51);
        numbers.add(48);

        //read the collection
        System.out.println(numbers);
        System.out.println(numbers.get(0));

        //update
        numbers.set(1, 211);
        System.out.println(numbers);

        //delete
        numbers.remove(2);
        System.out.print(numbers);

        //utility methods
        System.out.println(numbers.size());

        //exception
        //System.out.println(numbers.get(10));

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i * 2));
            //System.out.println(numbers.get(i) * 2);
        }


    }
    }
