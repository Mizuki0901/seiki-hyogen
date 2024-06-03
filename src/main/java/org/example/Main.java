package org.example;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    Map<String, String> birthdaymap = new HashMap<>();
    birthdaymap.put("ジョン", "1990-01-01");
    birthdaymap.put("田中", "1995-05-02");
    birthdaymap.put("Abbie", "1998-05-29");
    birthdaymap.put("Isabel", "2002-11-22");
    birthdaymap.put("ごとう", "1998-01-31");
    birthdaymap.put("Bell", "1991-07-21");
    birthdaymap.put("スミス", "1989-10-28");
    birthdaymap.put("Brown", "2000-12-01");
    birthdaymap.put("伊藤", "1993-08-21");
    birthdaymap.put("ミラー", "2010-02-03");
    birthdaymap.put("Taylor", "2004-09-30");
    birthdaymap.put("こばやし", "1995-07-17");
    birthdaymap.put("トーマス", "2012-04-15");
    birthdaymap.put("Martin", "1999-12-13");
    birthdaymap.put("ホワイト", "2015-05-29");
    birthdaymap.put("Lee", "1990-01-17");
    birthdaymap.put("佐藤", "2006-08-27");
    birthdaymap.put("山田", "平成４年3月2日");
    birthdaymap.put("ウィルソン", "2007-09-01");
    birthdaymap.put("Perez", "2000-08-30");
    birthdaymap.put("Hall", "2018-07-24");
    birthdaymap.put("なかむら", "2012-02-13");
    birthdaymap.put("キング", "1995-09-27");
    birthdaymap.put("Baker", "2019-10-08");
    birthdaymap.put("Nelson", "1990-01-20");
    birthdaymap.put("Hill", "2004-06-01");
    birthdaymap.put("ミカエル", "1988-04-21");
    birthdaymap.put("やすだ", "1999-11-29");
    birthdaymap.put("Morris", "2003-12-04");
    birthdaymap.put("A", "1111-11-11");

    //文字を抜き出す
    List nameList = birthdaymap.keySet().stream()
        .filter(s -> s.matches("[ーa-zA-Z\\u4E00-\\u9FFFぁ-んァ-ヶ]+"))
        .collect(Collectors.toList());
    System.out.println("文字: " + nameList);

    //日本語を抜き出す
    List JapaneseList = birthdaymap.keySet().stream()
        .filter(s -> s.matches("[ー\u4E00-\u9FFFぁ-んァ-ヶ]+"))
        .collect(Collectors.toList());
    System.out.println("日本語: " + JapaneseList);

    //連続した数字（日付）を抜き出す
    List birthdaylist = birthdaymap.values().stream()
        .filter(s -> s.matches("\\d+-\\d+-\\d+"))
        .collect(Collectors.toList());
    System.out.println("連続した数字: " + birthdaylist);

    //大文字だけ抜き出す
    String input = birthdaymap.toString();
    String regex = "[A-Z]";

    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(input);

    while (matcher.find()) {
      System.out.println("大文字 : " + matcher.group());
    }


  }

}



