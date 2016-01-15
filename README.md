# StorageServices

Storage Service is a REST web service for routing requests for data sources. It switches the requests to Local Database Service or to Adapter Service. The first service communicates with the database and the second service with the external services.

[API Documentation (apiary)](http://docs.storageservice.apiary.io/)  
[URL of the server (heroku)](https://ss-serene-hamlet-9690.herokuapp.com/sdelab)  

### Install
In order to execute this server locally you need the following technologies (in the brackets you see the version used to develop):

* Java (jdk1.8.0)
* ANT (version 1.9.4)

Then, clone the repository. Run in your terminal:

```
git clone https://github.com/introsde-2015-FinalProject/StorageServices.git && cd StorageServices
```

and run the following command:
```
ant generate
ant install
```

`ant generate` run wsimport against [Local Database Service](https://lds-hidden-taiga-5842.herokuapp.com/ws/people?wsdl), this is the [repository](https://github.com/introsde-2015-FinalProject/LocalDatabaseServices).

### Getting Started
To run the server locally then run:
```
ant start
```