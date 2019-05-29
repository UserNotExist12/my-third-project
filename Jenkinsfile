pipeline {
  agent any
  stages {
    stage('Stage 1') {
      steps {
        checkout([
          $class: 'GitSCM', 
          branches: [[name: '*/master']],
          userRemoteConfigs: [[url: env.SANTABA_REPO, credentialsId: 'baolin-github']],
          extensions: [[$class: 'RelativeTargetDirectory', relativeTargetDir: 'my-third-project']]
        ])
        sh 'export'
      }
    }
    stage('Stage 2') {
      steps {
        sh 'pwd'
      }
    }
  }
}
