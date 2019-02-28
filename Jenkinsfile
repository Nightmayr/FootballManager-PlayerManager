node {

        withMaven(maven:'maven') {
          stage('Checkout') {
            git url: 'https://github.com/Nightmayr/FootballManager-PlayerManager.git', branch: 'master'
        }
        try{
                stage('Remove') {
                    sh "docker rm -vf player"
                    sh "docker rm -vf mongoclient"
                    sh "docker rm -vf consumer"
                }
        } catch(e) {
                build_ok = false
                echo e.toString()
        }
 
        stage('Build') {
            sh 'mvn package -Dmaven.test.skip=true spring-boot:repackage'
        }
 
        stage('Image') {
            docker.build "player"
        }
 
        stage ('Run') {
            docker.image("player").run('-p 8082:8082 -h player --network football --name player')
        }
 
        stage ('Final') {
            build job: 'mongo-service-pipeline', wait: false
        }
    }
 
}
