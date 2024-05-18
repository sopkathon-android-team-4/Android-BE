# 1. 서비스 이름과 소개
# 2. API 명세서와 역할 분배 (각자 개발 담당 부분)
# 3. 코드 컨벤션
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
# 5. 프로젝트 폴더링
# 6. ERD 캡쳐 사진
![image](https://github.com/sopkathon-android-team-4/Android-BE/assets/107605573/0a59cf13-ad84-4eab-9236-637dda3d2bee)

