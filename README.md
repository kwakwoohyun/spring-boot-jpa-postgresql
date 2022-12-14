## ์คํ

๐ SpringBoot

๐ Logback

๐ Spring profile

๐ JPA

๐ PostgreSQL

๐ OpenJDK 11

๐ Gradle

๐ Pacakge jar

๐ Lombok

๐ Swagger3

## build
```bash
$ SPRING_PROFILES_ACTIVE=local ./gradlew clean build
```

## run
```bash
$ java -jar build/libs/***.jar --spring.profiles.acitve=local
```

### ๊ตฌ์กฐ

```
$ tree
.
โโโ HELP.md
โโโ README.md
โโโ build.gradle
โโโ gradle
โย ย  โโโ wrapper
โย ย      โโโ gradle-wrapper.jar
โย ย      โโโ gradle-wrapper.properties
โโโ gradlew
โโโ gradlew.bat
โโโ logs
โย ย  โโโ api.log
โย ย  โโโ error-api.log
โโโ settings.gradle
โโโ src
    โโโ main
    โย ย  โโโ java
    โย ย  โย ย  โโโ com
    โย ย  โย ย      โโโ example
    โย ย  โย ย          โโโ springbootpostgrejpa
    โย ย  โย ย              โโโ SpringBootPostgreJpaApplication.java
    โย ย  โย ย              โโโ domain
    โย ย  โย ย              โย ย  โโโ board
    โย ย  โย ย              โย ย  โย ย  โโโ controller
    โย ย  โย ย              โย ย  โย ย  โย ย  โโโ BoardController.java
    โย ย  โย ย              โย ย  โย ย  โโโ domain
    โย ย  โย ย              โย ย  โย ย  โย ย  โโโ BoardEntity.java
    โย ย  โย ย              โย ย  โย ย  โโโ exception
    โย ย  โย ย              โย ย  โย ย  โโโ model
    โย ย  โย ย              โย ย  โย ย  โย ย  โโโ dto
    โย ย  โย ย              โย ย  โย ย  โย ย  โโโ requrest
    โย ย  โย ย              โย ย  โย ย  โย ย  โย ย  โโโ ReqCreateBoard.java
    โย ย  โย ย              โย ย  โย ย  โย ย  โโโ response
    โย ย  โย ย              โย ย  โย ย  โโโ repository
    โย ย  โย ย              โย ย  โย ย  โย ย  โโโ BoardRepository.java
    โย ย  โย ย              โย ย  โย ย  โโโ service
    โย ย  โย ย              โย ย  โย ย      โโโ BoardService.java
    โย ย  โย ย              โย ย  โโโ health
    โย ย  โย ย              โย ย  โโโ user
    โย ย  โย ย              โโโ global
    โย ย  โย ย              โย ย  โโโ common
    โย ย  โย ย              โย ย  โย ย  โโโ GeneralResponse.java
    โย ย  โย ย              โย ย  โโโ config
    โย ย  โย ย              โย ย      โโโ SwaggerConfig.java
    โย ย  โย ย              โโโ infra
    โย ย  โโโ resources
    โย ย      โโโ application.yaml
    โย ย      โโโ logback
    โย ย      โย ย  โโโ logback-dev.xml
    โย ย      โย ย  โโโ logback-local.xml
    โย ย      โย ย  โโโ logback-prod.xml
    โย ย      โโโ static
    โย ย      โโโ templates
    โโโ test
        โโโ java
            โโโ com
                โโโ example
                    โโโ springbootpostgrejpa
                        โโโ SpringBootPostgreJpaApplicationTests.java

35 directories, 23 files
```

### Swagger

`http://127.0.0.1:18081/api/swagger-ui.html`
