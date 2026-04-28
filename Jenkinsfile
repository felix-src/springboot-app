pipeline {
    agent any

    stages {

        stage('Build JAR (Maven Container)') {
            steps {
                script {
                    docker.image('maven:3.9.9-eclipse-temurin-17').inside {
                        sh 'mvn -version'
                        sh 'mvn clean package -DskipTests'
                    }
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t springboot-app .'
            }
        }

        stage('Push to Nexus (Simulated)') {
            steps {
                echo 'Pushing to Nexus (simulation)'
            }
        }
    }
}
