package beakjoon.sort;

import java.util.*;
import java.io.*;

public class Main_1181 { //단어 정렬

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for(int i = 0; i < N; i++){
            arr[i] = br.readLine();

        }

        Arrays.sort(arr, (e1, e2) -> {
            if (e1.length() == e2.length()) {
                return e1.compareTo(e2);
            }
            return e1.length() - e2.length();
        });


        //정렬하고 나면 중복 단어가 바로 옆에 붙어있을 테니까 정렬 먼저 하면 된다.
        String prev = "";
        for (int i = 0; i < N; i++){
            if (prev.equals(arr[i])) continue;
            prev = arr[i];
            bw.write(arr[i]);
            bw.newLine();
        }

        bw.flush();
    }

}

//public class Main_1181 { //단어 정렬
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//
//        List<String> wordList = new ArrayList<>();
//        List<SingleWord> singleWords = new ArrayList<>();
//        for (int i = 0; i < N; i++) {
//            String word = br.readLine();
//            if (!wordList.contains(word)) {
//                wordList.add(word);
//                singleWords.add(new SingleWord(word));
//            }
//        }
//        Collections.sort(singleWords);
//        for (SingleWord singleWord : singleWords) {
//            System.out.println(singleWord.getWord());
//        }
//    }
//
//}
//
//class SingleWord implements Comparable<SingleWord> {
//
//    private String word;
//
//    public String getWord() {
//        return word;
//    }
//
//    public SingleWord(String word) {
//        this.word = word;
//    }
//
//    @Override
//    public int compareTo(SingleWord o) {
//        if (this.word.length() == o.word.length()) {
//            for (int i = 0; i < this.word.length(); i++) {
//                if (this.word.charAt(i) != o.word.charAt(i)) {
//                    return this.word.charAt(i) - o.word.charAt(i);
//                }
//            }
//        }
//        return this.word.length() - o.word.length();
//    }
//}
