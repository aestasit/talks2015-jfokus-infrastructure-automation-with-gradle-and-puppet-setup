


database {
  jdbc {
    db = 'petclinic'
    password = 'petclinic'
    user = 'petclinic'
  }
}




environments {

  vagrant {

    sshUser = 'vagrant'
    sshPassword = 'vagrant'
    sshPasswordLogin = true

    database {
      jdbc {
        db = 'prtclinic'
        password = 'petclinic'
        user = 'petclinic'
      }
    }

    servers = [
      '192.168.48.30' : [
        roles: [ 'repository' ]            
      ],
      '192.168.48.10' : [
        roles: [ 'application' ]         
      ],
      '192.168.48.20' : [
        roles: [ 'database' ]            
      ],
    ]

  }

  aws {

    sshUser = 'ubuntu'
    sshKeyFile = 'production.pem'

    database {
    }
     
    servers = [
      '54.154.224.77' : [
        roles: [ 'application' ] 
      ],
      '54.154.126.191' : [
        roles: [ 'database' ]      
      ]
    ]

  }

}


