# Order Tracker App

"Order Tracker App" is a java and angular based web application that can be used to : 
Manage an order
View the Latest Status Of an Order
View the Order Summary 

* Latest Angular version has been used for better performance.
* Angular Router has been used to make this SPA (Single Page Application) for better performance.
* Latest Angular Material components has been used in the application for better user experience. For example sidebar, card, table, and dialog, components etc .   

=======================================================================
  
## Pre-requisites:

Install following before running the app:

* 1. jdk (8.0 used)
* 2. maven (3.3 used)
* 3. NodeJs (10.16.0 LTS used)
* 4. Angular CLI (8.0.0 LTS used)

=======================================================================

## Steps to run the API application server:
Server is runnin on port 9999

* 1. mvn clean install 
* 2. java -jar order-tracker-app-1.0.0-SNAPSHOT.jar


## Note:  if u want to run this jar as docker then follow below instructions:

* 1. docker build -f Dockerfile -t <image_name>
* 2. docker run <image_name>

Sample Endpoint : http://localhost:9999/api/v1/orderstatus/order/198771

============================
## Steps to run the Api Mock server using WireMock : 
Server is running at port 9090

* 1. Open cmd
* 2. Go to <project directory>
* 3. mvn clean install 
* 4. docker-compose up
Sample Endpoint : http://localhost:9090/order/198771

=======================================================================

## Steps to run the UI application server:
ui is running on 4200

* 1. Open cmd
* 2. Go to <project directory>
* 3. npm install
* 4. ng serve --open

## Note: application will execute on http://localhost:4200/