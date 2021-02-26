pipeline {
    agent any

    stages {
        stage('Git clone') {
            steps {
                git 'https://github.com/Tejasvi-M/ci-cd-serverless'

            }

        }
        
        stage('Replace environment variable'){
            steps{
                sh("sed -i 's/ *stage:.*/  stage: $env/g' serverless.yml")
            }
        }
        
        stage('Deploy'){
            steps{
                sh("sls deploy")
            }
        }
    }
}
