pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/felix-src/springboot-app.git'
            }
        }

        stage('Build JAR') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh '''
                eval $(minikube docker-env)
                docker build -t springboot-app:latest .
                '''
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                sh '''
                kubectl apply -f k8s/springboot-deployment.yaml
                kubectl apply -f k8s/springboot-service.yaml
                '''
            }
        }
    }
}
