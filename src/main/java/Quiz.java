import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Quiz {

    private static String[] questions= {
        "3, 1, 4, 1, 5",
        "1, 1, 2, 3, 5",
        "1, 4, 9, 16 ,25",
        "2, 3, 5, 7, 11",
        "1, 2, 4, 8, 16"
    };



    private static int score = 0;
    private static List<Integer> indexArr = new ArrayList<>();

    private static int[] answers = {9, 8, 36, 13, 32};

    public static String getQuestions(int i) {
        return questions[i];
    }

    public static String[] getQuestions() {
        return questions;
    }

    public static int getScore() {
        return score;
    }

    public static List<Integer> getIndexArr() {
        return indexArr;
    }

    public static int[] getAnswers() {
        return answers;
    }

    public static int getNum(){
        Random rand = new Random();
        return rand.nextInt(4);

    }
}
