pipeline {
    agent any

    tools {
        maven 'Maven 3.9.9'  // Make sure this name matches the Maven version you configured in Jenkins (Manage Jenkins > Global Tool Configuration)
        jdk 'JDK 17'         // Same for JDK
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/rajesh9040/TestNgProject'
            }
        }

      stage('Build and Run Tests') {
    steps {
        script {
            if (isUnix()) {
                sh 'mvn clean test'
            } else {
                bat 'mvn clean test'
            }
        }
    }
}


        stage('Publish Extent Report') {
            steps {
                publishHTML([
                    reportDir: 'test-output/ExtentReports', // Ensure this path is correct after test run
                    reportFiles: 'index.html',
                    reportName: 'Extent Report',
                    keepAll: true,
                    alwaysLinkToLastBuild: true
                ])
            }
        }
    }
}
