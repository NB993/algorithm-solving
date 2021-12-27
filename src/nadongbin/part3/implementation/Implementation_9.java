package nadongbin.part3.implementation;

public class Implementation_9 {

  public static void main(String[] args) {
    int result = solution("abcabcabcabcdededededede");
    System.out.println(result);
  }

  public static int solution(String s) {
    int answer = s.length();

    // '1개 단위(step)부터' 압축 단위를 늘려가며 확인
    for (int step = 1; step < s.length() / 2 + 1; step++) {
      String compressed = "";
      String prev = s.substring(0, step); // 앞에서부터 step만큼의 문자열 추출

      int cnt = 1;

      // 단위(step) 크기만큼 증가시키며 이전 문자열과 비교
      for (int j = step; j < s.length(); j += step) {
        // 이전 상태와 동일하다면 압축 횟수(count)증가
        String sub = "";
        for (int k = j; k < j + step; k++) { //step단어 이후의 문자열을 step길이만큼 만들어냄.
          if (k < s.length()) { //
            sub += s.charAt(k);
          }
        }

        if (prev.equals(sub)) {
          cnt += 1;
        } else { //다른 문자열이 나왔다면(더 이상 압축하지 못하는 경우라면) cnt가 >= 2가 아니면 아직 중복 단어를 못찾은것이니
          //prev에 한글자 더 붙임
          compressed += (cnt >= 2) ? cnt + prev : prev;
          sub = "";
          for (int k = j; k < j + step; k++) {
            if (k < s.length()) sub+= s.charAt(k);
          }
          prev = sub; //다시 상태 초기화
          cnt = 1;
        }
      }
      //남아있는 문자열에 대해서 처리
      compressed += (cnt >= 2)? cnt + prev : prev;
      //만들어지는 압축 문자열이 가장 짧은 것이 정답
      answer = Math.min(answer, compressed.length());
    }
    return answer;
  }
//    int answer = 0;
//    int length = s.length() / 2;
//    String slicedStr = "";
//    Map<String, Integer> foundMap = new HashMap<>();
//    List<String> foundWords = new ArrayList<>();
//
//    while (true) {
//      slicedStr = s.substring(0, length); //찾아낼 중복 문자열을 정한다.
//
//      if (!s.substring(length).contains(slicedStr)) { //만약 못찾으면 한글자만 줄이고 다시 찾아본다.
//        length -= 1;
//        continue;
//      }
//
//      s = s.substring(length * 2);//뒤에서 중복문자열을 찾았으면 앞에 중복문자열 부분을 잘라내고 남은 문자열부터 새로 시작한다.
//      if (foundMap.containsKey(slicedStr)) {
//        foundMap.put(slicedStr, foundMap.get(slicedStr) + 1);//이미 찾은 단어의 카운트를 늘린다
//      } else {
//        foundMap.put(slicedStr, 1);//처음으로 찾은 단어의 카운트 1 등록하고
//        foundWords.add(slicedStr);//단어를 저장한다.
//      }
//      length = s.length() / 2;
//      //두 글자 이상 중복을 더 이상 못찾으면 종료
//      if (length == 0) {
//        break;
//      }
//    }
//
//    StringBuilder sb = new StringBuilder();
//    for (String word : foundWords) {
//      sb.append(foundMap.get(word));
//      sb.append(word);
//    }
//
//
//    return sb.toString().length();
}

