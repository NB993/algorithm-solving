## Longest Common Prefix

배열 내 어떤 단어를 prefix로 시작해도 무관하다.

만약 indexOf(prefix)가 바로 0을 리턴한다면 해당 prefix 단어가 제일 긴 prefix가 된다.
<br>

그렇지 않고 더 짧은 prefix가 배열 내에 존재한다면 prefix단어를 한 글자씩 줄여나가본다.
<br>
줄여나가다 indexOf(prefix)이 0을 리턴하면 그 시점이 가장 긴 prefix이고, 끝까지 0을 리턴하지 못했다면 prefix가 겹치지 않는 단어가 존재하는 것이다.
