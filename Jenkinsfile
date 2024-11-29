pipeline {
    agent any
    stages {
        stage('STAGE1') {
            steps {
                sh 'ls -lrt'
                echo "This is STAGE1 of pipeline"
            }
        }

        stage('STAGE2') {
            steps {
                sh 'pwd'
                echo "This is STAGE2 of pipeline"
            }
        }
    }
}

