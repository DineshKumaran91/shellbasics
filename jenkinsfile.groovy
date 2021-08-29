pipeline {
    agent any

    parameters{
        string(name: 'FirstName',description: 'Enter your first name')
        string(name: 'MiddleName',description: 'Enter your middle name')
        string(name: 'SecondName',description: 'Enter your second name')

    }


    stages {
        stage("echo"){
            steps {
                script {
                    echo "Going to run a shell script:"
                    sh """
                    chmod +x testshell.sh
                    ./testshell.sh "${params.FirstName}" "${params.MiddleName}" "${params.SecondName}"  """
                }

            }
        }
    }
}