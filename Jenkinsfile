pipeline {
  agent any
  stages {
    stage('Project my-third-project') {
      steps {
        checkout([
          $class: 'GitSCM', 
          branches: [[name: '**/third-branch-1']],
          userRemoteConfigs: [[url: 'https://github.com/UserNotExist12/my-third-project.git', credentialsId: 'baolin-github']],
          extensions: [[$class: 'RelativeTargetDirectory', relativeTargetDir: 'my-third-project']]
        ])
        sh 'export'
        sh 'pwd'
      }
    }
    stage('Project my-second-project') {
      steps {
        checkout([
          $class: 'GitSCM', 
          branches: [[name: '**/master']],
          userRemoteConfigs: [[url: 'https://github.com/UserNotExist12/my-second-project.git', credentialsId: 'baolin-github']],
          extensions: [[$class: 'RelativeTargetDirectory', relativeTargetDir: 'my-second-project']]
        ])
        sh 'export'
        sh 'pwd'
      }
    }
    stage('Project chengdu_shangbao_test') {
      steps {
        checkout([
          $class: 'GitSCM', 
          branches: [[name: '**/cd-branch-1']],
          userRemoteConfigs: [[url: 'https://github.com/UserNotExist12/chengdu_shangbao_test.git', credentialsId: 'baolin-github']],
          extensions: [[$class: 'RelativeTargetDirectory', relativeTargetDir: 'chengdu_shangbao_test']]
        ])
        sh 'export'
        sh 'pwd'
      }
    }
  }
}
