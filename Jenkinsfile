// Jenkinsfile (Declarative Pipeline)
@lib/cowsay.groovy
pipeline {
    agent any


    stages {
        stage('Build') {
            steps {
                echo 'Building...Hola y adios con WebHook 2'
                def msg = "¡Hola Mundo!"
                cs = load 'lib/cowsay.groovy'
                cs.main(msg)

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