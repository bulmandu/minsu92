### 5번문제
"셀 순환(iteration) 중 좌, 우, 상, 하 모두가 자신보다 깊이가 같거나 크면 현재
셀의 깊이는 1 증가합니다." 이 규칙을 처음 적용시키면 

0 0 0 0 0 0 0 0 0 0
0 0 0 0 1 0 0 0 0 0
0 0 0 1 2 1 0 0 0 0
0 1 1 2 2 2 1 0 0 0
0 1 2 2 2 2 2 1 1 0
0 1 2 2 2 2 2 2 1 0
0 0 1 2 2 2 2 1 0 0
0 0 0 1 2 1 1 0 0 0
0 0 0 0 1 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0

위에 지도를 기준으로 다시 위에 규칙을 적용시키면

0 0 0 0 0 0 0 0 0 0
0 0 0 0 1 0 0 0 0 0
0 0 0 1 2 1 0 0 0 0
0 1 1 2 3 2 1 0 0 0
0 1 2 3 3 3 2 1 1 0
0 1 2 3 3 3 3 2 1 0
0 0 1 2 3 2 2 1 0 0
0 0 0 1 2 1 1 0 0 0
0 0 0 0 1 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0

위에 지도를 기준으로 다시 위에 규칙을 적용시키면

0 0 0 0 0 0 0 0 0 0
0 0 0 0 1 0 0 0 0 0
0 0 0 1 2 1 0 0 0 0
0 1 1 2 3 2 1 0 0 0
0 1 2 3 4 3 2 1 1 0
0 1 2 3 4 3 3 2 1 0
0 0 1 2 3 2 2 1 0 0
0 0 0 1 2 1 1 0 0 0
0 0 0 0 1 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0

최종적으로 적용된 지도입니다.

그러므로
연못 물깊이의 총합 : 64

<!--
**minsu92/minsu92** is a ✨ _special_ ✨ repository because its `README.md` (this file) appears on your GitHub profile.

Here are some ideas to get you started:

- 🔭 I’m currently working on ...
- 🌱 I’m currently learning ...
- 👯 I’m looking to collaborate on ...
- 🤔 I’m looking for help with ...
- 💬 Ask me about ...
- 📫 How to reach me: ...
- 😄 Pronouns: ...
- ⚡ Fun fact: ...
-->
