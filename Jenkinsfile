pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                maven(maven : 'maven_3.6.1') {
                    bat 'mvn clean compile'
                }
            }
        }

        stage ('Testing Stage') {

            steps {
                maven(maven : 'maven_3.6.1') {
                    bat 'mvn test'
                }
            }
        }
        
        stage ('Deployment Stage') {
            steps {
                maven(maven : 'maven_3.6.1') {
                    bat 'mvn deploy'
                }
            }
        }
    }
}