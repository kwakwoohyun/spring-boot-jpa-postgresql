## 스펙

👉 SpringBoot

👉 Logback

👉 Spring profile

👉 JPA

👉 PostgreSQL

👉 OpenJDK 11

👉 Gradle

👉 Pacakge jar

👉 Lombok

👉 Swagger3

## build
```bash
$ SPRING_PROFILES_ACTIVE=local ./gradlew clean build
```

## run
```bash
$ java -jar build/libs/***.jar --spring.profiles.acitve=local
```

### 구조

```
$ tree
.
├── HELP.md
├── README.md
├── build.gradle
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
├── logs
│   ├── api.log
│   └── error-api.log
├── settings.gradle
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── example
    │   │           └── springbootpostgrejpa
    │   │               ├── SpringBootPostgreJpaApplication.java
    │   │               ├── domain
    │   │               │   ├── board
    │   │               │   │   ├── controller
    │   │               │   │   │   └── BoardController.java
    │   │               │   │   ├── domain
    │   │               │   │   │   └── BoardEntity.java
    │   │               │   │   ├── exception
    │   │               │   │   ├── model
    │   │               │   │   │   ├── dto
    │   │               │   │   │   ├── requrest
    │   │               │   │   │   │   └── ReqCreateBoard.java
    │   │               │   │   │   └── response
    │   │               │   │   ├── repository
    │   │               │   │   │   └── BoardRepository.java
    │   │               │   │   └── service
    │   │               │   │       └── BoardService.java
    │   │               │   ├── health
    │   │               │   └── user
    │   │               ├── global
    │   │               │   ├── common
    │   │               │   │   └── GeneralResponse.java
    │   │               │   └── config
    │   │               │       └── SwaggerConfig.java
    │   │               └── infra
    │   └── resources
    │       ├── application.yaml
    │       ├── logback
    │       │   ├── logback-dev.xml
    │       │   ├── logback-local.xml
    │       │   └── logback-prod.xml
    │       ├── static
    │       └── templates
    └── test
        └── java
            └── com
                └── example
                    └── springbootpostgrejpa
                        └── SpringBootPostgreJpaApplicationTests.java

35 directories, 23 files
```

### Swagger

`http://127.0.0.1:18081/api/swagger-ui.html`
