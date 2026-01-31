pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Source code checked out'
            }
        }

        stage('Build') {
            steps {
                echo 'Running Maven build'
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Running unit tests'
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo 'Packaging application'
                sh 'mvn package'
            }
        }
    }
}
