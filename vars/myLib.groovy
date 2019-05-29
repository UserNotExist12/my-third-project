def call() {
    echo 'in custom lib'
    sh 'export'
    script {
       def aaa = 1
       echo aaa
    }
}
