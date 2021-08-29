pipeline {
    agent any


    stages {
        stage("echo"){
            steps {
                script {
                    echo "Going to run a shell script:"
                    sh """
                           ./testshell.sh Dinesh Kumaran"""
                }

            }
        }
    }
}