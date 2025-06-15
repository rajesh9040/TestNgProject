pipeline {
    agent any

    tools {
        maven 'Maven 3.9.9'  
        jdk 'JDK 17'         
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/rajesh9040/TestNgProject'
            }
        }

        stage('Build and Run Tests') {
            steps {
                bat 'mvn clean test'
            }
        }

        stage('Publish Extent Report') {
            steps {
               publishHTML([
  reportDir: 'target/surefire-reports',
  reportFiles: 'index.html',
  reportName: 'Test Report'
])

            }
        }
    }
}
