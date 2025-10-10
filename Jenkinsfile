pipeline {
  agent any

  tools {
    jdk 'jdk-21'          // Manage Jenkins → Tools (name must match)
    maven 'maven-3.9'     // Manage Jenkins → Tools (name must match)
  }

  options {
    timestamps()
    ansiColor('xterm')
    buildDiscarder(logRotator(numToKeepStr: '20'))
  }

  parameters {
    choice(name: 'BROWSER', choices: ['chrome','firefox','edge'], description: 'Browser under test')
    string(name: 'BASE_URL', defaultValue: 'https://compare-test.koodoo.io/', description: 'Base URL')
    string(name: 'TESTNG_XML', defaultValue: 'testng.xml', description: 'Suite file path')
  }

  stages {
    stage('Checkout') {
      steps {
        checkout scm
      }
    }

    stage('Build & Test') {
      steps {
        sh """
          mvn -B clean test \
            -Dsurefire.suiteXmlFiles=${TESTNG_XML} \
            -Dbrowser=${BROWSER} \
            -DbaseUrl=${BASE_URL}
        """
      }
    }

    stage('Publish Reports') {
      steps {
        // TestNG/JUnit XML results
        junit allowEmptyResults: true, testResults: 'target/surefire-reports/*.xml'

        // Extent/Custom reports in test-output
        publishHTML([
          reportDir: 'test-output',
          reportFiles: 'ExtentReport_*.html,CustomReport_*.html,KoodooCustomReport_*.html',
          reportName: 'Automation HTML Report',
          keepAll: true,
          alwaysLinkToLastBuild: true,
          allowMissing: true
        ])

        // Archive screenshots and reports
        archiveArtifacts artifacts: 'Screenshots/**/*, test-output/**/*', onlyIfSuccessful: false, allowEmptyArchive: true
      }
    }
  }

  post {
    success { echo '✅ Build passed' }
    failure { echo '❌ Build failed' }
  }
}
