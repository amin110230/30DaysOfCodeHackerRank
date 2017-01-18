package Day28RegExPatternsAndIntrotoDatabases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int input = sc.nextInt();
        String str= ".+@gmail\\.com$";
        Pattern pattern=Pattern.compile(str);
        
        List<String> list=new ArrayList();
        
        for (int i = 0; i < input; i++) {
            String firstToken = sc.next();
            
            String email = sc.next();
            Matcher matcher=pattern.matcher(email);
            
            if(matcher.find()){
//                System.out.println(firstToken);
                list.add(firstToken);
            }
        }
        Collections.sort(list);
        for (String name : list) {
            System.out.println(name);
        }
    }
}
