import java.util.ArrayList;

public class Start1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        for(int i : list){
            if(i%2==0)
                System.out.println(i);
        }
    }
}
