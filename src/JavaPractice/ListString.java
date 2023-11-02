package JavaPractice;

import java.util.ArrayList;
import java.util.List;

public class ListString {

    List<String> voterList = new ArrayList<>();

    public ListString() {
        voterList.add("v1");
        voterList.add("v2");
        voterList.add("v3");
        voterList.add("v4");
        voterList.add("v5");
        voterList.add("v6");
        voterList.add("v7");
        voterList.add("v8");
        voterList.add("v9");
        voterList.add("v10");
    }

    public static void main(String[] args) {

        ListString listString = new ListString();
        System.out.println(listString.voterList);
        listString.voterList.remove("v1");
        System.out.println(listString.voterList);


    }
}
