# simple-appengine-app
A very simple appengine application


## Getting Started
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
- Add a **`gradle.properties`** file in the base directory with the contents so the build.gradle can resolve the value correctly
    
    ``` 
    cloudSdkHome=/path/to/cloud/sdk
    ```
- You are now ready to run commands
  - Stage : `./gradlew gcpAppStage`
  - Run : `./gradlew gcpAppRun`
  - Start : `./gradlew gcpAppStart`
  - Stop : `./gradlew gcpAppStop`
  - Deploy : `./gradlew gcpAppDeploy`
  
