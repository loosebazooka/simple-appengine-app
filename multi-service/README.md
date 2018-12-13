Multi Module Standard Application

Both service1 and service2 contain an `index.html` and a test endpoint at `/test`
serivce1 contains a special `/modules` that shows you all the modules (hit it at
`localhost:8080/modules`) after running

Gradle
- Run (see service1/build.gradle config)
```
$ ./gradlew service1:appengineRun
```
- Deploy
```
$ ./gradlew appengineDeploy
```

Maven
- Run (see service1/pom.xml config)
```
$ ./mvnw package && ./mvnw -pl service1 appengineRun
```
- Deploy
```
$ ./mvnw -pl service1,service2 package appengineDeploy
```
