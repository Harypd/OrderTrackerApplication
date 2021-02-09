Software Pre-requisite:
==============
Install the below things before running the app:

* 1. jdk8
* 2. maven


Steps to run the application:
=============================
* 1. mvn clean install the app
* 2. java -jar order-tracker-app-1.0.0-SNAPSHOT.jar


The application will run on port http://localhost:8080/api/v1/orderstatus/order/{orderId}.

Sample OrderIds used are : 198771 and 198772
Rest Api Exposed : 
"http://localhost:9999/api/v1/orderstatus/order/198771"


## Note:  if u want to run this jar as docker then follow below instructions:

* docker build -f Dockerfile -t <image_name>
* docker run <image_name>

## Integration With WireMock Mock Server running on port 9090
Mocked Response Endpoint:  http://localhost:9090/order/198771