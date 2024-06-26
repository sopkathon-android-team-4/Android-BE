# 우리 우수상이라니 완전 럭키비키잖아 😉

## 1. 서비스 이름과 소개
**`서비스명`**
<br>
🍀 **럭키 럭키 체인지 a.k.a. 럭럭체**

**`서비스 설명`**
<br>
🍀 불행한 상황들을 적으면 럭키한 초긍정적 사고로 변환해주는 서비스

**`가치제안`**
<br>
어떠한 상황도 **초긍정적으로 치환**하는 자세를 형성해줄 수 있다.
어느 상황, 어느 감정이 들어도 이를 극복하여 사람들의 **감정 회복 탄력성**을 길러 줄 수 있다.

## 2. API 명세서와 역할 분배 (각자 개발 담당 부분)

### [API 명세서](https://bitter-plane-3af.notion.site/API-212085ba7c4041e7805caae9c0ec5edb?pvs=4)
<img width="1405" alt="image" src="https://github.com/sopkathon-android-team-4/Android-BE/assets/94737768/5add064c-a12f-4a95-a794-92db7825bd70">


| [김혁진](https://github.com/hyukjinKimm) | [나세빈](https://github.com/sebbbin) |
| --- | --- |
|  <img width="400" alt="image" src="https://github.com/sopkathon-android-team-4/Android-BE/assets/94737768/864cf7d9-0a96-489f-9f96-d20d0b68a814">|  <img width="400" alt="image" src="https://github.com/sopkathon-android-team-4/Android-BE/assets/94737768/02b961f5-7b22-438b-895f-cea526928700">|
| 럭키지니 api개발 | 럭키비니 api개발 |

**김혁진**
- aws/rds 세팅
- 멤버 생성 api
- 걱정 저장 api
- 멤버 프로필 조회 api

**나세빈**
- 스프링 초기 세팅
- 스웨거 세팅
- 럭키 메시지 반환 api
- 럭키 체인지 리스트 반환 api

## 3. 코드 컨벤션
### 📌 네이밍 규칙

- lowerCamelCase 사용
    - 클래스, 인터페이스, db스키마의 경우 Upper**CamelCase**
- 함수명 : 동사+명사
    - API와 직결되는 함수는 CRUD 명칭을 앞에 달기
        - ex. Create → create000
              Read → get000 (getUserById, getUsers)
              Update → update000
              Delete → delete000
- 변수명 : 명사+명사 or 형용사+명사
- 명사는 단수로 쓰지 않되 개수를 나타내는 단어 꼭 적어주기
    - ex. 복수 : getUsers() / 단수 : getUser()
    

### 📌  프로젝트 폴더링명

1. 폴더명
    - 소문자 사용
2. 패키지
    - controller
    - service
    - repository

### 📌  그 외 코드 작성 시 유의 사항

- Exception
    - 서비스 로직에 관련된 예외는 서비스 단에서 던지기
    - validation 관련 예외는 컨트롤러 단에서 던지기
- Type Assertion
    - type 지정 필수
        - 변수, 함수 모두
    - 서비스 단에서 스키마와 관련된 변수 및 함수 타입 단언은 경우의 따라 단언을 하지 않을 수 있다.
- 주석 작성 시 띄어쓰기 넣기
    
    ```java
    // 이렇게
    
    /**
     * 여기에 이렇게 합시다
     */
    ```
    

### **들여쓰기 및 띄어쓰기**

- 들여쓰기에는 탭(tab) 대신 **4개의 space**를 사용합니다.
- 클래스 내 변수는 한 줄 공백을 두고 작성합니다.

### 줄바꿈

- 함수 정의가 `**최대 길이를 초과하는 경우**`에는 아래와 같이 줄바꿈합니다.
    
    ```java
    public static UserResponseDto of(Long id, String nickName, Rank userRank, int point, 
    																	int coupon, long interest, int waiting, int finish,
    																	int ready, int delivering, int delivered, 
    																	String address, String phoneNumber) {
    				...
        }
    }
    ```
    

### 함수 네이밍

**Dto명**

UserPostResponse의 형태로 갈 겁니다 ~

```
- Entity명 + Response or Request + Dto
ex) UserResponseDto
```

**메소드명**

```
- HTTPMethod + Entity명
ex) getUsers
```

### 서비스 클래스명

```
- Entity명 + Service
ex) UserSevice
```

### 컨트롤러 클래스명

```
- Entity명 + Controller
ex) UserController
```

그 외 모든 변수명은 **lowerCamelCase** 사용

## 5. 프로젝트 폴더링
<img width="388" alt="image" src="https://github.com/sopkathon-android-team-4/Android-BE/assets/94737768/0635620f-e1c0-443d-b77d-9461151c559d">

## 6. ERD 캡쳐 사진
![image](https://github.com/sopkathon-android-team-4/Android-BE/assets/107605573/f78d0960-0091-4c88-bc64-f5de15d62b1a)


