Simple SNS Endpoint
===================
For testing http endpoint for AWS SNS topic

- How to run on local
    1. Add AWS credentials file with aws_access_key_id and aws_secret_access_key to ~/.aws
    2. Build project with maven
    3. Run the application
    4. Subscribe topic with endpoint http://yourhost:8080/topic-subscriber
    5. Test publish message to the topic with raw format
    6. Received message should be logged to the console
    
- How to run with docker
    1. Pull image from repository with "docker pull monthonk/simple-sns-endpoint"
    2. Run with "docker run -e AWS_ACCESS_KEY_ID={access_key} -e AWS_SECRET_ACCESS_KEY={secret_key} -p 8080:8080 monthonk/simple-sns-endpoint"
    3. Subscribe topic with endpoint http://yourhost:8080/topic-subscriber
    4. Test publish message to the topic with raw format
    5. Received message should be logged to the console