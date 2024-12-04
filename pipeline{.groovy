pipeline{
    agent any // agent none // agentt{
        label 'master'
    }
    stages{
        stage('Build'){
            agent {
                label 'slave1'
            }
            steps{

            }
        }
        stage('Test'){
            agent{
                label 'slave12'
            }
            steps{

            }
        }
        stage('Deploy'){
            steps{

            }
        }
    }