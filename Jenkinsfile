// Jenkinsfile (Declarative Pipeline)
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building...Hola y adios con WebHook 2'
                script {
                    scripts=load "lib/cowsay.groovy"
                    msg = "¡Hola Mundo!"
                    cs = new cowsay()
                    cs.main(msg)

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