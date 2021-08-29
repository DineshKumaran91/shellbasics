pipeline {
    agent any

    parameters{
        string(name: 'FirstName',Description: 'Enter your first name')
        string(name: 'SecondName',Description: 'Enter your second name')
    }


    stages {
        stage("echo"){
            steps {
                script {
                    echo "Going to run a shell script:"
                    sh """
                    chmod +x testshell.sh
                    ./testshell.sh "${params.FirstName}" "${params.SecondName}" """
                }

            }
        }
    }
}