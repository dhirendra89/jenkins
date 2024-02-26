pipeline {
    agent any
    stages {
        stage("Clean") {
            steps {
                step {
                    bat "mvn clean"
                }
            }
        }
        stage("Test") {
            steps {
                step {
                    bat "mvn test"
                }
            }
        }
        stage("Package") {
            steps {
                step {
                    bat "mvn package"
                }
            }
        }
    }
}
