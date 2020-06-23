#!/usr/bin/env groovy

def call(Boolean skip = false) {
  echo "Skip tests? $skip"
  if (!skip) {
    echo "Executing JUnit tests"
    echo "Trying tags with latest"
    sh './gradlew clean test --no-daemon'
  } else {
    echo "Skipping JUnit tests"
  }
}