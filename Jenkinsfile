// Jenkinsfile (Declarative Pipeline)
pipeline {
    agent any

    parameters{

    }

    stages {
        stage('Build') {
            steps {
                echo 'Building...Hola y adios con WebHook 2'
                node {
                    def msg = "¡Hola Mundo!"
                    def rootDir = pwd()
                    def exampleModule = load "${rootDir}@lib/cowsay.groovy"
                    exampleModule.main(msg)
                }
                

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