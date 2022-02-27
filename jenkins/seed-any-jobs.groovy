job('seed-ansible-oracle-job') {
  scm {
      git('https://github.com/Rendanic/ansible-oracle-jenkins.git')
  }
  steps {
    dsl {
      external('ansible-oracle/*.groovy')
    }
  }
}