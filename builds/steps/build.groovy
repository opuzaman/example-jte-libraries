//package steps

void call(){
  println "This step builds packages"
  stage("Build Step 1"){
    node('master'){
      sh 'Some bash scripting here'
    }
  }

}
