pipeline {
  agent any
  stages {
    stage('Stage 1') {
      steps {
        checkout([
          $class: 'GitSCM', 
          branches: [[name: '*/master']],
          userRemoteConfigs: [[url: 'https://github.com/UserNotExist12/my-third-project.git', credentialsId: 'baolin-github']],
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
