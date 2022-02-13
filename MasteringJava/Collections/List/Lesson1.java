import java.util.List;
import java.util.ArrayList;

class Lesson1{

// practiced List: add(), get(), size();
    static List fibonacci_sequence(int num){

        List<Integer> fibb = new ArrayList<Integer>();
        fibb.add(1);
        fibb.add(1);

        for (int i = 0; i < num - 2; i++){

            fibb.add(fibb.get(fibb.size() - 1) + fibb.get(fibb.size() - 2));
        }

        return (fibb);
    }

    public static void main(String[] args){


    }

}