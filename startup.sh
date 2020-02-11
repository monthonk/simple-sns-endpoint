#!/bin/bash

mkdir -p /root/.aws
{
        echo "[default]"
        echo "aws_access_key_id = ${AWS_ACCESS_KEY_ID}"
        echo "aws_secret_access_key = ${AWS_SECRET_ACCESS_KEY}"
} > /root/.aws/credentials

java -jar /usr/src/app/simple-sns-endpoint-*.jar