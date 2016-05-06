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
      gcpApp {
        tools {
          cloudSdkHome = "/path/to/cloud/sdk"
        }
      }
    }
    ```
- You are now ready to run commands
  - Stage : `./gradlew gcpAppStage`
  - Run : `./gradlew gcpAppRun`
  - Start : `./gradlew gcpAppStart`
  - Stop : `./gradlew gcpAppStop`
  - Deploy : `./gradlew gcpAppDeploy`
  
### Maven
- If the plugin is unable to discover the location of the Cloud SDK automatically, specify it in the configuration:
```
<plugin>
    <groupId>com.google.cloud.tools</groupId>
    <artifactId>gcp-app-maven-plugin</artifactId>
    <version>0.1.0-SNAPSHOT</version>
    <configuration>
        <cloudSdkPath>/path/to/cloud/sdk</cloudSdkPath>
    </configuration>
</plugin>
```
- You are now ready to run commands
  - Stage : `mvn gcp-app:stage`
  - Run : `mvn gcp-app:run`
  - Start : `mvn gcp-app:start`
  - Stop : `mvn gcp-app:stop`
  - Deploy : `mvn gcp-app:deploy`
