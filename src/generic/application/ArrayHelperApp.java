package generic.application;

import generic.util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {

        String[] names = {"Komeng", "Kysa", "Tri"};
        Integer[] numbers = {1,2,3,4,5};

        System.out.println(ArrayHelper.count(names));
        System.out.println(ArrayHelper.count(numbers));

    }
}
