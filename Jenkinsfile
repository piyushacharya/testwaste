pipeline {
    agent any
    stages {
        stage ('Build') {

            steps {
                withMaven(maven : 'maven_3_5_0') {
                    bat 'mvn clean compile'
                }
            }

        }

        stage ('Test') {

            steps {
                withMaven(maven : 'maven_3_5_0') {
                    bat 'mvn test'
                }
            }
        }

        stage ('Deploy') {
            steps {
                withMaven(maven : 'maven_3_5_0') {
                    echo 'Installing jar to location Thanks!!'
                    bat 'docker build -t an_example .'
                    echo '--------------------------'
                }
            }
        }
    }
}
