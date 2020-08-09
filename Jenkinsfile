#!/usr/bin/env groovy
pipeline {
  agent any

  stages {
    stage('Clean') {
      steps {
          echo 'Clean..'
      }
    }
    stage('Build') {
        steps {
            echo 'Building..'
        }
    }
    stage('Test') {
        steps {
            echo 'Testing..'
        }
    }
    stage('Deploy') {
        steps {
            echo 'Deploying....'
        }
    }
  }
}