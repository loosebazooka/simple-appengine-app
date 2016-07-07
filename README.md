# simple-appengine-app
A very simple appengine application


## Getting Started
- make sure you're using Java 7
- install the Google Cloud SDK https://cloud.google.com/sdk/
- install java appengine components
```
gcloud components install app-engine-java
```
- clone this project
```
git clone https://github.com/loosebazooka/simple-appengine-app
```

### Gradle
- If the plugin is unable to discover the location of the Cloud SDK automatically, specify it in the configuration:
    
    ``` 
    model {
      appengine {
        tools {
          cloudSdkHome = "/path/to/cloud/sdk"
        }
      }
    }
    ```
- You are now ready to run commands
  - Stage : `./gradlew appengineStage`
  - Run : `./gradlew appengineRun`
  - Start : `./gradlew appengineStart`
  - Stop : `./gradlew appengineStop`
  - Deploy : `./gradlew appengineDeploy`
  
### Maven
- If the plugin is unable to discover the location of the Cloud SDK automatically, specify it in the configuration:
```
<plugin>
    <groupId>com.google.cloud.tools</groupId>
    <artifactId>appengine-maven-plugin</artifactId>
    <version>0.1.0-beta</version>
    <configuration>
        <cloudSdkPath>/path/to/cloud/sdk</cloudSdkPath>
    </configuration>
</plugin>
```
- You are now ready to run commands
  - Stage : `mvn appengine:stage`
  - Run : `mvn appengine:run`
  - Start : `mvn appengine:start`
  - Stop : `mvn appengine:stop`
  - Deploy : `mvn appengine:deploy`
