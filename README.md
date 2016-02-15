------------------------------------------------------------------------------------------------------------------------------------------------
# [Microservice](https://rklicksolutions.wordpress.com/?p=554&preview=true)
------------------------------------------------------------------------------------------------------------------------------------------------

Modern functional applications architecture requires slew of silo pieces working collectively in harmony  based on “PnP (Plug n Play)” architecture. Enterprise leans towards fluid, functional and scalable applications paradigm utilizing  “Micro Service Architecture (MSA)”. MSA implementations help  break large monolothic application tiers into smaller and manageable services. Each MSA have it’s own dedicated and non-blocking process ,communicate over REST and can contain mix-bag of multiple languages with each performing it’s own allocated tasks. One service failure have no impact on others.

Micro-Services Characteristics:

* Developed and deployed independently of other.
* Communicate using REST.
* Each service can be written in different programming languages.
* Each service can use different data storage technologies.
* Ideally each service should perform only one task.

[! MSA approach is influenced by SOA framework benefits and  SOA short falls.]

-----------------------------------------------------------------------
### Now Play
-----------------------------------------------------------------------
* The Github code for the project is at : [microservice](https://github.com/rklick-solutions/microserives)
* Clone the project into local system
* To run the Play framework 2.4.x, you need JDK 8 or later
* Execute `sbt clean compile` to build the product
* Execute `s run` to execute the product
* microservice should now be accessible at localhost:9000

We are running this service on port 9000 but you can run it on any port. 

