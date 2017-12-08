pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/ZooLeeCoding/Devops-Levelezo.git'
            }
        }
        stage('Packaging') {
            steps {
                sh './gradlew build'
            }
        }
        stage('Docker Build') {
            steps {
                sh 'docker build -t szaboz/levelezo-example .'
            }
        }
        stage('Docker Push') {
            steps {
                sh 'docker login --username=szaboz --password=$docker_password'
                sh 'docker push szaboz/levelezo-example'
            }
        }
        stage('Deploy to Staging') {
            steps {
                sh 'docker run -d --rm -p 8765:8080 --name levelezo szaboz/levelezo-example'
            }
        }
        stage('Acceptance Test') {
            steps {
                sleep 30
                sh './acceptance_test.sh'
            }
        }
        stage("Deploy to Production") {
			steps {
			    sh "ansible-playbook playbook.yml -i inventory/production"
			}
		}
    }
    post {
        always {
            sh 'docker stop levelezo'
        }
    }
}
