pipeline {
    agent any

    stages {
        stage('BuildTest') {
            steps {
            git 'https://github.com/shivamrnc/Hello.git'
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
            bat 'mvn compile'
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
            bat 'mvn test -Dbrowser=localchrome'
                publishHTML([allowMissing: false, alwaysLinkToLastBuild: false, keepAll: false, reportDir: '', reportFiles: 'index.html', reportName: 'HTML Report', reportTitles: '', useWrapperFileDirectly: true])
    
                
                echo 'Deploying....'
            }
        }

        stage('clean'){
            steps{
                            /*** workspace clean up*/
    post {
        always {
            cleanWs()
        }
    } 
            }
        }
      
  
    }
}
