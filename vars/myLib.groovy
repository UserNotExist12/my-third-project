def call() {
    echo 'in custom lib'
    sh 'export'
    script {
       def aaa = 1
       echo aaa.toString()
    }
    def gitUrl = env.GIT_URL
    def gitCommit = GIT_COMMIT
    echo "${gitUrl} - ${GIT_BRANCH} - ${gitCommit}"
}
