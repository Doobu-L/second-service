### Multiple Service Run

Spring boot Server Configuration -> Edit Configuration -> copy configuration -> enviroment -> VM option

-Dserver.port = [port]

Run.

### OR

terminal 

$mvn spring-boot:run -Dspring-boot.run.jvmArguments='-Dserver.port=[port]'

긍께 인스턴스를 각각 다른 포트로 기동할 때 쓰라는겨