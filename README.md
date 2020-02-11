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
    1. Create AWS credential file with aws_access_key_id and aws_secret_access_key
    2. Build docker with command "build --build-arg AWS_CREDENTIAL_FILE={file_path} -t {image_name} ."
    3. Run docker
    4. Subscribe topic with endpoint http://dockerhost/topic-subscriber
    5. Test publish message to the topic with raw format
    6. Received message should be logged to the console