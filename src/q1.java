import java.util.Arrays;

public class q1 {
    public static void main(String[] args) {
        String[] subject = {"Mathematics","Science","English","Sinhala","History","Buddhisum","Business Studies","Computer Studies"};

        String[] tempArray = new String[subject.length+1];

        for (int i = 0; i < subject.length; i++) {
            tempArray[i] = subject[i];

        }

        tempArray[8]="music";
        subject=tempArray;
        System.out.println(Arrays.toString(subject));


    }

}
