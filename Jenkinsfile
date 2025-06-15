pipeline {
    agent any

    tools {
        Maven 'Maven 3.9.9'  // Match this with your configured Maven version in Jenkins
        jdk 'JDK 17'         // Match this with your configured JDK in Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/rajesh9040/TestNgProject' // Replace with your actual repo URL
            }
        }

        stage('Build and Run Tests') {
            steps {
                sh 'mvn clean test'
            }
        }

        stage('Publish Extent Report') {
            steps {
                publishHTML([
                    reportDir: 'test-output/ExtentReports', // Change to actual folder path if different
                    reportFiles: 'index.html',
                    reportName: 'Extent Report',
                    keepAll: true,
                    alwaysLinkToLastBuild: true
                ])
            }
        }
    }
}
