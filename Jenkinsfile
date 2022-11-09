@Library('shared-liba') _

def SecretValue

pipeline {
  agent {
    kubernetes {
      yaml '''
        apiVersion: v1
        kind: Pod
        metadata:
          labels:
            some-label: some-label-value
        spec:
          volumes:
          - name: dockersock
            hostPath:
              path: /var/run/docker.sock
          containers:
          - name: maven
            image: "maven:3.3.9-jdk-8-alpine"
            command:
            - cat
            tty: true
          - name: docker
            image: docker
            command:
            - cat
            tty: true
            volumeMounts:
            - name: dockersock
              mountPath: "/var/run/docker.sock"
          - name: "git"
            command:
            - "cat"
            image: "alpine/git"
            imagePullPolicy: "IfNotPresent"
            tty: true
        '''
    }
  }
  
  stages {
    stage('Key Vault') {
      options {
        azureKeyVault([[envVariable: 'MY_SECRET', name: 'test-secret', secretType: 'Secret']])
      }
      steps {
          SecretValue = ${MY_SECRET}
          sh "echo ${SecretValue}"
      }
    }
    stage('Print Key Vault Secret') {
      
      steps {
          sh "echo ${SecretValue}"
      }
    }
    stage('Check running containers') {
        steps {
            container('docker') {
                // example to show you can run docker commands when you mount the socket
                sh "pwd"
                sh "ls -l"
                sh 'hostname'
                sh 'hostname -i'
                sh 'docker ps'
            }
        }
    }

    
    stage('Clone repository') {
        steps {
            container('git') {
                sh 'whoami'
                sh 'hostname -i'
                sh 'git clone -b master https://github.com/lvthillo/hello-world-war.git'
            }
        }
    }

    stage('Maven Build') {
        steps {
            container('maven') {
                dir('hello-world-war/') {
                    sh "pwd"
                    sh "ls -l"
                    sh 'hostname'
                    sh 'hostname -i'
                    sh 'mvn clean install'
                    getPomVersion()
                }
            }
        }
    }
  }
}
