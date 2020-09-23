# kafka-producer


The following should be up(Zoo keeper, Kafka broker server, producer,consumer)

kafka-topics.bat --zookeeper localhost:2181 --list

zookeeper-server-start.bat ..\..\config\zookeeper.properties

kafka-server-start.bat ..\..\config\server.properties


kafka-console-producer.bat --broker-list localhost:9092 --topic library-events

kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic library-events --from-beginning


http://localhost:8080/v1/libraryevent

content-type:application/json

{
  "libraryEventId": null,
  "book": {
    "bookId": 456,
    "bookName": "Kafka Using Spring Boot",
    "bookAuthor": "Dilip"
  }
}
