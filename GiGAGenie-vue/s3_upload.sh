#!/bin/bash

echo "GiGA Genie service shell script file start!"

# TODO change
# S3 Path
S3_PATH=s3://etri-system-light/

# Build vue project
echo "npm run build"
npm run build

cd dist


# If you want to configure in here, put your keys
# echo "Configure aws cli"
# aws configure set AWS_ACCESS_KEY_ID <your acess key id>
# aws configure set AWS_SECRET_ACCESS_KEY <your secret access key here>
# aws configure set default.region ap-northeast-1


# Upload static web files to S3
# public read option
echo "Now uploading S3"
aws s3 sync . $S3_PATH --grants read=uri=http://acs.amazonaws.com/groups/global/AllUsers

cd ..
