#!/usr/bin/env groovy

def call(Boolean skip = false) {
  echo "Skip tests? $skip"
  if (!skip) {
    echo "Executing JUnit tests"
    echo "Trying tags with latest"
    echo "Latest was changed!"
    sh './gradlew clean test --no-daemon'
  } else {
    echo "Skipping JUnit tests"
  }
}