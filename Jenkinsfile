#!/usr/bin/env groovy
pipeline {
  agent any

  stages {
    stage('Build') {
        steps {
            gradle compileJava compileTestJava
        }
    }
    stage('Test') {
        steps {
            gradle test
        }
    }
    stage('Deploy') {
        steps {
            gradle build -x test
        }
    }
  }
}