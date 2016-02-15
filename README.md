# [Microservice](https://rklicksolutions.wordpress.com/?p=554&preview=true)

Modern functional applications architecture requires slew of silo pieces working collectively in harmony  based on “PnP (Plug n Play)” architecture. Enterprise leans towards fluid, functional and scalable applications paradigm utilizing  “Micro Service Architecture (MSA)”. MSA implementations help  break large monolothic application tiers into smaller and manageable services. Each MSA have it’s own dedicated and non-blocking process ,communicate over REST and can contain mix-bag of multiple languages with each performing it’s own allocated tasks. One service failure have no impact on others.

Micro-Services Characteristics:

1) Developed and deployed independently of other.
2) Communicate using REST.
3) Each service can be written in different programming languages.
4) Each service can use different data storage technologies.
5) Ideally each service should perform only one task.

[! MSA approach is influenced by SOA framework benefits and  SOA short falls.]


#Deployment : microservices

$ sbt "run <PORT>"

