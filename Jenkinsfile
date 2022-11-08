// Jenkinsfile (Declarative Pipeline)
pipeline {
    agent any


    stages {
        stage('Build') {
            steps {
                echo 'Building...Hola y adios con WebHook 2'
                msg = "¡Hola Mundo!"
                ootDir = pwd()
                exampleModule = load "${rootDir}@lib/cowsay.groovy"
                exampleModule.main(msg)

            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}