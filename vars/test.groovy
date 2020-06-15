#!/usr/bin/env groovy

def call(Boolean skip = false) {
  echo "Skip tests? $skip"
  if (!skip) {
    echo "Executing JUnit tests"
    sh './gradlew clean test --no-daemon'
  } else {
    echo "Skipping JUnit tests"
  }
}