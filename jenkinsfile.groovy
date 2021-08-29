pipeline {
    agent any


    stages {
        stage("echo"){
            steps {
                script {
                    echo "Going to run a shell script:"
                    sh """
                    chmod +x testshell.sh
                    ./testshell.sh Dinesh Kumaran"""
                }

            }
        }
    }
}