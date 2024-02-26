pipeline {
    agent any
    stages {
        stage("Clean") {
            bat "mvn clean"
        }
        stage("Test") {
            bat "mvn test"
        }
        stage("Package") {
            bat "mvn package"
        }
    }
}