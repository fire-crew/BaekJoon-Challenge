# [💡BaekJoon Online Judge Challenge](https://github.com/IloveDev-Crew/BaekJoon-Challenge)

[![Maintenance](https://img.shields.io/badge/Maintained%3F-yes-green.svg)](https://github.com/choipureum/CommitChecker/graphs/commit-activity) 
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg?style=flat-square)](http://makeapullrequest.com)
![문의사항](https://img.shields.io/badge/%EB%AC%B8%EC%9D%98%ED%95%98%EA%B8%B0-pooreumsunny%40gamil.com-green)
![Greet everyone](https://github.com/IloveDev-Crew/BaekJoon-Challenge/actions/workflows/Demo.yaml/badge.svg)

알고리즘 공부 및 코딩테스트 대비 오픈소스 백준 풀이 레포지토리입니다. 
본 레포는 스터디 목적으로 만들어졌으며 모든 PR은 환영합니다.

## Language

- [ ] Java
- [ ] Python
- [ ] JavaScript

## 💑 Discussion?

```공지사항```이나 ```QnA``` 및 질의응답은 discussion을 이용해주세요.
<br><br>

# 📄 Contiribute GuideLine

실력이 뛰어나진 않아도 코딩테스트에 붙을 정도의 실력을 가지기 위한 모임입니다. 구글링에 의존하는 것이 아닌 집단지성이 모여 나름 최적의 솔루션을 구하고자 합니다. 
이 레포가 알고리즘에 흥미를 붙일 수 있는 기점이 되려합니다.

*아래 규칙은 tony9402 님의 규칙을 따랐습니다.*

## 📁 Repository Architecture

각 알고리즘에 대한 문제들은은  ```해당 알고리즘 폴더```에서 볼 수 있습니다.  
data_structure에 있는 ```백준 1158번 요세푸스 문제```에 대한 솔루션은 [```/data_structure/1158```](https://github.com/MakeFire/BaekJoon-Challenge/data_structure/1158)에 있습니다.해당 경로에 솔루션 파일이 있습니다.


## 💻 Contribute 에 대한 설명

[아래 기준](#rule)을 맞추어 여러분들의 Solution Code를 main branch로 Pull Request (PR) 해주시면 됩니다 !  
Pull Request에 대한 설명은 [여기](https://wayhome25.github.io/git/2017/07/08/git-first-pull-request-story/)에서 보시면 됩니다.

현재 이 Repo는 코딩테스트를 준비하시는 분들을 위해 만든거라 언어는 ```Java, Python 3, Javascript(Node.js)``` 총 3가지 언어만 허용합니다. 각 언어에 대한 솔루션 파일명과 제출 언어(ex. Java)는 아래만 허용합니다.

| Language | 파일명 및 확장자 | 백준 제출 언어      |
| :------- | :--------------- | :------------------ |
| Python 3 | main.py          | Python 3, PyPy3     |
| Java     | Main.java        | Java 8, Java 11     |
| Node.js  | main.js          | node.js             |

## Rule

❗️ 주의 ❗️
### 필수 - 반드시 아래 규칙들을 지켜주세요. 위배되는 솔루션 코드가 있으시 Reject 됩니다.

**해당 규칙은 추가, 수정, 삭제가 될 수 있습니다.**
- Rule 0 : 본 스터디원은 ❗️<code>주 3회</code>의 PR 의무가 있습니다. Discussion이나 QnA는 환영입니다. issue를 통해 각종 정보 PR도 환영합니다.
- Rule 1 : 다른 사람의 솔루션을 자신이 푼 것처럼 Pull Request (PR) 하시면 **절대❗️** 안됩니다.
- Rule 2 : 아래와 같이 솔루션 맨 위에 정보를 **반드시** 넣어주세요. (Authored By에는 백준 닉네임으로 넣어야 합니다.)

```java
// Authored by : choipureum
// Co-authored by : -
// Link : http://boj.kr/3ee3d9284f2e4fd7b92b2a22e17d02d6
```

- Rule 3 : Pull Request (PR) 하나 당 솔루션 하나만 있어야 합니다. 같은 문제여도 언어마다 다르게 PR을 보내야 합니다. 이는 관리의 편의성을 위해 적용합니다.
- Rule 4 : `Allow edits by maintainers` 옵션을 허용으로 둬야합니다.
- Rule 5 : 분류에 맞는 솔루션을 올려야 합니다.
- Rule 6 : 분류에 없을시 구분 폴더를 생성후 만들어 주세요.
- Rule 7 : Commit시 Message는 ```Add [풀이번호] [언어] solution``` 으로 통일합니다.
- Rule 8 : 같은 문제풀이가 있을시 좋은 효율의 코드를 우선합니다.

#### Python

- Rule 15 : 입력시 [해당 코드](http://boj.kr/e94b3c2e8dce4332b75806ff58c2981d) 처럼 input 함수를 만들어 입력을 받아야 합니다.
- Rule 16 : 1 Tab == 4 space, 즉 들여쓰기는 반드시 공백문자 4개로 해야합니다.  

#### Java

- Rule 17 : [해당 코드](http://boj.kr/474912cdad044873b6aa14e34643f7b7) 처럼 FastReader Class를 이용해서 입력을 받아야 합니다.

### 권장 - 수정할 사항이 있으면 제가 직접 수정을 할 수 있습니다. 수정을 할께 있다면 제 닉네임 Co-Author에 추가합니다.

- Rule 18 : 변수와 함수의 이름은 어느 정도 의미하는 바를 드러내면서도 코드가 간결하도록 최대 10 글자 이내로 해주세요.  
  `hap`, `gop`, `gaesan`와 같은 변수명이나 함수명은 사용하지 말아주세요.
- Rule 19 : 한 줄짜리 `if, for, while` 문에는 중괄호를 쓰지 않는 것을 권장합니다.
- Rule 20 : 반복문 안에서 `if` 문에 조건이 많은 경우 `continue, break`를 활용해주세요.  

```cpp
// 이 코드보다 아래있는 코드처럼 작성하시는 걸 권장합니다.
for(int k=0;k<4;k++){
    int qy = y + dy[k];
    int qx = x + dx[k];
    if(0 <= qy && qy < n && 0 <= qx && qx < n) {
        if(Map[qy][qx] != '0') {
            Map[qy][qx] = '0';
            q.push(make_pair(qy, qx));
        }
    }
}

for(int k=0;k<4;k++)
{
    int qy = y + dy[k];
    int qx = x + dx[k];
    
    if(0 <= qy && qy < n && 0 <= qx && qx < n) 
    {
        if(Map[qy][qx] != '0') 
        {
            Map[qy][qx] = '0';
            q.push(make_pair(qy, qx));
        }
    }
}
```
- Rule 21 : 불필요한 연산이 없도록 최대한 정리를 해주세요.
- Rule 22 : 배열은 반드시 전역에 선언해주세요. 배열 사이즈는 엄청 타이트하게 잡지 말고 `+1 ~ +10` 정도로 넉넉하게 잡아주세요.
