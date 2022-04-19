package appcodilitycom;

public class BinaryGap {

    public static void main(String[] args) {
        System.out.println(solution(4));
    }
    public static  int solution(int N) {
        System.out.println("N = " + N);
        String binaryRepresentation = Integer.toBinaryString(N);
        System.out.println("Binary representation of " + N + " = " + binaryRepresentation);
        boolean oneIsFound = false;
        int binaryGap = 0;
        int sequenceBinaryGap = 0;

        for (char position : binaryRepresentation.toCharArray()) {
            if (position == '1') {
                if (!oneIsFound) {
                    oneIsFound = true;
                    sequenceBinaryGap = 0;
                } else {
                    if (sequenceBinaryGap > binaryGap) {
                        binaryGap = sequenceBinaryGap;
                    }
                    sequenceBinaryGap = 0;
                }
            } else {
                sequenceBinaryGap += 1;
            }
        }

        System.out.println("Binary gap = " + binaryGap);
        return binaryGap;
    }

}