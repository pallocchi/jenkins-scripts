#!/usr/bin/env groovy

def call(Boolean skip = false) {
  if (!skip) {
    echo "Executing JUnit tests"
    sh './gradlew clean test --no-daemon'
  } else {
    echo "Skipping JUnit tests"
  }
}