#!/bin/bash

set -e -x

cd source-code
  mvn clean package
cd ..

cp source-code/target/quote-service-0.0.1-SNAPSHOT.jar  build-output/.
