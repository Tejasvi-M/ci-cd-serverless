# ci-cd-serverless
Files:

**Pipeline_Script.groovy** - Jenkins pipeline code, clones the repo and changes the environment value in the serverless.yaml file based on the input paramater. This is a parameterized job with 'env' as the variable.
**app.py** - Simple python program that will be deployed on AWS Lambda.
**serverless.yml** - Configuration file based on which the deployment is done on AWS Lambda.
**requirements.txt** - dependency file for python. Mentions the version of flask framework.
