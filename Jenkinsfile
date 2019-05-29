@Library('my-lib') _

def scmVars = null
pipeline {
  agent any
  stages {
    stage('Project my-third-project') {
      steps {
        sh 'mkdir abcd'
        dir('ab' + 'cd') {
          sh 'pwd'
          echo pwd()
        }
        sh 'export'
        sh 'pwd'
        myLib()
      }
    }
    stage('Project my-second-project') {
      steps {
        script {
          scmVars = checkout([
            $class: 'GitSCM', 
            branches: [[name: '**/master']],
            userRemoteConfigs: [[url: 'https://github.com/UserNotExist12/my-second-project.git', credentialsId: 'baolin-github']],
            extensions: [[$class: 'RelativeTargetDirectory', relativeTargetDir: 'my-second-project']]
          ])
          echo scmVars.GIT_BRANCH
          echo scmVars.GIT_LOCAL_BRANCH
          echo scmVars.GIT_URL
          env.DYNAMIC = 'set dynamic var'
          sh 'export DYNAMIC="set by export"'
        }
        sh 'export'
        sh 'pwd'
        echo scmVars.GIT_BRANCH
        script {
          echo scmVars.GIT_BRANCH
        }
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
        script {
          echo scmVars.GIT_BRANCH
        }
      }
    }
  }
}
