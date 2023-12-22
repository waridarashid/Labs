import java.util.Comparator;

/**
 * Created by Warida Rashid on 07 Nov 2015.
 */
public class Char_FrequencyComparator implements Comparator<CharNode>{

    @Override
    public int compare(CharNode o1, CharNode o2) {
        if (o1.frequency > o2.frequency){
            return 1;
        }
        else if (o1.frequency < o2.frequency){
            return -1;
        }
        else if (o1.character > o2.character){
            return 1;
        }
        else{
            return -1;
        }
    }
}

