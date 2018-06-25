Multi Module Standard Application

Gradle
- Run (see service1/build.gradle config)
```
./gradlew service1:appengineRun
```
- Deploy
```
./gradlew appengineDeploy
```

Maven
- Run (see service1/pom.xml config)
```
./mvnw package
./mvnw -pl service1 appengineRun
```
- Deploy
```
./mvnw -pl service1,service2 package appengineDeploy
```
