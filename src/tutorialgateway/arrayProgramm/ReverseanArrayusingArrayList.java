package tutorialgateway.arrayProgramm;

import java.util.*;

public class ReverseanArrayusingArrayList {

    public static void main(String[] args) {
        String[] typesOfInsurance = {"Life Insurance", "Car Insurance", "Health Insurance"};
        System.out.println(Arrays.toString(typesOfInsurance) );
        List<String> listOfProducts =new ArrayList<>( Arrays.asList(typesOfInsurance));
        Collections.reverse(listOfProducts);

        System.out.println(listOfProducts);
        String[] reversed = listOfProducts.toArray(typesOfInsurance); System.out.println("array after reverse: " + Arrays.toString(reversed) );
    }
}
