multibranchPipelineJob('ansible-oracle-dbfs-full') {
  branchSources {
    git {
        id('123000001') // IMPORTANT: use a constant and unique identifier
        remote('https://github.com/Rendanic/ansible-oracle-inventory.git')
    }
  }
  orphanedItemStrategy {
    discardOldItems {
        numToKeep(20)
    }
  }
  factory {
    workflowBranchProjectFactory {
        scriptPath('jenkins/run_playbook/Jenkinsfile')
        sandbox()
    }
  }
}
