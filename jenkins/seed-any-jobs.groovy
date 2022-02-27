job('seed-ansible-oracle-job') {
  scm {
    git{
      remote {
        url('https://github.com/Rendanic/ansible-oracle-jenkins.git') 
      }
      extensions { }
    }
  }
  steps {
    dsl {
      external('ansible-oracle/*.groovy')
    }
  }
}