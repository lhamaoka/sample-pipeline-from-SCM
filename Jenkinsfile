// Jenkinsfile (Declarative Pipeline)
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building...Hola y adios con WebHook 2'
                script {
                    def scripts=load "lib/cowsay.groovy"
                    def msg = "¡Hola Mundo!"
                    scripts.template(msg)   

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