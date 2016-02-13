object start{
import akka.actor._
case class ProcessRequest(val name:String)
case class SchedulingDetails(val id:String,val karra:ProcessRequest)


class Scheduler extends Actor{
val REFRESH="refresh"
val processRequest1=ProcessRequest("name1")
val processRequest2=ProcessRequest("name2")
val processRequest3=ProcessRequest("name3")

def receive={
case REFRESH =>
val schedulingDetails=List(SchedulingDetails("1",processRequest1),SchedulingDetails("2",processRequest2),SchedulingDetails("3",processRequest3))
schedulingDetails map{details=>
self ! SchedulingDetails(details.id,details.karra)
}

case SchedulingDetails(id,karra)=>
println("#####id####"+id)
println("#####karra####"+karra)

}


}

object Main extends App {
println("#######################")
// an actor needs an ActorSystem
val system = ActorSystem("HelloSystem")
// create and start the actor
val helloActor = system.actorOf(Props[Scheduler], name = "helloactor")
// send the actor two messages
helloActor ! "refresh"
//helloActor ! "buenos dias"
// shut down the system
system.shutdown
}
}
