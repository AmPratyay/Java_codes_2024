package programming_pathsala.rough_practice;

import java.util.ArrayList;
import java.util.List;

public class TesterRanNmGen extends RandomNmGen{

    List<Integer> evenNum;

    public void evenInit(){
        super.init();
        List<Integer> tempStore = super.num;
        evenNum = new ArrayList<>();
        for(Integer i : tempStore){
            if(i%2 ==0 && i > 0)
                evenNum.add(i);
        }
        System.out.println(evenNum);
    }

    public static void main(String[] args) {
        TesterRanNmGen testerRanNmGen = new TesterRanNmGen();
        testerRanNmGen.evenInit();
    }
}
