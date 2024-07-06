This project demonstrates how a sample data of Reddit posts is transferred using kafka between Mongodb Database and ElasticSearch. Later, Rest APIs are implemented to search data in ES database such that most of the fields are searchable.
Mini Project
Specifications
Ports:
•	Kafka Server: 2181
•	Producer: 9191
•	Consumer: 9292
•	Elastic Search: 9200
Performance Metrics:
•	Time taken for data transfer: 40 seconds
•	Number of entries in MongoDB: 10,066
•	Requests per second (RPS): 251.66
Data Flow
Steps taken to improve time:
•	Instead of getting all documents at once, the Kafka producer fetches the data from the MongoDB database in batches of 500 entries and then transfers it to the consumer.
•	The Kafka consumer applies the same logic by first consuming 500 events and then saving them to an index in Elasticsearch, rather than saving an event after every consume.
