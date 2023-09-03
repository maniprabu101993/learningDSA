package git.sorting;

import javax.swing.*;
import java.util.*;

public class sortingInfinite {
    public static void main(String[] args) {
        Integer[] A={3,30,34,5,9};
        List<String> list=new ArrayList<>();
        for(int i=0;i<A.length;i++){
            list.add(""+A[i]);
        }
        Collections.sort(list, new customComparator());
        StringBuilder sb=new StringBuilder();
        for(String aaa:list){
            sb.append(aaa);
        }

        System.out.println(sb.toString());
    }

    private static class customComparator
            implements Comparator<String>{

        @Override
        public int compare(String o1, String o2) {
            long first= Long.parseLong(o1+o2);
            long second= Integer.parseInt(o2+o1);
            if(first<second){
                return 1;
            }else if(first>second){
                return -1;
            }
            return 0;
        }
    }
}
