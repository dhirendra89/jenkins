pipeline {
    agent any
    stages {
        stage("clean") {
            step {
                bat "mvn clean"
            }
        }
        stage("Test") {
            step {
                bat "mvn test"
            }
        }
        stage("Package") {
            step {
                bat "mvn package"
            }
        }
    }
}
