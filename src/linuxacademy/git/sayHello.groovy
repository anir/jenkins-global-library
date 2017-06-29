package linuxacademy.git;

class SayHello implements Serializable {

String branch
  def stages

  SayHello(stages) {
    this.branch = stages.env.branch
    this.stages = stages
  }

  def checkout() {
    stages.echo 'checking out code from scm..'
    //checkout scm here, ie. stages.checkout...
  }
}
