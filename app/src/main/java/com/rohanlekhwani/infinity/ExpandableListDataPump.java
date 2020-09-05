package com.rohanlekhwani.infinity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> q1 = new ArrayList<String>();
        q1.add("Definitely. The problems range from very easy to tough. You are highly encouraged to take part.");


        List<String> q2 = new ArrayList<String>();
        q2.add("Yes. InfInITy is open to everyone both college students and working professionals. Last year the winner was from Google London.");


        List<String> q3 = new ArrayList<String>();
        q3.add("Prizes for global winners are worth INR 10,000 and T-shirts for IIIT Pune winners.");

        List<String> q4 = new ArrayList<String>();
        q4.add("Online on Codechef. InfInITy can be attempted from anywhere using a device of your choice. All you need is an internet connection.");


        expandableListDetail.put(" I'm just a beginner in competitive programming can I take part?", q1);
        expandableListDetail.put(" I'm not in college. Can I take part in InfInITy?", q2);
        expandableListDetail.put(" What are the prizes?", q3);
        expandableListDetail.put("Where is InfInITy taking place?", q4);

        return expandableListDetail;
    }
}
