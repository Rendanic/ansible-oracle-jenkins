
job('ansible-oracle-jobs') {
  scm {
    git('https://github.com/Rendanic/ansible-oracle-jenkins.git')
  }
  steps {
    dsl {
      external('ansible-oracle/test.groovy')
    }
  }
}