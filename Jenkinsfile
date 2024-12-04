pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                echo 'Cloning the repository...'
                git branch: 'main', url: 'https://github.com/Swaros123/pipeline-oct-2024.git'
            }
        }
        stage('Build') {
            steps {
                echo 'Building the project...'
                // Add your build tool commands here, e.g., Maven or npm
                // Example for Maven: sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                echo 'Running tests...'
                // Add your test tool commands here, e.g., JUnit, Jest, etc.
                // Example for npm tests: sh 'npm test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying the application...'
                // Add deployment steps here, e.g., copying files, running deployment scripts
                // Example for SCP: sh 'scp target/*.jar user@server:/path/to/deploy'
            }
        }
    }

    post {
        always {
            echo 'Pipeline execution completed!'
        }
        success {
            echo 'Pipeline executed successfully!'
        }
        failure {
            echo 'Pipeline failed. Check logs for more details.'
        }
    }
}
